package com.test;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dao.SupplierDao;
import com.model.Supplier;

public class SupplierDaoTest {

	static SupplierDao supplierDao;
	
	@BeforeClass
	public static void setup()
	{
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext();
		context.scan("com");
		context.refresh();
		
		supplierDao=(SupplierDao)context.getBean("SupplierDao");		
	}

	@Test
	public void insertSupplierTest()
	{
		Supplier s=new Supplier();
		s.setsId("S1");
		s.setsName("NIKE");
		s.setsCont("989876435");
		s.setsEmail("majakl@gmail.com");
		s.setsAddress("ksjcskcw,...");		
	}
	
	@Test
	public void updateSupplierTest()
	{
		Supplier s=new Supplier();
		s.setsId("S1");
		s.setsName("NIKE");
		s.setsCont("989876435");
		s.setsEmail("majakl@gmail.com");
		s.setsAddress("ksjcskcw,...");		
	}
	
	@Test
	public void deleteSupplierTest()
	{
		Supplier s=new Supplier();
		s.setsId("S1");
		s.setsName("NIKE");
		s.setsCont("989876435");
		s.setsEmail("majakl@gmail.com");
		s.setsAddress("ksjcskcw,...");		
	}
}
