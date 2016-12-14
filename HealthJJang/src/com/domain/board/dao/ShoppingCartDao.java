package com.domain.board.dao;

import java.util.List;
import java.util.Map;

import com.mydomain.vo.ShoppingCart;

public interface ShoppingCartDao {
/*
 * 1.조회
 * 2.조인조회
 * 3.삭제
 * 4.생성
 * */
	List<ShoppingCart> selectCartList();
	List<ShoppingCart> selectJoinList(Map<String,Object> map);
	int deleteCart(Map<String,Object> map);
	int insertCart(ShoppingCart cart);
	int updateCart(Map<String,Object> map);
	int selectCartCount(Map<String,Object> map);
}
