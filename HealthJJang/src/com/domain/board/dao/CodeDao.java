package com.domain.board.dao;

import java.util.List;

import com.mydomain.vo.Code;



public interface CodeDao {
/*
 * 1.code들을 조회
 * 2.code하나를 조회
 * 
 * */
	public List<Code> selectCodeList();
	public Code selectCodeByCode(String code);
}
