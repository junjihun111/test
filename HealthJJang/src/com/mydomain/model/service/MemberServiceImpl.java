package com.mydomain.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.domain.board.dao.MemberDao;
import com.mydomain.vo.Member;
@Service("MemberService")
public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberDao dao;

	@Override
	public List<Member> getMemberList() {
		// TODO Auto-generated method stub
		return dao.selectAllmember();
	}

	@Override
	public Member getMembetByNo(Member member) {
		// TODO Auto-generated method stub
		return dao.selectMember(member);
	}


}
