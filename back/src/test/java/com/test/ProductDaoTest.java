package com.test;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dao.ProductDao;
import com.model.Product;

public class ProductDaoTest {

	static ProductDao productDao;
	
	@BeforeClass
	public static void setup()
	{
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext();
		context.scan("com");
		context.refresh();
		
		productDao=(ProductDao)context.getBean("ProductDao");
	}
	
	@Test
	public void insertProductTest()
	{
		Product p= new Product();
		p.setpId("S128");
		p.setpName("NIKE ZIPPER");
		p.setpDesc("NDJFKSLC>>>");
		p.setpPrice(200.34);		
	}
	
	@Test
	public void updateProductTest()
	{
		Product p= new Product();
		p.setpId("S128");
		p.setpName("NIKE ZIPPER");
		p.setpDesc("NDJFKSLC>>>");
		p.setpPrice(200.34);
	}
	
	@Test
	public void deleteProductTest()
	{
		Product p= new Product();
		p.setpId("S128");
		p.setpName("NIKE ZIPPER");
		p.setpDesc("NDJFKSLC>>>");
		p.setpPrice(200.34);
	}
	
	@Test
	public void listProductTest()
	{
		List<Product> listProduct= productDao.ListProduct();
		assertNotNull("PROBLEM IN LISTING......",listProduct);
	}
}
