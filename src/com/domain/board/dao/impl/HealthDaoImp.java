package com.domain.board.dao.impl;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.domain.board.dao.HealthDao;
import com.domain.common.util.Constants;
import com.mydomain.vo.Board;
import com.mydomain.vo.CodeTable;
import com.mydomain.vo.OperatorBoard;


//import com.domain.member.vo.Member;
@Repository
public class HealthDaoImp implements HealthDao {
	
	@Autowired
	private SqlSessionTemplate session;
	
	public HealthDaoImp(){}
	
	private String makeSql(String tagId){
		return "board."+tagId;
	}
	
	/*@Override
	public int insertMember(SqlSession session, Member member) {
		return session.insert(makeSql("insertMember"), member);
	}

	@Override
	public int updateMemberById(SqlSession session, Member member) {
		return session.update(makeSql("updateMemberById"), member);
	}

	@Override
	public int deleteMemberById(SqlSession session, String memberId) {
		return session.delete(makeSql("deleteMemberById"), memberId);
	}

	@Override
	public Member selectMemberById(SqlSession session, String memberId) {
		return session.selectOne(makeSql("selectMemberById"), memberId);
	}

	@Override
	public List<Member> selectMemberByName(SqlSession session, String memberName) {
		return session.selectList(makeSql("selectMemberByName"), memberName);
	}

	@Override
	public List<Member> selectMemberList(SqlSession session) {
		return session.selectList(makeSql("selectMemberList"));
	}

	@Override
	public List<Member> selectMemberByMileageRange(SqlSession session, int startMileage, int endMileage) {
		HashMap param = new HashMap();
		param.put("startMileage", startMileage);
		param.put("endMileage", endMileage);
		return session.selectList(makeSql("selectMemberByMileageRange"), param);
	}
	 *****추가 - page단위 회원목록 조회************* 

	@Override
	public List<Member> selectMemberList(SqlSession session, int page) {
		HashMap param = new HashMap();
		param.put("itemPerPage", Constants.ITEMS_PER_PAGE);
		param.put("page", page);
		return session.selectList(makeSql("selectMemberListPaging"), param);
	}

	@Override
	public int selectCountMember(SqlSession session) {
		return session.selectOne(makeSql("selectCountMember"));
	}*/

	@Override
	public int insertBoard(Board board) {
		// TODO Auto-generated method stub
		return session.insert("insertboard", board);
	}

	@Override
	public List<CodeTable> selectBoardCode() {
		// TODO Auto-generated method stub
		return session.selectList("selectBoardById");
	}

	@Override
	public int updateBoardById(Board board) {
		// TODO Auto-generated method stub
		return session.update(makeSql("updateBoardById"),board);
	}

	@Override
	public Board selectBoardById(int boardNo) {
		// TODO Auto-generated method stub
		return session.selectOne(makeSql("selectlistById"),boardNo);
	}

	@Override
	public List<Board> selectBoardList() {
		// TODO Auto-generated method stub
		return session.selectList(makeSql("selectBoardList"));
	}

	public int selectSequence()
	{
		return session.selectOne(makeSql("selectSequence"));
	}
	
	public int deleteBoardById(int boardId){
		return session.delete(makeSql("deleteBoardById"),boardId);
	}
	
	public int updateCount(Board board)
	{
		return session.update(makeSql("updateCount"),board);
	}
	
	public List<Board> selectBoardListPaging(int page)
	{
		HashMap param=new HashMap();
		param.put("itemPerPage", Constants.ITEMS_PER_PAGE);
		param.put("page", page);
		return session.selectList(makeSql("selectBoardListPaging"),param);
	}
	
	public int selectCountBoard()
	{
		return session.selectOne("selectCountBoard");
	}
	
	public int selectCountBoardname(String name)
	{
		return session.selectOne("selectCountBoardname");
	}
	
	public int selectCountBoardpassword(String password)
	{
		return session.selectOne("selectCountBoardpassword");
	}
	
	public int selectCount()
	{
		return session.selectOne("selectCountBoardCount");
	}
	
	public List<Board> selectBoardbyname(String name)
	{
		return session.selectList(makeSql("selectBoardbyname"),name);
	}
	
	public List<Board> selectBoardbypassword(String password){
		return session.selectList(makeSql("selectBoardbypassword"),password);
	}
	
	public List<Board> selectListPaging(int page, String option)
	{
		HashMap param=new HashMap();
		param.put("itemPerPage", Constants.ITEMS_PER_PAGE);
		param.put("page", page);
		param.put("option", option);
		return session.selectList(makeSql("selectListPaging"),param);
	}
	
	public List<Board> selectListPagingwriter(int page, String option)
	{
		HashMap param=new HashMap();
		param.put("itemPerPage", Constants.ITEMS_PER_PAGE);
		param.put("page", page);
		param.put("option", option);
		return session.selectList(makeSql("selectListPagingwriter"),param);
	}
	
	
	//공지사항
	
	public List<OperatorBoard> selectoperatorListPaging(int page)
	{
		HashMap param=new HashMap();
		param.put("itemPerPage", Constants.ITEMS_PER_PAGE);
		param.put("page", page);
		return session.selectList(makeSql("selectoperatorListPaging"),param);
	}
	
	public List<OperatorBoard> selectOperatorList()
	{
		return session.selectList(makeSql("selectoperatorList"));
	}

	public OperatorBoard selectoperatorById(int boardNo)
	{
		return session.selectOne(makeSql("selectoperatorlistById"),boardNo);
	}
	
	public int operatorCount(OperatorBoard board)
	{
		return session.update(makeSql("operatorupdateCount"),board);
	}
	
	public int operatorselectCount()
	{
		return session.selectOne("selectCountoperator");
	}
	
	public int insertoperator(OperatorBoard board)
	{
		return session.insert("operatorinsertboard",board);
	}
	
	public int deleteoperatorById(int boardId)
	{
		return session.delete(makeSql("deleteoperatorById"),boardId);
	}
	
	public int updateoperatorById(OperatorBoard board)
	{
		return session.update(makeSql("updateoperatorById"),board);
	}
	/*
	public int insertoperator(OperatorBoard board)
	{
		return session.insert(makeSql("operatorinsertboard"));
	}
	
	//안씀
	public List<CodeTable> selectoperatorCode()
	{
		return null;
	}

	public int updateoperatorById(OperatorBoard board)
	{
		return session.update(makeSql("updateoperatorById"));
	}
	
	public int deleteoperatorById(int boardId)
	{
		return session.delete(makeSql("deleteoperatorById"),boardId);
	}
	
	public OperatorBoard selectoperatorById(int boardNo)
	{
		return session.selectOne(makeSql("selectoperatorlistById"),boardNo);
	}
	

	public int operatorselectSequence()
	{
		return session.selectOne(makeSql("operatorselectSequence"));
	}
	
	public int operatorupdateCount(OperatorBoard board){
		return session.update(makeSql("operatorselectCountBoardCount"));
	}
	
	public int operatorselectCountBoard(){
		return session.selectOne(makeSql("selectCountBoardCount"));
	}*/
	
	
	
	
	
}











