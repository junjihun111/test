package com.domain.board.dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.domain.board.dao.TColorDao;
import com.mydomain.vo.TColor;

@Repository
public class TColorDaoImpl implements TColorDao {
	private String makeSql(String tagId){
		return "TColorMapper."+tagId;
	}
	@Autowired
	private SqlSessionTemplate session;
	@Override
	public List<TColor> selectTcolor() {
		// TODO Auto-generated method stub
		return session.selectList(makeSql("selectColor"));
	}

}
