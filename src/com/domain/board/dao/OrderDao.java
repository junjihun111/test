package com.domain.board.dao;

import java.util.List;
import java.util.Map;

import com.mydomain.vo.Order;

public interface OrderDao {
	/*
	 * 1.주문내역등록
	 * 2.주문조인조회
	 * 3.주문삭제
	 * 4.이름과 번호로 주문내역조회
	 * 
	 * 
	 * */
	public int insertOrder(Order order);
	public int deleteOrder(String password);
	public List<Order> selectOrderByNo(String password);
	public List<Order> selectOrderByName(Map<String,String> map);
}
