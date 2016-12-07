package com.domain.board.dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.domain.board.dao.CodeDao;
import com.mydomain.vo.Code;

@Repository
public class CodeDaoImpl implements CodeDao {
	private String makeSql(String taget){
		return "code."+taget;
		
	}
	@Autowired
	private SqlSessionTemplate session;
	@Override
	public List<Code> selectCodeList() {
		// TODO Auto-generated method stub
		return session.selectList(makeSql("selectCodeList"));
	}

	@Override
	public Code selectCodeByCode(String code) {
		// TODO Auto-generated method stub
		return session.selectOne(makeSql("selectCode"),code);
	}

}
