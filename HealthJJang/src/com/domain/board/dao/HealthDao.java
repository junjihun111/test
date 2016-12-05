package com.domain.board.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.mydomain.vo.Board;
import com.mydomain.vo.CodeTable;



public interface HealthDao {

	/**
	 * 한 회원의 데이터를 insert하는 메소드
	 * @param session 
	 * @param member insert할 회원정보
	 * @return
	 *//*
	int insertMember(SqlSession session, Member member);
	*//**
	 * 매개변수로 받은 Member객체의 id와 일치하는 회원의 나머지 값들을 update 하는 메소드
	 * @param session
	 * @param member
	 * @return
	 *//*
	int updateMemberById(SqlSession session, Member member);
	*//**
	 * 매개변수로 받은 memberId와 일치하는 member data를 삭제하는 메소드.
	 * @param session
	 * @param memberId
	 * @return
	 *//*
	int deleteMemberById(SqlSession session, String memberId);
	
	*//**
	 * 매개변수로 받은 memberId와 일치하는 member data를 select하는 메소드
	 * @param session
	 * @param memberId
	 * @return
	 *//*
	Member selectMemberById(SqlSession session, String memberId);
	*//**
	 * 매개변수로 받은 memberName과 일치하는 member data들을 select하는 메소드
	 * @param session
	 * @param memberName
	 * @return
	 *//*
	List<Member> selectMemberByName(SqlSession session, String memberName);
	*//**
	 * 모든 member data들을 select하는 메소드
	 * @param session
	 * @return
	 *//*
	List<Member> selectMemberList(SqlSession session);
	
	*//**
	 * 회원 마일리지 범위로 member 들을 select하는 메소드
	 * @param session
	 * @param startMileage
	 * @param endMileage
	 * @return
	 *//*
	List<Member> selectMemberByMileageRange(SqlSession session, int startMileage, int endMileage);
	
	
	 ************************Paging 추가************************* 
	*//**
	 * member data들을 page 단위로 select 하는 메소드.
	 * @param session
	 * @param page 조회할 page 번호
	 * @return
	 *//*
	List<Member> selectMemberList(SqlSession session, int page);
	
	*//**
	 * 총 회원수를 select 하는 메소드
	 * @param session
	 * @return
	 *//*
	int selectCountMember(SqlSession session);*/
	

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
}













