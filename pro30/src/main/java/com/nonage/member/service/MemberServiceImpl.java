package com.nonage.member.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.nonage.member.dao.MemberDAO;
import com.nonage.member.vo.MemberVO;


@Service("memberService")
public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberDAO memberDAO;

//	회원 정보 출력
	@Override
	public MemberVO getMember(MemberVO memberVO) throws DataAccessException {
		MemberVO member = memberDAO.getMember(memberVO);           //memberDAO의 회원 정보 출력 메서드 호출
		return member;
	}

//	회원 정보 등록
	@Override
	public int join(MemberVO member) throws DataAccessException {
		return memberDAO.insertMember(member);       //memberDAO의 회원 정보 등록 메서드 호출
	}
}
