package com.domain.board.dao.impl;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.domain.board.dao.ShoppingCartDao;
import com.mydomain.vo.ShoppingCart;
@Repository
public class ShoppingCartDaoImpl implements ShoppingCartDao {
	
	private String makeSql(String tagId){
		return "shoppingCart."+tagId;
	}
	
	@Autowired
	private SqlSessionTemplate session;
	
	@Override
	public List<ShoppingCart> selectCartList() {
		// TODO Auto-generated method stub
		return session.selectList(makeSql("selectCartList"));
	}

	@Override
	public List<ShoppingCart> selectJoinList(Map<String,Object> map) {
		// TODO Auto-generated method stub
		return session.selectList(makeSql("selectJoinList"), map);
	}

	@Override
	public int deleteCart(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return session.delete(makeSql("deleteCart"), map);
	}

	@Override
	public int insertCart(ShoppingCart cart) {
		// TODO Auto-generated method stub
		return session.insert(makeSql("insertCart"),cart);
	}

	@Override
	public int updateCart(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return session.update(makeSql("updateCount"), map);
	}

	@Override
	public int selectCartCount(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return session.selectOne(makeSql("CartCount"), map);
	}

}
