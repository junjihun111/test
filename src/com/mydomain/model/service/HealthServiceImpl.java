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

import com.mydomain.vo.Board;
import com.mydomain.vo.CodeTable;
import com.mydomain.vo.OperatorBoard;



@Service("service")
public class HealthServiceImpl implements HealthService{

	@Autowired
	private HealthDao dao;
	@Autowired
	
	
	
	public HealthServiceImpl(HealthDao dao)
	{
		this.dao=dao;
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
	
	//공지사항 게시판.
	
	public Map selectoperatorListPaging(int page)
	{
		HashMap<String, Object> map = new HashMap<String, Object>();
		List<OperatorBoard> list = dao.selectoperatorListPaging(page);
		map.put("list", list);
		PagingBean pagingBean2 = new PagingBean(dao.selectCountBoard(), page);
		map.put("pageBean2", pagingBean2);
		return map;
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
}
