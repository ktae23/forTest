package com.example.demo.memberController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.memberService.MemberService;

@Controller
public class MemberController {


	@Autowired
	MemberService memberService;
	
	@RequestMapping(value = "/memberInsert", method = RequestMethod.GET)
	@ResponseBody
	public void memberInsert() {
		memberService.memberInsert();
		
	}
	
}
