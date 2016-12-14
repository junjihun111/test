package com.domain.board.dao.impl;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.domain.board.dao.OrderationDao;
import com.mydomain.vo.Orderation;
@Repository
public class OrderationDaoImpl implements OrderationDao {
	@Autowired
	private SqlSessionTemplate session;
	
	private String makeSql(String tagId){
		return "orderation."+tagId;
	}
	@Override
	public int insertOrderation(Orderation orderation) {
		// TODO Auto-generated method stub
		return session.insert(makeSql("insertOrderation"),orderation);
	}

	@Override
	public int updateOrderation(Orderation orderation) {
		// TODO Auto-generated method stub
		return session.update(makeSql("updateOrderation"), orderation);
	}

	@Override
	public int updateOrderationCode(Map<String, String> map) {
		// TODO Auto-generated method stub
		return session.update(makeSql("updateOrderationCode"), map);
	}

	@Override
	public int deleteOrderation(String orderationNo) {
		// TODO Auto-generated method stub
		return session.delete(makeSql("deleteOrderation"), orderationNo);
	}

	@Override
	public List<Orderation> selectOrderation() {
		// TODO Auto-generated method stub
		return session.selectList(makeSql("selectOrderation"));
	}

	@Override
	public Orderation selectOrderatinByNo(String orderation) {
		// TODO Auto-generated method stub
		return session.selectOne(makeSql("selectOrderationByNo"),orderation);
	}
	@Override
	public int deleteOrderationCode() {
		// TODO Auto-generated method stub
		return session.delete(makeSql("deleteOrderationCode"));
	}
	@Override
	public int selectOrderationCount(String code) {
		// TODO Auto-generated method stub
		return session.selectOne(makeSql("selectOrdertaionCount"),code);
	}

}
