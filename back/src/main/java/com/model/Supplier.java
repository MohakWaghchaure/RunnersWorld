package com.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
@Entity
public class Supplier implements Serializable{

	@Id
	@Column(name="ID")
	private String sId;
	@Column(name="SUPPLIER")
	private String sName;
	@Column(name="ADDRESS")
	private String sAddress;
	@Column(name="CONTACT")
	private String sCont;
	@Column(name="EMAIL")
	private String sEmail;
	
	@OneToMany(targetEntity=Product.class, fetch= FetchType.EAGER, mappedBy = "supplier" )
	private Set<Product> products = new HashSet<Product>(0);
	
	public String getsId() {
		return sId;
	}
	public void setsId(String sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsAddress() {
		return sAddress;
	}
	public void setsAddress(String sAddress) {
		this.sAddress = sAddress;
	}
	public String getsCont() {
		return sCont;
	}
	public void setsCont(String sCont) {
		this.sCont = sCont;
	}
	public String getsEmail() {
		return sEmail;
	}
	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}
	
	
	
	
}
