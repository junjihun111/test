package com.domain.board.dao;

import java.util.List;

import com.mydomain.vo.Color;



public interface ColorDao {
 public List<Color> selectColorList();
 public int insertColor(Color color);
 public int inserColorColor(Color color);
 public int insertColorDrunk(Color color);
 public int updateColor(Color color);
 public int updateColorColor(Color color);
 public int updateColorDrunk(Color color);
 public List<Color> selelctColorListByNo(int productNo);
 public int deleteOption(int productNo);
}
