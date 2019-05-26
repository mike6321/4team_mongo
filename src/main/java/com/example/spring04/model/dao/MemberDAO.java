package com.example.spring04.model.dao;

import com.example.spring04.model.dto.MemberDTO;

public interface MemberDAO {
	MemberDTO loginCheck(String userid, String passwd);
	void join(MemberDTO member);
}
