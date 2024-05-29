package com.nonage.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nonage.member.vo.MemberVO;

public interface MemberController {
	public ModelAndView login(@ModelAttribute("memberVO") MemberVO member, 
			HttpServletRequest request, HttpServletResponse response) throws Exception;  //로그인 생성
	public ModelAndView join(@ModelAttribute("info") MemberVO member, 
			HttpServletRequest request, HttpServletResponse response) throws Exception; //회원가입 생성
}

