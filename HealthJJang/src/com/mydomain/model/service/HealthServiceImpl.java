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
import com.domain.common.util.PagingBean;

import com.mydomain.vo.Board;
import com.mydomain.vo.CodeTable;



@Service("service")
public class HealthServiceImpl implements HealthService{

	@Autowired
	private HealthDao dao;
	
	public HealthServiceImpl(HealthDao dao)
	{
		this.dao=dao;
	}
	
	
	@Override
	public List<Board> getMemberList() {
		// TODO Auto-generated method stub
		return dao.selectBoardList();
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
}
