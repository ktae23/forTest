package com.example.demo.memberVO;

import java.util.Date;

import org.apache.ibatis.type.Alias;


@Alias("memberVO")
public class MemberVO {

	private String name,id,pw;
	private Date joindate;

	
	
	public MemberVO() {}
	
	public MemberVO(String name, String id, String pw) {
		super();
		this.name = name;
		this.id = id;
		this.pw = pw;
	}
	
	
	public MemberVO(String name, String id, String pw, Date joindate) {
		super();
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.joindate = joindate;
	}

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public Date getJoindate() {
		return joindate;
	}
	public void setJoindate(Date joindate) {
		this.joindate = joindate;
	}
	@Override
	public String toString() {
		return "MemberVO [name=" + name + ", id=" + id + ", pw=" + pw + ", joindate=" + joindate + "]";
	}
	
	

}
