package com.nonage.member.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nonage.member.service.MemberService;
import com.nonage.member.vo.MemberVO;

@Controller("memberController")
@EnableAspectJAutoProxy
public class MemberControllerImpl implements MemberController {
	private static final Logger logger = LoggerFactory.getLogger(MemberControllerImpl.class);
	@Autowired
	private MemberService memberService;
	@Autowired
	private MemberVO memberVO ;
	
	
//  로그인 폼 기능 구현
	@RequestMapping(value="/member/loginForm.do" ,method = RequestMethod.GET)
	public ModelAndView loginForm(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String viewName = (String)request.getAttribute("viewName");
		ModelAndView mav = new ModelAndView(viewName);
		return mav;
	}


//	로그인 기능 구현
	@Override
	@RequestMapping(value= "/member/login.do"  ,method = RequestMethod.POST)
	public ModelAndView login(@ModelAttribute("member") MemberVO member, HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();  //ModelAndView 생성
		
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		System.out.println("id: " + id);
		System.out.println("pwd: " + pwd);
		
		//MemberVO를 바인딩
		memberVO = memberService.getMember(member);
	
		//세션 객체에 바인딩
		HttpSession session = request.getSession();
		
		//로그인 정보 유효성 체크
		if(memberVO != null) {
			if(memberVO.getPwd().equals(pwd)) {				
				session.setAttribute("loginUser", memberVO);
				
				//페이지 이동
				mav.setViewName("redirect:/Nonage.do");  
			}
		} else {
			mav.setViewName("redirect:/member/loginFail.do");  //로그인 실패 시 페이지 이동
		}
		return mav;
	}
	
//  로그인 실패 기능 구현
	@RequestMapping(value="/member/loginFail.do" ,method = RequestMethod.GET)
	public ModelAndView loginFail(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String viewName = (String)request.getAttribute("viewName");
		ModelAndView mav = new ModelAndView(viewName);
		return mav;
	}
	
	//로그아웃 기능 구현
	@RequestMapping(value="/logout.do" ,method = RequestMethod.GET)
	public ModelAndView logout(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		
		//세션 정보 해제
		HttpSession session = request.getSession(false);
		
		if(session != null) {
			session.invalidate();
		}
		
		mav.setViewName("redirect:/Nonage.do");
		
		return mav;
	}
	
	//contract 기능 구현
	@RequestMapping(value="/member/contract.do" ,method = RequestMethod.GET)
	public ModelAndView contract(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String viewName = (String)request.getAttribute("viewName");
		ModelAndView mav = new ModelAndView(viewName);
		return mav;
	}
	
	//회원 약관 기능 구현
	@RequestMapping(value="/member/join_form.do" ,method = RequestMethod.POST)
	public ModelAndView joinForm(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String viewName = (String)request.getAttribute("viewName");
		ModelAndView mav = new ModelAndView(viewName);
		return mav;
	}
	
	//회원 정보 등록 기능 구현
	@RequestMapping(value="/member/join.do" ,method = RequestMethod.POST)
	public ModelAndView join(@ModelAttribute("memberVO") MemberVO member, HttpServletRequest request, 
			HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		
		int result = 0;
		result = memberService.join(member);
		
		mav.setViewName("redirect:/member/loginForm.do");
		return mav;
	}

}
