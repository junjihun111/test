package com.domain.board.dao.impl;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.domain.board.dao.OrderDao;
import com.mydomain.vo.Order;

@Repository
public class OrderDaoImpl implements OrderDao {
	@Autowired
	private SqlSessionTemplate session;
	
	private String makeSql(String tagId){
		return "order."+tagId;
	}
	@Override
	public int insertOrder(Order order) {
		// TODO Auto-generated method stub
		return session.insert(makeSql("insertOrder"), order);
	}

	@Override
	public int deleteOrder(String password) {
		// TODO Auto-generated method stub
		return session.delete(makeSql("deleteOrder"), password);
	}

	@Override
	public List<Order> selectOrderByNo(String password) {
		// TODO Auto-generated method stub
		return session.selectList(makeSql("joinOrderer"),password);
	}
	@Override
	public List<Order> selectOrderByName(Map<String, String> map) {
		// TODO Auto-generated method stub
		return session.selectList(makeSql("selectOrderByName"), map);
	}
	@Override
	public List<Order> selectOrderList() {
		// TODO Auto-generated method stub
		return session.selectList(makeSql("selectOrderList"));
	}
	@Override
	public List<Order> selectOrderCodeList(String code) {
		// TODO Auto-generated method stub
		return session.selectList(makeSql("selectOrderCodeList"), code);
	}

}
