package com.domain.board.dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.domain.board.dao.MemberDao;
import com.mydomain.vo.Member;

@Repository
public class MemberDaoImpl implements MemberDao {
	public String makeSql(String tagId){
		return "MemberMapper."+tagId;
	}
	@Autowired
	private SqlSessionTemplate session;
	@Override
	public List<Member> selectAllmember() {
		// TODO Auto-generated method stub
		return session.selectList(makeSql("selectAllMember"));
	}

	@Override
	public Member selectMember(Member member) {
		// TODO Auto-generated method stub
		return session.selectOne(makeSql("selectMember"),member);
	}

}
