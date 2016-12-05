package com.mydomain.model.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.mydomain.vo.Board;
import com.mydomain.vo.CodeTable;


public interface HealthService {
	
	List<Board> getMemberList();

	List<CodeTable> findBoardCode();
	
	int insertBoard(Board board);
	
	int deleteBoard(int boardId); 
	
	int selectSequence();
	
	int updateBoard(Board board);
	
	int updateCount(Board board);
	
	Board selectBoardNo(int boardNo);
	
	Map getBoardListPaging(int page);
	
	int selectCount();
}
