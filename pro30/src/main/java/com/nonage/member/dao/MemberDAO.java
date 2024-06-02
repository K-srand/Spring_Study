package com.nonage.member.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.nonage.member.vo.MemberVO;

public interface MemberDAO {
	 public MemberVO getMember(MemberVO memberVO) throws DataAccessException;   //회원정보 출력
	 public int insertMember(MemberVO memberVO) throws DataAccessException; //회원정보 등록
}
