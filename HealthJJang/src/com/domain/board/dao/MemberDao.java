package com.domain.board.dao;

import java.util.List;

import com.mydomain.vo.Member;


public interface MemberDao {
public List<Member> selectAllmember();
public Member selectMember(Member member);
}
