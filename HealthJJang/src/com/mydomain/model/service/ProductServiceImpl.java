package com.mydomain.model.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.domain.board.dao.CodeDao;
import com.domain.board.dao.ColorDao;
import com.domain.board.dao.MemberDao;
import com.domain.board.dao.OrderDao;
import com.domain.board.dao.OrderationDao;
import com.domain.board.dao.ProductDao;
import com.domain.board.dao.ShoppingCartDao;
import com.domain.board.dao.TColorDao;
import com.domain.common.util.PagingBean;
import com.mydomain.vo.Code;
import com.mydomain.vo.CodePage;
import com.mydomain.vo.Color;
import com.mydomain.vo.Member;
import com.mydomain.vo.Order;
import com.mydomain.vo.Orderation;
import com.mydomain.vo.Product;
import com.mydomain.vo.ShoppingCart;
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
	@Autowired
	private OrderationDao orderationDao;
	@Autowired
	private OrderDao orderDao;
	@Autowired
	private ShoppingCartDao cartDao;
	
	
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

	@Override
	public void addOrderation(Orderation orderation) {
		// TODO Auto-generated method stub
		orderationDao.insertOrderation(orderation);
	}

	@Override
	public void modifyOrderation(Orderation orderation) {
		// TODO Auto-generated method stub
		orderationDao.updateOrderation(orderation);
	}


	@Override
	public void removeOrderaion(String orderationNo) {
		// TODO Auto-generated method stub
		orderationDao.deleteOrderation(orderationNo);
	}

	@Override
	public Map<String, Object> orderationList(CodePage codePage) {
		// TODO Auto-generated method stub
	/*Map<String, Object> result = new HashMap<String, Object>();
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
	 * 
	 * */
		Map<String,Object> result = new HashMap<String,Object>();
		List<Orderation> list = orderationDao.selectOrderation();
		if(list.isEmpty()){
			return result;
		}
		result.put("list", list);
		result.put("pageBean", new PagingBean(orderationDao.selectOrderationCount(codePage.getFrame()),codePage.getPage()));
		result.put("code",codePage.getFrame());
		return result;
	}

	@Override
	public Orderation getOrderation(String orderationNo) {
		// TODO Auto-generated method stub
		return orderationDao.selectOrderatinByNo(orderationNo);
	}

	@Override
	public void modifyOrderationCode(String code, String orderationNo) {
		// TODO Auto-generated method stub
		Map<String,String> map = new HashMap<String,String>();
		map.put("code", code);
		map.put("orderationNo", orderationNo);
		orderationDao.updateOrderationCode(map);
	}

	@Override
	public void removeOrderationCode() {
		// TODO Auto-generated method stub
		orderationDao.deleteOrderationCode();
	}

	@Override
	public void addOrder(Order order) {
		// TODO Auto-generated method stub
		orderDao.insertOrder(order);
	}

	@Override
	public void removeOrder(String password) {
		// TODO Auto-generated method stub
		orderDao.deleteOrder(password);
	}

	@Override
	public List<Order> getOrder(String password) {
		// TODO Auto-generated method stub
		return orderDao.selectOrderByNo(password);
	}

	@Override
	public Member getMemberName(int memberNo) {
		// TODO Auto-generated method stub
		return memberDao.selectNameByMember(memberNo);
	}

	@Override
	public List<Order> getOrderByName(String password, String orderName) {
		// TODO Auto-generated method stub
		Map<String,String> map = new HashMap<String,String>();
		map.put("password", password);
		map.put("orderName", orderName);
		return orderDao.selectOrderByName(map);
	}

	@Override
	public String getImageName(int no) {
		// TODO Auto-generated method stub
		return dao.selectImageName(no);
	}

	@Override
	public List<Order> getOrderList() {
		// TODO Auto-generated method stub
		return orderDao.selectOrderList();
	}

	@Override
	public List<Order> getOrderCodeList(String code) {
		// TODO Auto-generated method stub
		return orderDao.selectOrderCodeList(code);
	}

	@Override
	public int getItemAmount(String name) {
		// TODO Auto-generated method stub
		return dao.selectProductAmount(name);
	}

	@Override
	public List<Color> getColorListByNo(int no) {
		// TODO Auto-generated method stub
		return colorDao.selelctColorListByNo(no);
	}

	@Override
	public void modifyOption(Color color) {
		// TODO Auto-generated method stub
		colorDao.updateColor(color);
	}

	@Override
	public void modifyOptionColor(Color color) {
		// TODO Auto-generated method stub
		colorDao.updateColorColor(color);
	}

	@Override
	public void modifyOptionDrunk(Color color) {
		// TODO Auto-generated method stub
		colorDao.updateColorDrunk(color);
	}

	@Override
	public void removeOption(int productNo) {
		// TODO Auto-generated method stub
		colorDao.deleteOption(productNo);
	}

	@Override
	public List<ShoppingCart> getShoppingList() {
		// TODO Auto-generated method stub
		return cartDao.selectCartList();
	}

	@Override
	public List<ShoppingCart> getJoinShoppingList(String name,String password) {
		// TODO Auto-generated method stub
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("name", name);
		map.put("password", password);
		return cartDao.selectJoinList(map);
	}

	@Override
	public void removeCart(String password,int productNo) {
		// TODO Auto-generated method stub
		Map<String,Object> map = new HashMap<>();
		map.put("password",password );
		map.put("productNo", productNo);
		cartDao.deleteCart(map);
	}

	@Override
	public void addCart(ShoppingCart cart) {
		// TODO Auto-generated method stub
		cartDao.insertCart(cart);
	}

	@Override
	public int getCartCount(String password, String name) {
		// TODO Auto-generated method stub
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("password", password);
		map.put("name", name);
		System.out.println(name);
		return cartDao.selectCartCount(map);
	}

	@Override
	public void modifyCount(String password, String name) {
		// TODO Auto-generated method stub
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("password", password);
		map.put("name", name);
		cartDao.updateCart(map);
	}

	

}
