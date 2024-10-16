package com.nonage.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller("NonageController")
public class NonageController {
	
	private static final Logger logger = LoggerFactory.getLogger(NonageController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	
	//홈페이지
	@RequestMapping(value="/Nonage.do" ,method = RequestMethod.GET)
	public ModelAndView Nonage(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String viewName = (String)request.getAttribute("viewName");
		ModelAndView mav = new ModelAndView(viewName);
		return mav;
	}
	
	@RequestMapping(value="/cart_list.do" ,method = RequestMethod.GET)
	public ModelAndView cart(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("cart_list!!!!!!!!!!!!!!!!!");
		return null;
	}
	
	@RequestMapping(value="/mypage.do" ,method = RequestMethod.GET)
	public ModelAndView Mypage(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("mypage!!!!!!!!!!!!!!!!!");
		return null;
	}
	
	@RequestMapping(value="/qna_list.do" ,method = RequestMethod.GET)
	public ModelAndView Qna(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("qna_list!!!!!!!!!!!!!!!!!");
		return null;
	}
	
}

