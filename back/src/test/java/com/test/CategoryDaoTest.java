package com.test;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dao.CategoryDao;
import com.model.Category;

public class CategoryDaoTest {
	
	static CategoryDao categoryDao;
	
	@BeforeClass
	public static void setup()
	{
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext();
		context.scan("com");
		context.refresh();
		
		categoryDao=(CategoryDao)context.getBean("CategoryDao");		
	}

	@Test
	public void insertCategoryTest()
	{
		Category c=new Category();
		c.setcId("M123");
		c.setcCol("BLACK");
		c.setcSz("42");
		c.setcGen("MEN"); 
		c.setcName("SHOE");
	}
	
	public void updateCategoryTest()
	{
		Category c=new Category();
		c.setcId("M123");
		c.setcCol("BLACK");
		c.setcSz("42");
		c.setcGen("MEN"); 
		c.setcName("SHOE");
	}
	
	public void deleteCategoryTest()
	{
		Category c=new Category();
		c.setcId("M123");
		c.setcCol("BLACK");
		c.setcSz("42");
		c.setcGen("MEN"); 
		c.setcName("SHOE");
	}
}
