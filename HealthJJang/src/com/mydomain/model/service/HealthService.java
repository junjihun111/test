package com.mydomain.model.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.mydomain.vo.Board;
import com.mydomain.vo.CodeTable;
import com.mydomain.vo.ManagerInfo;
import com.mydomain.vo.Member;
import com.mydomain.vo.OperatorBoard;
import com.mydomain.vo.QABoard;
import com.mydomain.vo.dagle;


public interface HealthService {

	List<ManagerInfo> selectMember();

	List<Board> getBoardList(); //게시물 전체조회
	List<CodeTable> findBoardCode(); //게시물 카테고리별 조회
	
	int insertBoard(Board board); //게시물 등록
	
	int deleteBoard(int boardId); //게시물 삭제
	
	int selectSequence(); // 시퀀스 조회
	
	int updateBoard(Board board); // 게시물 수정
	
	int updateCount(Board board); // 조회수 갱신
	
	Board selectBoardNo(int boardNo); //게시물 번호로 게시물조회
	
	Map getBoardListPaging(int page); //paging처리
	
	int selectCount(); //전체 갯수 조회
	
	List<Board> selectBoardbyname(String name);
	
	List<Board> selectBoardbypassword(String password);
	
	Map getListPaging(int page,String option);
	
	Map getListPagingwriter(int page,String option);
	
	List<Board> selectjoin(int page); 
	
	int insertdagle(dagle dag);
	
	//
	//답글삭제
	int dagledelete(String writer);
	
	List<Board> selectjoinlist(int page);
	
	int dagleupdate(dagle dag);
	
	int dagledeletepassword(String password);
	
	
	//공지사항
	
	Map selectoperatorListPaging(int page);
	
	List<OperatorBoard> selectOperatorList();
	
	OperatorBoard selectoperatorById(int boardNo);
	
	int operatorCount(OperatorBoard board);
	
	int operatorselectCount(); //전체 갯수 조회
	
	int operatorinsert(OperatorBoard board);

	int deleteoperatorById(int boardId);
	
	int updateoperatorById(OperatorBoard board);
	
	
	//답변
	
	List selectQAList();
	
	int insertQA(QABoard qa);
	
	int insertQAdagelupdate(QABoard qa);
	
	List allQAList();
	
	List<QABoard> findgrp(int page);
	
	List<QABoard> selectlvl();
}
