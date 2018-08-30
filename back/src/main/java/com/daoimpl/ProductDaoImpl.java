package com.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dao.ProductDao;
import com.hbconfig.HibernateConfig;
import com.model.Product;

@Repository("ProductDao")
public class ProductDaoImpl implements ProductDao{

	@Autowired
	SessionFactory sessionFactory;

	@Transactional
	public boolean insertProduct(Product product) {
		try
		{
			HibernateConfig hbConfig = new HibernateConfig();
			SessionFactory sessionfac=hbConfig.getSessionFactory();
			Session s=sessionfac.openSession();
			s.beginTransaction();
		    s.save(product);
			s.getTransaction().commit();
			s.close();
			System.out.println("transaction done");
			return true;
		}
		
			
		catch(Exception e)
		{
				System.out.println("Exception Arised:"+e);
				System.out.println("error...");
				return false;
			
		}
	}

	@Transactional
	public boolean updateProduct(Product product) {
		try
		{
			HibernateConfig hbConfig = new HibernateConfig();
			SessionFactory sessionfac=hbConfig.getSessionFactory();
			Session s=sessionfac.openSession();
			s.beginTransaction();
		    s.update(product);
			s.getTransaction().commit();
			s.close();
			System.out.println("transaction done");
			return true;
		}
		catch(Exception e)
		{
			System.out.println("Exception Arised:"+e);
			System.out.println("error...");
			return false;
		}
	}

	@Transactional
	public boolean deleteProduct(Product product) {
		try
		{
			HibernateConfig hbConfig = new HibernateConfig();
			SessionFactory sessionfac=hbConfig.getSessionFactory();
			Session s=sessionfac.openSession();
			s.beginTransaction();
		    s.delete(product);
			s.getTransaction().commit();
			System.out.println("transaction done");
			s.close();
			return true;
		}
		catch(Exception e)
		{
			System.out.println("Exception Arised:"+e);
			System.out.println("error...");
			return false;
		}

	}

	public List<Product> ListProduct() {
		
		return null;
	}
	 
	
}
