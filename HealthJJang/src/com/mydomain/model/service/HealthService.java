package com.mydomain.model.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.mydomain.vo.Board;
import com.mydomain.vo.CodeTable;
import com.mydomain.vo.Member;


public interface HealthService {
	

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

}
