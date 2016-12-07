package com.mydomain.controller;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.mydomain.model.service.HealthService;
import com.mydomain.model.service.MemberService;
import com.mydomain.model.service.ProductService;
import com.mydomain.vo.Board;
import com.mydomain.vo.Code;
import com.mydomain.vo.CodePage;
import com.mydomain.vo.Color;
import com.mydomain.vo.Member;
import com.mydomain.vo.Product;
import com.mydomain.vo.TColor;

@Controller
public class HealthController {
	
	ApplicationContext context=new ClassPathXmlApplicationContext("com/domain/config/applicationContext.xml");
	HealthService service=(HealthService)context.getBean("service");
	
	/*ProductService service2 = (ProductService) context.getBean("productService");*/
	ProductService service2=(ProductService) context.getBean("productService");
	MemberService service3 =(MemberService) context.getBean("MemberService");
	private boolean overlapCheck(int productNo,Product product,ProductService service){ //중복확인 메소드
		product = service.getItemByNo(productNo);
		if(product == null){
			return false;
		}
		return true;
	}//value="/ViewList.do"
	
	
	/*@RequestMapping("findById")
	@ResponseBody //
	
		@ResponseBody : Handler 메소드 선언부에 추가하는 Annotation
		-Handler 메소드가 return 하는 값을 바로 HTTP 응답 body 에 넣어서 응답하도록 처리(View 를 찾니 않는다.)
		-Return 해주는 값을 HTTP 응답 메세지에 맞게 변환해서 출력한다. -> HttpMessageConverter 사용.
		-리턴값의 종류에 따라 다양한 HttpMessageConverter 가 제공됨.
		
		응답메세지로 바꿔주는 아이.
		-JSON 문자열 응답시
			-MappingJackson2HttpMessageConverter 사용.
			-<mvc:annotation-driven/> 선언시 자동으로 등록됨. 단 classpath 상에 Jackson API 가 있는 경우.
			return : VO -> {}
					List/배열 -> []
	
	//이것을 바꿀때 사용하는 API 가 존재하지 않는다 즉 String 은 제공하는데 JSON 은 바꿔주지 않는다.
	//JSONOBject 역할을 하는 역할을 등록 Jackson 사용 --> 메세지 컨버터를 등록해준다. 
	public Member findById(String id) //요청파라미터 조회.
	{
		System.out.println("ID 는 " + id);
		//Business Logic - MemberService.getMemberById(id) 호출
		Member member = service.getMemberById(id);
		System.out.println(member);
		return member;
	} 
	
	@RequestMapping("getList")
	@ResponseBody
	public List getList()
	{
		List list = service.getMemberList();
		System.out.println(list);
		return list;
	}*/
	
	@RequestMapping("/Board/BoardList")
	public ModelAndView getList(String page, ModelMap map, HttpSession session, HttpServletRequest request)
	{
		
		/*List list = service.equals("d");*/
		List list2=service.findBoardCode();
		//System.out.println(list2);
		 
		List list=service.getBoardList();
		
		//map.addAttribute("select", list2);
		session.setAttribute("select",list2);
		//map.addAttribute("BoardList", list);
		//session.setAttribute("BoardList", list);
		
		int pagingno=1;
		
		try{
			pagingno=Integer.parseInt(page);

		}catch(Exception e)
		{}
		
		try{
			Map<String, Object> pagingmap=service.getBoardListPaging(pagingno);
			session.setAttribute("BoardList", pagingmap.get("list"));
			//System.out.println(pagingmap.get("pageBean").toString());
			return new ModelAndView("Board/BoardList.tiles","pageBean",pagingmap.get("pageBean"));
		}catch(Exception e)
		{
			System.out.println("오류얌");
		}
		
		
		//System.out.println(pagingmap.get("list"));
		//System.out.println(pagingmap.get("pagingBean"));
		
		//System.out.println(list);
		//return "/WEB-INF/view/body/Board/BoardList.jsp";
		return new ModelAndView("Board/BoardList.tiles");
		
	}
	
	@RequestMapping(value="/Board/insertSuccess", method= {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView insert(String header, String name, String content, String password, HttpSession session)
	{

		Board board=null;
		
		int no=service.selectCount();
		int count=1;
		

		Date date=new Date(System.currentTimeMillis());
		
		board=new Board(no,header,name,content,date,count,password);
		if(board.getBoard_name()==null||board.getBoard_header()==null||board.getBoard_password()==null)
		{
			System.out.println("오류이다.");
			return new ModelAndView("Board/insert.tiles");
		}else
		{
			System.out.println(board);
			service.insertBoard(board);
		
			session.setAttribute("list", board);

			return new ModelAndView("Board/insertSuccess.tiles");
		}
	
		//return new ModelAndView("downloadView","downFile",fileName)
	}
	
	@RequestMapping("/Board/delete")
	public ModelAndView delete(HttpSession session)
	{
		Board board=(Board)session.getAttribute("list");
		
		System.out.println(board);
		int no=board.getBoard_no();
		int count=service.deleteBoard(no);
		
		System.out.println(no);
		System.out.println(count+":");
		
		return new ModelAndView("BoardList.do");
	}
	
	@RequestMapping("/Board/update")
	public String update(HttpSession session)
	{	
		/*Board board=(Board)session.getAttribute("list");*/
		return "Board/update.tiles";
	}
	
	@RequestMapping("/Board/updateSuccess")
	public ModelAndView updateSuccess(HttpSession session, HttpServletRequest request)
	{
		Board board=(Board) session.getAttribute("list");
		
		int no= board.getBoard_no();
		String header=request.getParameter("header");
		String name=request.getParameter("name");
		String content=request.getParameter("content");
		Date date=new Date(System.currentTimeMillis());
		int count=1;
		String password=request.getParameter("password");
		
		board=new Board(no,header,name,content,date,count,password);
		
		int count1=service.updateBoard(board);
		/*System.out.println(board);
		System.out.println(count1);*/
		session.setAttribute("list", board);
		
		return new ModelAndView("Board/updateSuccess.tiles");
	}
	
	@RequestMapping("/Board/insertList")
	public ModelAndView insertList(String page, ModelMap map,HttpSession session,HttpServletRequest request)
	{
		Board board=null;
		//board = service.selectBoardNo(session.getAttribute("list"));
		
		request.setAttribute("list", board);
		Integer no=new Integer(page);

		int no1=no;
		
		List list=(List)map.get("BoardList");
		//board=(Board) list.get(board_no);
		
		board=service.selectBoardNo(no);
		//map.addAttribute("select", list2);
		service.updateCount(board);
		
		session.setAttribute("list",board);
		
		
		return new ModelAndView("Board/insertSuccess.tiles");
	}
	
	@RequestMapping("/Board/main")
	public String login(HttpSession session)
	{
		session.setAttribute("managerID", "manager");
		session.setAttribute("managerPW", "pw");
		
		System.out.println("새로운 메인이다.");
		return "Board/main.tiles";
	}
	
	@RequestMapping("/Board/mainSuccess")
	public String mangerSuccess(String managerid, String managerpw)
	{
		
		if(managerid.equals("manager"))
		{
			if(managerpw.equals("pw"))
			{
				return "Board/mainSuccess.tiles";
			}
			else
			{
				return "Board/main.tiles";
			}
		}
		else
		{
			return "Board/main.tiles";
		}
	}
	
	@RequestMapping("/Board/updateajax")
	public String updateajax(String updatepassword, HttpSession session, HttpServletRequest request)
	{
		Board board=(Board)session.getAttribute("list");
		System.out.println("기존 PW는 :" + board.getBoard_password());
	
		/*System.out.println(updatepassword);*/
		
		if(board.getBoard_password().equals(updatepassword))
		{
			request.setAttribute("error", "");
			return "Board/update.tiles";
		}else 
		{
			request.setAttribute("error", "비밀번호가 틀렸습니다.");
			System.out.println("비밀번호가 틀렸습니다.");
			return "Board/insertSuccess.tiles";
		}
	}
	
	
	
	//// 채환이꺼
	
	

	@RequestMapping(value={"/ViewList.do","/WEB-INF/view/ViewList.do"})
	public ModelAndView ViewItemList(HttpServletRequest request, HttpServletResponse response,String page1,String code) {
		int page = 1;
		
		try {
			page = Integer.parseInt(request.getParameter("page1"));
		} catch (NumberFormatException e) {
		}
		CodePage codePage = new CodePage(code,page);
		
		Map<String, Object> attributes = service2.list(codePage);
		
		if(attributes.isEmpty()&&attributes.size() == 0){
			System.out.println("error발생");
			return new ModelAndView("/viewItem.do","errorMessage","조회된 값이 없습니다. 물품을 추가해주세요.");
		}
		
		request.setAttribute("result", attributes);
		
		return new ModelAndView("/viewItem.do",attributes);
	}
	
	@RequestMapping("/addItemController.do")
	public ModelAndView addItemController(HttpServletRequest request){
		System.out.println("addItemController");
		List<Code> codeList= service2.selectCodeList();
		System.out.println(codeList);
		List<TColor> colorList = service2.getColor();
		request.setAttribute("colorList", colorList);
		return new ModelAndView("/addItem_form.do","codeList",codeList);
		
	}
	@RequestMapping(value="/addItem.do",method = {RequestMethod.POST,RequestMethod.GET})
	public String addItem(String comment,@RequestParam MultipartFile upImage,
			ModelMap map,HttpServletRequest request,
			String productCategory,String[] color,String[] size,
			String name,String amount,String price,String frame ) throws IllegalStateException, IOException{
		int tAmount = Integer.parseInt(amount);
		int tPrice = Integer.parseInt(price);
		System.out.println(frame);
		
		int productNo = (int) (Math.random() * 9999999) + 1;
		
		/*중복체크*/ 
		Product product = service2.getItemByNo(productNo);
		while (overlapCheck(productNo, product, (ProductService) service2)) {
			productNo = (int) (Math.random() * 10) + 1;
		}

		if(upImage !=null&&!upImage.isEmpty()){
			String fileName = upImage.getOriginalFilename();
		//	String dir = System.getProperty("catalina.home") + "/ect";
			String dir = request.getServletContext().getRealPath("/ect");
			System.out.println(dir);
			File dest = new File(dir, fileName);
			upImage.transferTo(dest);
			
			service2.addItem(new Product(productNo,name,tPrice,productCategory,tAmount,comment,fileName));
			if(color == null){
				service2.addOptionDrunk(new Color(productNo, frame));
			}else if(color !=null&&size == null){
				for(String colorName : color){
					service2.addOptionColor(new Color(colorName, productNo, frame));	
				}
				
			}else if(color !=null&&size !=null){
				for(String colorName : color){	
					for(String sizeName : size){
						service2.addOption(new Color(colorName,productNo,sizeName,frame));
					}
				}	
			}
		
			map.addAttribute("imageName", fileName);
			map.addAttribute("comment",comment);
			}
		
		return "redirect:ViewList.do?code="+productCategory;
		
	}
	@RequestMapping("/ViewOne.do")
	public ModelAndView ViewItemForm(int no){
		Product product = service2.getItemByNo(no);
		List<TColor> colorList = service2.getColor();
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("item", product);
		result.put("colorList", colorList);
		return new ModelAndView("/ViewItemPage.do","result",result);
		
	}
	@RequestMapping("/OrderForm.do")
	@ResponseBody
	public ModelAndView ViewOrderForm(int price,@RequestParam(required=false) String memberNumber,@RequestParam(required=false) String phoneEnd,int amount
			,String productName,String code,String productNo){
		Map<String, Object> result = new HashMap<String, Object>();
		System.out.println(productNo);
		System.out.println(phoneEnd);
		System.out.println(memberNumber);
 
		int pProductNo= Integer.parseInt(productNo);
		if(code.equals("D")){
			code = "운동기구";
		}else if(code.equals("E")){
			code = "운동복";
		}else if(code.equals("F")){
			code = "영양제";
		}
		System.out.println(code);
		if(memberNumber == ""){
			result.put("price", price);
			 result.put("userAmount", amount);
			 result.put("productNo", productNo);
			 result.put("productName", productName);
			 
			 result.put("category", code);
		 
		 service2.amountUpdate(result);
		 	return new ModelAndView("/Order.do","result",result);
		}
		int mNumber = 0;
		try{
			 mNumber = Integer.parseInt(memberNumber);	
		}catch(Exception e){
			return new ModelAndView("/ViewOne.do?no="+pProductNo,"Oerror","숫자만 입력할수있습니다.");
		}
		
		
		System.out.println("----");
		System.out.println(mNumber);
		Member member  =  service3.getMembetByNo(new Member(mNumber,phoneEnd));
		System.out.println(member);
		if(member == null){
			return new ModelAndView("/ViewOne.do?no="+pProductNo,"Oerror","회원번호가 틀렸습니다 다시 입력해주세요.");
		}
		price = (int) Math.round(price*0.8);
		System.out.println(price);
		 result.put("price", price);
		 result.put("userAmount", amount);
		 result.put("productNo", productNo);
		 result.put("productName", productName);
		 //이얍얍
		 result.put("category", code);
		 
		 service2.amountUpdate(result);
		//이얍!
		
		 return new ModelAndView("/Order.do","result",result);
	}
	
	
}










