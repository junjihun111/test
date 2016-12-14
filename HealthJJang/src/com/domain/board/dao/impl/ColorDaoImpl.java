package com.domain.board.dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.domain.board.dao.ColorDao;
import com.mydomain.vo.Color;


@Repository
public class ColorDaoImpl implements ColorDao {
	private String makeSql(String tagId){
		return "ColorMapper."+tagId;
		
	}
	@Autowired
	private SqlSessionTemplate session;
	
	@Override
	public List<Color> selectColorList() {
		// TODO Auto-generated method stub
		return session.selectList(makeSql("selectColorList"));
		
	}

	@Override
	public int insertColor(Color color) {
		// TODO Auto-generated method stub
		return session.insert(makeSql("insertOption"), color);
	}

	@Override
	public int inserColorColor(Color color) {
		// TODO Auto-generated method stub
		return session.insert(makeSql("insertOptionColor"),color);
	}

	@Override
	public int insertColorDrunk(Color color) {
		// TODO Auto-generated method stub
		return session.insert(makeSql("insertOptionDrunk"),color);
	}

	@Override
	public List<Color> selelctColorListByNo(int productNo) {
		// TODO Auto-generated method stub
		return session.selectList(makeSql("selectColorListByNo"),productNo);
	}

	@Override
	public int updateColor(Color color) {
		// TODO Auto-generated method stub
		return session.update(makeSql("updateOption"), color);
	}

	@Override
	public int updateColorColor(Color color) {
		// TODO Auto-generated method stub
		return session.update(makeSql("updateOptionColor"), color);
	}

	@Override
	public int updateColorDrunk(Color color) {
		// TODO Auto-generated method stub
		return session.update(makeSql("updateOptionDrunk"),color);
	}

	@Override
	public int deleteOption(int productNo) {
		// TODO Auto-generated method stub
		return session.delete(makeSql("deleteOption"), productNo);
	}

}
