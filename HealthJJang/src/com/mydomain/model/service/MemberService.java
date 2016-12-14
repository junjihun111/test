package com.mydomain.model.service;

import java.util.List;

import com.mydomain.vo.Member;

public interface MemberService {
//멤버 전체 조회
	List<Member> getMemberList();
//멤버 번호&핸드폰뒷자리번호로 조회
	Member getMembetByNo(Member member);
}
