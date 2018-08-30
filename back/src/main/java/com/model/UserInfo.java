package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
@Entity
public class UserInfo {
	
	@Id
	@GeneratedValue
	private int uId;
	@Column(name="NAME")
	private String uName;
	@Column(name="ADDRESS")
	private String uAdd;
	@Column(name="CONTACT")
	private String uCon;
	@Column(name="EMAIL")
	private String uEmail;
	@Column(name="ROLE")
	private String uRole;
	@Column(name="USERNAME")
	private String uUsername;
	@Column(name="PASSWARD")
	private String uPassward;
	
	
	public String getuUsername() {
		return uUsername;
	}
	public void setuUsername(String uUsername) {
		this.uUsername = uUsername;
	}
	public String getuPassward() {
		return uPassward;
	}
	public void setuPassward(String uPassward) {
		this.uPassward = uPassward;
	}
	public int getuId() {
		return uId;
	}
	public String getuRole() {
		return uRole;
	}
	public void setuRole(String uRole) {
		this.uRole = uRole;
	}
	public void setuId(int uId) {
		this.uId = uId;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getuAdd() {
		return uAdd;
	}
	public void setuAdd(String uAdd) {
		this.uAdd = uAdd;
	}
	public String getuCon() {
		return uCon;
	}
	public void setuCon(String uCon) {
		this.uCon = uCon;
	}
	public String getuEmail() {
		return uEmail;
	}
	public void setuEmail(String uEmail) {
		this.uEmail = uEmail;
	}
	
	
}
