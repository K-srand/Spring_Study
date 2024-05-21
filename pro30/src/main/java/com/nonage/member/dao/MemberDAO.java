package com.nonage.member.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.nonage.member.vo.MemberVO;

public interface MemberDAO {
	 public List getMember(String id) throws DataAccessException;   //회원정보 출력

}
