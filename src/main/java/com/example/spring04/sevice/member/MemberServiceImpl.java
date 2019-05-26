package com.example.spring04.sevice.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.spring04.model.dao.MemberDAO;
import com.example.spring04.model.dto.MemberDTO;

@Component("memberservice")
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberDAO memberdao;
	
	@Override
	public MemberDTO loginCheck(String userid, String passwd) {
		// TODO Auto-generated method stub
		return memberdao.loginCheck(userid, passwd);
	}

	@Override
	public void join(MemberDTO member) {
		memberdao.join(member);

	}

}
