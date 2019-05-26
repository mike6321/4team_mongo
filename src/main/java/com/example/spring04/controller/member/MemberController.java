package com.example.spring04.controller.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.spring04.model.dto.MemberDTO;
import com.example.spring04.sevice.member.MemberService;

@Controller
@RequestMapping("/member/*")
public class MemberController {
	@Autowired
	MemberService memberservice;
	
	@RequestMapping("login.do")
	public ModelAndView login() {
		return new ModelAndView("member/login");	
	}
	
	@RequestMapping("join.do")
	public ModelAndView join() {
		return  new ModelAndView("member/join");
	}
	@RequestMapping("kakao.do")
	public ModelAndView k_login() {
		return  new ModelAndView("member/kakao");
	}

	@RequestMapping("member_join.do")
	public String member_join(String _id, String passwd, String name){
		//mongo insert
		
		MemberDTO dto = new MemberDTO();
		dto.set_id(_id);
		dto.setPasswd(passwd);
		dto.setName(name);
		
		memberservice.join(dto);
		
		return "redirect:/member/login.do"; 
	}
	@RequestMapping("boxoffice.do")
	public ModelAndView boxoffice() {
		return new ModelAndView("movie/boxoffice");	
	}
}
