package com.nonage.member.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.nonage.member.vo.MemberVO;

public interface MemberService {
	 public MemberVO getMember(MemberVO memberVO) throws DataAccessException;  //회원정보 출력
	 public int join(MemberVO memberVO) throws DataAccessException; //회원 정보 등록
}
