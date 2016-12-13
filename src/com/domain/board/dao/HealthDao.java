package com.domain.board.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.mydomain.vo.Board;
import com.mydomain.vo.CodeTable;
import com.mydomain.vo.ManagerInfo;
import com.mydomain.vo.OperatorBoard;
import com.mydomain.vo.QABoard;
import com.mydomain.vo.dagle;



public interface HealthDao {



	int insertBoard(Board board);
	
	public List<CodeTable> selectBoardCode();

	int updateBoardById(Board board);

	Board selectBoardById(int boardNo);
	
	int deleteBoardById(int boardId);
	
	List<Board> selectBoardList();
	
	int selectSequence();	
	
	int updateCount(Board board);
	
	List<Board> selectBoardListPaging(int page);
	
	int selectCountBoard();
	
	int selectCount();
	
	List<Board> selectBoardbyname(String name);
	
	List<Board> selectBoardbypassword(String password);
	
	List<Board> selectListPaging(int page, String option);
	
	List<Board> selectListPagingwriter(int page, String option);
	
	int selectCountBoardname(String name);
	
	int selectCountBoardpassword(String password);
	
	List<ManagerInfo> selectMember();
	
	
	
	//
	
	//댓글 삭제
	int dagledelete(String writer);
	
	int dagleupdate(dagle dag);
	
	
	
	
	//
	List<Board> selectjoin(int page); 
	
	int insertdagle(dagle dag);
	
	List<Board> selectjoinlist(int page);
	
	//공지사항
	List<OperatorBoard> selectoperatorListPaging(int page);
	
	List<OperatorBoard> selectOperatorList();
	
	OperatorBoard selectoperatorById(int boardNo);
	
	int operatorCount(OperatorBoard board);
	
	int operatorselectCount();
	
	int insertoperator(OperatorBoard board);
	
	int deleteoperatorById(int boardId);
	
	int updateoperatorById(OperatorBoard board);
	
	
	//답변게시판 
	
	List<QABoard> QAList();
	
	int insertQA(QABoard qa);
	
	int insertQAdagelupdate(QABoard qa);
	
	List<QABoard> allQAList();
	
	List<QABoard> findgrp(int page);
	
	List<QABoard> selectlvl();
	
}













