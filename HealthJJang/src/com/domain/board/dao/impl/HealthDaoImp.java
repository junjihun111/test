package com.domain.board.dao.impl;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.domain.board.dao.HealthDao;
import com.domain.common.util.Constants;
import com.domain.common.util.Constants2;
import com.mydomain.vo.Board;
import com.mydomain.vo.CodeTable;
import com.mydomain.vo.ManagerInfo;
import com.mydomain.vo.OperatorBoard;
import com.mydomain.vo.QABoard;
import com.mydomain.vo.dagle;


@Repository
public class HealthDaoImp implements HealthDao {
	
	@Autowired
	private SqlSessionTemplate session;
	
	public HealthDaoImp(){}
	
	private String makeSql(String tagId){
		return "board."+tagId;
	}
	

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
		return session.selectOne(makeSql("selectCountBoardname"),name);
	}
	
	public int selectCountBoardpassword(String password)
	{
		return session.selectOne(makeSql("selectCountBoardpassword"),password);
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
	
	public List<ManagerInfo> selectMember()
	{
		return session.selectList(makeSql("managerSearchIdPw"));
	}
	
	public List<Board> selectjoin(int page)
	{
		return session.selectList(makeSql("dagleQuery"),page);
	}
	
	public int insertdagle(dagle dag)
	{
		return session.insert(makeSql("dagleinsert"),dag);
	}
	
	//댓글삭제
	
	public int dagledelete(String writer)
	{
		return session.delete(makeSql("dagledelete"),writer);
	}
	
	
	public List<Board> selectjoinlist(int page)
	{
		return session.selectList(makeSql("dagleQuerylist"),page);
	}
	
	public int dagleupdate(dagle dag)
	{
		return session.update(makeSql("dagleupdate"),dag);
	}
	
	public int dagledeletepassword(String password)
	{
		return session.delete(makeSql("dagledeletepassword"),password);
	}
	
	
	
	//공지사항
	
	public List<OperatorBoard> selectoperatorListPaging(int page)
	{
		HashMap param2=new HashMap();
		param2.put("itemPerPageoperator", Constants2.ITEMS_PER_PAGE2);
		param2.put("pageoperator", page);
		return session.selectList(makeSql("selectoperatorListPaging"),param2);
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
	
	
	
	
	//답변
	
	 public List QAList()
	 {
		 return session.selectList("selectQAList");
	 }
	
	 public int insertQA(QABoard qa)
	 {
		 return session.insert("insertQA");
	 }
	 
	 public int insertQAdagelupdate(QABoard qa)
	 {
		 return session.update("insertQAdagelupdate");
	 }
	 
	 public List allQAList()
	 {
		 return session.selectList("allQAList");
	 }
	 
	 public List<QABoard> findgrp(int page)
	 {
		 return session.selectList("selectQAId",page);
	 }
	 
	 public List<QABoard> selectlvl(){
		 return session.selectList("selectlvl");
	 }
	 
}











