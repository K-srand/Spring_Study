package com.nonage.member.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.nonage.member.vo.MemberVO;

@Repository("memberDAO")
public class MemberDAOImpl implements MemberDAO {
	@Autowired
	private SqlSession sqlSession;
	
	// 회원 정보 출력
	@Override
	public List getMember(String id) throws DataAccessException {
		
		System.out.println("MemberDAO -> getMember(id) | id: " + id);
		
		List<MemberVO> member = null;
		member = sqlSession.selectList("mapper.member.selectMember");  //mybatis member 설정의 selectMember 쿼리문 매핑
		return member;
	}

}
