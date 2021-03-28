package com.example.demo.memberService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.memberDAO.MemberDAO;

@Service
public class MemberService {

	@Autowired
	MemberDAO memberDAO;
	
	
	public void memberInsert() {
		memberDAO.memberInsert();
	}

}
