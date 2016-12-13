package com.mydomain.model.service;

import java.util.List;
import java.util.Map;

import com.mydomain.vo.Code;
import com.mydomain.vo.CodePage;
import com.mydomain.vo.Color;
import com.mydomain.vo.Member;
import com.mydomain.vo.Order;
import com.mydomain.vo.Orderation;
import com.mydomain.vo.Product;
import com.mydomain.vo.TColor;



public interface ProductService {
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
	 * 8.코드 전체조회
	 * 9.코드 값조회
	 * 10.색상전체조회
	 * 11.옵션추가
	 * 12.수량 갱신
	 *
	 * 
	 * */
	public void addItem(Product product);
	public void addItemWear(Product product);
	public void addItemItem(Product product);
	public void modifyItem(Product product);
	public void modifyItemWear(Product product);
	public void modifyItemItem(Product product);
	public void removeItem(int productNo);
	public void amountUpdate(Map<String,Object> map);

	public Product getItemByNo(int productNo);

	public Map<String, Object> list(CodePage codePage);
	
	public List<Code> selectCodeList();
	public Code selectCodeByCode(String code);
	
	public List<Color> selectColorList();
	public void addOption(Color color);
	public void addOptionColor(Color color);
	public void addOptionDrunk(Color color);
	public List<TColor> getColor();
	int getItemCount(String code);
	
	public List<Member> getMemberList();
	public Member getMember(Member member);
	public Member getMemberName(int memberNo);
	/*
	 *  13.주문등록
	 * 14.주문수정
	 * 15.주문상태수정
	 * 16.주문삭제
	 * 17.주문전체조회
	 * 18.주문선택조회
	 * */
	public void addOrderation(Orderation orderation);
	public void modifyOrderation(Orderation orderation);
	public void modifyOrderationCode(String code,String orderationNo);
	public void removeOrderaion(String orderationNo);
	public void removeOrderationCode(String code);
	public Map<String, Object> orderationList(CodePage codePage);
	public Orderation getOrderation(String orderationNo);
/*
 *  19.주문등록
 *  20.주문조인조회
 *  21.주문삭제
 * */
	public void addOrder(Order order);
	public void removeOrder(String password);
	public List<Order> getOrder(String password);
	public List<Order> getOrderByName(String password,String orderName);
}
