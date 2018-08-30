package com.hbconfig;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.dao.CategoryDao;
import com.dao.ProductDao;
import com.dao.SupplierDao;
import com.dao.UserInfoDao;
import com.daoimpl.CategoryDaoImpl;
import com.daoimpl.ProductDaoImpl;
import com.daoimpl.SupplierDaoImpl;
import com.daoimpl.UserInfoDaoImpl;
import com.model.Category;
import com.model.Product;
import com.model.Supplier;
import com.model.UserInfo;

@Configuration
@ComponentScan("com")
@EnableTransactionManagement
public class HibernateConfig {

	public static SessionFactory sessionFactory = null;
	
	@Bean("dataSource")
	public DataSource dataSource()
	{
		DriverManagerDataSource dmds=new DriverManagerDataSource();
		dmds.setDriverClassName("org.h2.Driver");
		dmds.setUrl("jdbc:h2:tcp://localhost/~/test");
		dmds.setUsername("sa");
		dmds.setPassword("");
		return dmds;
	}
	
	@Autowired
	@Bean(name="sessionFactory")
	public SessionFactory getSessionFactory()
	{
		LocalSessionFactoryBuilder lsfb=null;
	
		try{
		Properties hp=new Properties();
		hp.put("hibernate.temp.use_jdbc_metadata_defaults","false");
		//hp.setProperty("hibernate.hbm2ddl.auto","update");
		hp.setProperty("hibernate.hbm2ddl.auto","none");
		hp.put("hibernate.show_sql", "true");
		hp.put("hibernate.dialect","org.hibernate.dialect.H2Dialect");
		
		lsfb=new LocalSessionFactoryBuilder(dataSource());
		lsfb.addProperties(hp);
		lsfb.addAnnotatedClass(Product.class);	
		lsfb.addAnnotatedClass(Category.class);	
		lsfb.addAnnotatedClass(Supplier.class);	
		lsfb.addAnnotatedClass(UserInfo.class);	
		
		sessionFactory=lsfb.buildSessionFactory();
		System.out.println("Session Factory Object Created");
		
		}
		
		catch(Exception e)
		{
			System.out.println("excption..."+e);
			System.out.println("hbconfig errors");
		}
		return sessionFactory;
	}	
	
	@Autowired 
	@Bean(name="gethibernatetransactionmanager")
	public HibernateTransactionManager getHibernateTransactionManager(SessionFactory sessionFactory)
	{
		HibernateTransactionManager hbtm=new HibernateTransactionManager();
		hbtm.setSessionFactory(sessionFactory);
		return hbtm;
	}
	
	@Bean("productDao")
	public ProductDao getProductDaoImpl(){
		return new ProductDaoImpl();
	}
	
	@Bean("supplierDao")
	public SupplierDao getSupplierDaoImpl(){
		return new SupplierDaoImpl();
	}
	
	@Bean("categoryDao")
	public CategoryDao getCategoryDaoImpl(){
		return new CategoryDaoImpl();
	}
	
	@Bean("UserInfoDao")
	public UserInfoDao getUserInfoDaoImpl(){
		return new UserInfoDaoImpl();
	}
	
}
