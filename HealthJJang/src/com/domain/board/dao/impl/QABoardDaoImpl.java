package com.domain.board.dao.impl;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.domain.board.dao.HealthDao;
import com.domain.board.dao.QABoardDao;
import com.domain.common.util.Constants;
import com.mydomain.vo.Board;
import com.mydomain.vo.CodeTable;


//import com.domain.member.vo.Member;
@Repository
public class QABoardDaoImpl implements QABoardDao {
	
	@Autowired
	private SqlSessionTemplate session;
	
	public QABoardDaoImpl(){}
	
	private String makeSql(String tagId){
		return "QABoard."+tagId;
	}
	
	
}











