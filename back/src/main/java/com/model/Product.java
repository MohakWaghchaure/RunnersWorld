package com.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
@Entity
public class Product implements Serializable{
	
	@Id	
	@Column(name="ID")
	private String pId;
	@Column(name="PRODUCT")
	private String pName;
	@Column(name="DESCRIPTION")
	private String pDesc;
	@Column(name="PRICE")
	private double pPrice;
	
	@ManyToOne(fetch= FetchType.EAGER)
	@JoinColumn(name= "cId")
	private Category category;
	
	@ManyToOne(fetch= FetchType.EAGER)
	@JoinColumn(name= "sId")
	private Supplier supplier;
	
	
	public double getpPrice() {
		return pPrice;
	}
	public void setpPrice(double pPrice) {
		this.pPrice = pPrice;
	}
	public String getpId() {
		return pId;
	}
	public void setpId(String pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpDesc() {
		return pDesc;
	}
	public void setpDesc(String pDesc) {
		this.pDesc = pDesc;
	}
	
		
	

}
