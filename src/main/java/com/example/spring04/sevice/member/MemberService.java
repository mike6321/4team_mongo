package com.example.spring04.sevice.member;

import com.example.spring04.model.dto.MemberDTO;

public interface MemberService {
	MemberDTO loginCheck(String userid, String passwd);
	void join(MemberDTO member);
	
}
 