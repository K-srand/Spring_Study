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
	public MemberVO getMember(MemberVO memberVO) throws DataAccessException {
		
		System.out.println("MemberDAO -> getMember(id) | id: " + memberVO.getId());
		MemberVO vo = sqlSession.selectOne("mapper.member.login", memberVO); //mybatis member의 login 쿼리문 매핑
		return vo;  
	}
	
	// 회원 가입
		@Override
		public int insertMember(MemberVO memberVO) throws DataAccessException {
			System.out.println("MemberDAO -> getMember(id) | id: " + memberVO.getId()); 
			int result = sqlSession.insert("mapper.member.insertMember", memberVO);  //mybatis member의 insertMember 쿼리문 매핑
			return result;
		}

}
