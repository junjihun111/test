package com.domain.board.dao.impl;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.domain.board.dao.ProductDao;
import com.mydomain.vo.CodePage;
import com.mydomain.vo.Product;

@Repository
public class ProductDaoImpl implements ProductDao {
	@Autowired
	private SqlSessionTemplate session;
	private String makeSql(String tagId){
		return "product."+tagId;
	}
	@Override
	public int insertProductWear(Product product) {
		// TODO Auto-generated method stub
		return session.insert(makeSql("insertProductWear"),product);
	}

	@Override
	public int insertProduct(Product product) {
		// TODO Auto-generated method stub
		return session.insert(makeSql("insertProduct"),product);
	}

	@Override
	public int updateProduct(Product product) {
		// TODO Auto-generated method stub
		return session.update(makeSql("updateProduct"),product);
	}

	@Override
	public int updateProductWear(Product product) {
		// TODO Auto-generated method stub
		return session.update(makeSql("updateProductWear"), product);
	}

	
	

	@Override
	public List<Product> selectProductList() {
		// TODO Auto-generated method stub
		return session.selectList(makeSql("selectProductList"));
	}

	@Override
	public Product selectProductByNumber(int no) {
		// TODO Auto-generated method stub
		return session.selectOne(makeSql("selectProductByNo"),no);
	}

	@Override
	public int selectProductCount(String code) {
		// TODO Auto-generated method stub
		return session.selectOne(makeSql("selectCount"),code);
	}

	@Override
	public List<Product> selectProductPageList(CodePage codePage) {
		// TODO Auto-generated method stub
		return session.selectList(makeSql("selectProductpageList"),codePage);
	}
	@Override
	public int deleteProduct(int productNo) {
		// TODO Auto-generated method stub
		return session.delete(makeSql("deleteProduct"),productNo);
	}
	@Override
	public int insertProductItem(Product product) {
		// TODO Auto-generated method stub
		return session.insert(makeSql("insertProductItem"),product);
	}
	@Override
	public int updateProductItem(Product product) {
		// TODO Auto-generated method stub
		return session.update("updateProductItem",product);
	}
	@Override
	public int updateamount(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return session.insert(makeSql("amountUpdate"),map);
	}
	@Override
	public String selectImageName(int no) {
		// TODO Auto-generated method stub
		return session.selectOne(makeSql("selectImageNameByNo"),no);
	}
	@Override
	public int selectProductAmount(String name) {
		// TODO Auto-generated method stub
		return session.selectOne(makeSql("selectAmount"),name);
	}

}
