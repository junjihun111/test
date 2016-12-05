package com.domain.board.dao;

import java.util.List;

import com.mydomain.vo.Color;



public interface ColorDao {
 public List<Color> selectColorList();
 public int insertColor(Color color);
 public int inserColorColor(Color color);
 public int insertColorDrunk(Color color);
}
