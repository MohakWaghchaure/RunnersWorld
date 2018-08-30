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
public class Category implements Serializable{

	@Id	
	@Column(name="ID")
	private String cId;
	@Column(name="SIZE")
	private String cSz;
	@Column(name="NAME")
	private String cName;
	@Column(name="GENDER")
	private String cGen;
	@Column(name="COLOUR")
	private String cCol;
	
	@OneToMany(targetEntity=Product.class, fetch= FetchType.EAGER, mappedBy = "category" )
		private Set<Product> products = new HashSet<Product>(0);
	
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
		public String getcId() {
		return cId;
	}
	public void setcId(String cId) {
		this.cId = cId;
	}
	public String getcSz() {
		return cSz;
	}
	public void setcSz(String cSz) {
		this.cSz = cSz;
	}
	public String getcGen() {
		return cGen;
	}
	public void setcGen(String cGen) {
		this.cGen = cGen;
	}
	public String getcCol() {
		return cCol;
	}
	public void setcCol(String cCol) {
		this.cCol = cCol;
	}
	
	
}
