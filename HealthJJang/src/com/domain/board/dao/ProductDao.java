package com.domain.board.dao;

import java.util.List;

import com.mydomain.vo.CodePage;
import com.mydomain.vo.Product;

public interface ProductDao {
	/*
	 * 1-1.물품등록(풀옵션) - insert
	 * 1-2.물품등록(선택옵션) - insert
	 * 2-1.물품수정(풀옵션) - update
	 * 2-2.물품수정(선택옵션) - update
	 * 
	 * 3.물품삭제 - delete
	 * 4.물품전체조회 - selectList
	 * 5.물품PK조회 - selectOne
	 * 6.물품 총개수 - selectCount
	 * 7.게시판 목록의 보여질 게시물들을 page단위로 조회 - selectRownum
	 * 
	 * 
	 * */
	int insertProductWear(Product product);
	int insertProductItem(Product product);
	int insertProduct(Product product);
	int updateProduct(Product product);
	int updateProductItem(Product product);
	int updateProductWear(Product product);
	int deleteProduct(int productNo);
	List<Product> selectProductList();
	Product selectProductByNumber(int no);
	int selectProductCount(String code);
	List<Product> selectProductPageList(CodePage codePage);
	
	
}
