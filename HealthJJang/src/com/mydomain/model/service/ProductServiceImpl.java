package com.mydomain.model.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.domain.board.dao.CodeDao;
import com.domain.board.dao.ColorDao;
import com.domain.board.dao.MemberDao;
import com.domain.board.dao.ProductDao;
import com.domain.board.dao.TColorDao;
import com.domain.common.util.PagingBean;
import com.mydomain.vo.Code;
import com.mydomain.vo.CodePage;
import com.mydomain.vo.Color;
import com.mydomain.vo.Member;
import com.mydomain.vo.Product;
import com.mydomain.vo.TColor;



@Service("productService")
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductDao dao;
	@Autowired
	private CodeDao codeDao;
	@Autowired
	private ColorDao colorDao;
	@Autowired
	private TColorDao tColorDao;
	@Autowired
	private MemberDao memberDao;
	
	
	@Override
	public void addItem(Product product) {
		// TODO Auto-generated method stub
		dao.insertProduct(product);
	}

	@Override
	public void addItemWear(Product product) {
		// TODO Auto-generated method stub
		dao.insertProductWear(product);
	}

	@Override
	public void modifyItem(Product product) {
		// TODO Auto-generated method stub
		dao.updateProduct(product);
	}

	@Override
	public void modifyItemWear(Product product) {
		// TODO Auto-generated method stub
		dao.updateProductWear(product);
	}

	@Override
	public void removeItem(int productNo) {
		// TODO Auto-generated method stub
		dao.deleteProduct(productNo);
	}

	@Override
	public Product getItemByNo(int productNo) {
		// TODO Auto-generated method stub
		return dao.selectProductByNumber(productNo);
	}

	@Override
	public int getItemCount(String code) {
		// TODO Auto-generated method stub
		return dao.selectProductCount(code);
	}

	@Override
	public Map<String, Object> list(CodePage codePage) {
		// TODO Auto-generated method stub
		Map<String, Object> result = new HashMap<String, Object>();
		List<Product> list = dao.selectProductPageList(codePage);
		System.out.println(list);
		System.out.println("-------");
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		if(list.isEmpty()){
		
			return result;
		}
		result.put("list",list );
		result.put("pageBean", new PagingBean(dao.selectProductCount(codePage.getFrame()), codePage.getPage()));
		result.put("code", codePage.getFrame());
		return result;
	}

	@Override
	public List<Code> selectCodeList() {
		// TODO Auto-generated method stub
		return codeDao.selectCodeList();
	}

	@Override
	public Code selectCodeByCode(String code) {
		// TODO Auto-generated method stub
		return codeDao.selectCodeByCode(code);
	}

	@Override
	public List<Color> selectColorList() {
		// TODO Auto-generated method stub
		return colorDao.selectColorList();
	}

	@Override
	public void addItemItem(Product product) {
		// TODO Auto-generated method stub
		dao.insertProductItem(product);
	}

	@Override
	public void modifyItemItem(Product product) {
		// TODO Auto-generated method stub
		dao.updateProductItem(product);
	}

	@Override
	public void addOption(Color color) {
		// TODO Auto-generated method stub
		colorDao.insertColor(color);
	}

	@Override
	public void addOptionColor(Color color) {
		// TODO Auto-generated method stub
		colorDao.inserColorColor(color);
	}

	@Override
	public void addOptionDrunk(Color color) {
		// TODO Auto-generated method stub
		colorDao.insertColorDrunk(color);
	}

	@Override
	public List<TColor> getColor() {
		// TODO Auto-generated method stub
		return tColorDao.selectTcolor();
	}

	@Override
	public List<Member> getMemberList() {
		// TODO Auto-generated method stub
		return memberDao.selectAllmember();
	}

	@Override
	public Member getMember(Member member) {
		// TODO Auto-generated method stub
		return memberDao.selectMember(member);
	}

	@Override
	public void amountUpdate(Map<String, Object> map) {
		// TODO Auto-generated method stub
		dao.updateamount(map);
	}

	

}
