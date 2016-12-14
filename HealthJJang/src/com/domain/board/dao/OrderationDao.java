package com.domain.board.dao;

import java.util.List;
import java.util.Map;

import com.mydomain.vo.Orderation;

public interface OrderationDao {
	/*
	 *1.주문등록
	2.주문조회
	3.주문 번호로 조회
	4.주문상태 변경
	5.주문삭제
	6.주문수정 
	 * */
	public int insertOrderation(Orderation orderation);
	public int updateOrderation(Orderation orderation);
	public int updateOrderationCode(Map<String,String> map);
	public int deleteOrderation(String orderationNo);
	public int deleteOrderationCode();
	public List<Orderation> selectOrderation();
	public Orderation selectOrderatinByNo(String orderation);
	public int selectOrderationCount(String code);

}
