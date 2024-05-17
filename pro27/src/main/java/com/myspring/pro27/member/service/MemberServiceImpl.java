package com.myspring.pro27.member.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.myspring.pro27.member.dao.MemberDAO;
import com.myspring.pro27.member.vo.MemberVO;


@Service("memberService")
@Transactional(propagation = Propagation.REQUIRED)
public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberDAO memberDAO;

//	회원 전체 리스트
	@Override
	public List listMembers() throws DataAccessException {
		List membersList = null;
		membersList = memberDAO.selectAllMemberList();
		return membersList;
	}

//	회원 가입
	@Override
	public int addMember(MemberVO member) throws DataAccessException {
		return memberDAO.insertMember(member);
	}

//  회원 정보 삭제
	@Override
	public int removeMember(String id) throws DataAccessException {
		return memberDAO.deleteMember(id);
	}
	
//	회원 정보 출력
	@Override
	public List selectMember(String id) throws DataAccessException {
		return memberDAO.selectMember(id);
	}

//	회원 정보 변경
	@Override
	public int updateMember(MemberVO memberVO) throws DataAccessException {
		return memberDAO.updateMember(memberVO);
	}
	
//	로그인
	@Override
	public MemberVO login(MemberVO memberVO) throws Exception{
		return memberDAO.loginById(memberVO);
	}


}
