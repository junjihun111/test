package com.mydomain.model.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.domain.board.dao.HealthDao;
import com.domain.board.dao.MemberDao;
import com.domain.common.util.PagingBean;
import com.domain.common.util.PagingBean2;
import com.mydomain.vo.Board;
import com.mydomain.vo.CodeTable;
import com.mydomain.vo.ManagerInfo;
import com.mydomain.vo.OperatorBoard;
import com.mydomain.vo.QABoard;
import com.mydomain.vo.dagle;



@Service("service")
public class HealthServiceImpl implements HealthService{

	@Autowired
	private HealthDao dao;
	@Autowired
	
	
	
	public HealthServiceImpl(HealthDao dao)
	{
		this.dao=dao;
	}
	
	public List<ManagerInfo> selectMember()
	{
		return dao.selectMember();
	}
	
	

	public List<CodeTable> findBoardCode()
	{
		return dao.selectBoardCode();
	}

	public int insertBoard(Board board)
	{
		return dao.insertBoard(board);
	}
	
	public int deleteBoard(int boardId)
	{
		return dao.deleteBoardById(boardId);
	}
	
	public int selectSequence()
	{
		return dao.selectSequence();
	}
	
	public int updateBoard(Board board)
	{
		return dao.updateBoardById(board);
	}
	
	public int updateCount(Board board)
	{
		return dao.updateCount(board);
	}
	
	public Board selectBoardNo(int boardNo){
		return dao.selectBoardById(boardNo);
	}
	
	public Map getBoardListPaging(int page)
	{
		HashMap<String, Object> map = new HashMap<String, Object>();
		List<Board> list = dao.selectBoardListPaging(page);
		map.put("list", list);
		PagingBean pagingBean = new PagingBean(dao.selectCountBoard(), page);
		map.put("pageBean", pagingBean);
		return map;
	}
	
	public int selectCount()
	{
		return dao.selectCount();
	}


	@Override
	public List<Board> getBoardList() {
		// TODO Auto-generated method stub
		return dao.selectBoardList();
	}
	
	public List<Board> selectBoardbyname(String name)
	{
		return dao.selectBoardbyname(name);
	}
	
	public List<Board> selectBoardbypassword(String password){
		return dao.selectBoardbypassword(password);
	}
	
	public Map getListPaging(int page,String option)
	{
		HashMap<String, Object> map = new HashMap<String, Object>();
		List<Board> list = dao.selectListPaging(page,option);
		map.put("list", list);
		
		PagingBean pagingBean = new PagingBean(dao.selectCountBoardname(option), page);
		map.put("pageBean", pagingBean);
		return map;
	}
	
	public Map getListPagingwriter(int page,String option)
	{
		HashMap<String, Object> map = new HashMap<String, Object>();
		List<Board> list = dao.selectListPagingwriter(page,option);
		map.put("list", list);
		PagingBean pagingBean = new PagingBean(dao.selectCountBoardpassword(option), page);
		map.put("pageBean", pagingBean);
		return map;
	}
	
	public List<Board> selectjoin(int page)
	{
		return dao.selectjoin(page);
	}
	
	public int insertdagle(dagle dag)
	{
		return dao.insertdagle(dag);
	}
	
	//답글삭제
	public int dagledelete(String writer)
	{
		return dao.dagledelete(writer);
	}
	
	public List<Board> selectjoinlist(int page)
	{
		return dao.selectjoinlist(page);
	}
	
	public int dagleupdate(dagle dag)
	{
		return dao.dagleupdate(dag);
	}
	
	//공지사항 게시판.
	
	public Map selectoperatorListPaging(int page)
	{
		HashMap<String, Object> map2 = new HashMap<String, Object>();
		List<OperatorBoard> list = dao.selectoperatorListPaging(page);
		map2.put("list", list);
		PagingBean2 pagingBean2 = new PagingBean2(dao.operatorselectCount(), page);
		map2.put("pageBean2", pagingBean2);
		return map2;
	}
	
	public List<OperatorBoard> selectOperatorList()
	{
		return dao.selectOperatorList();
	}
	
	public OperatorBoard selectoperatorById(int boardNo)
	{
		return dao.selectoperatorById(boardNo);
	}
	
	public int operatorCount(OperatorBoard board)
	{
		return dao.operatorCount(board);
	}
	
	public int operatorselectCount()
	{
		return dao.operatorselectCount();
	}
	
	public int operatorinsert(OperatorBoard board)
	{
		return dao.insertoperator(board);
	}
	
	public int deleteoperatorById(int boardId)
	{
		return dao.deleteoperatorById(boardId);
	}
	
	public int updateoperatorById(OperatorBoard board)
	{
		return dao.updateoperatorById(board);
	}
	
	
	//답변게시판
	
	
	public List selectQAList()
	{
		return dao.QAList();
	}
	
	public int insertQA(QABoard qa)
	{
		return dao.insertQA(qa);
	}
	
	public int insertQAdagelupdate(QABoard qa)
	{
		return dao.insertQAdagelupdate(qa);
	}
	
	public List allQAList()
	{
		return dao.allQAList();
	}
	
	public List<QABoard> findgrp(int page)
	{
		return dao.findgrp(page);
	}
	
	public List<QABoard> selectlvl()
	{
		return dao.selectlvl();
	}
}
