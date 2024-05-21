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
@Transactional(propagation = Propagation.REQUIRED)
public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberDAO memberDAO;

//	회원 정보 출력
	@Override
	public List getMember(String id) throws DataAccessException {
		List member = null;
		member = memberDAO.getMember(id);           //memberDAO의 회원 정보 출력 메서드 호출
		return member;
	}


}
