package com.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dao.CategoryDao;
import com.hbconfig.HibernateConfig;
import com.model.Category;

@Repository("CategoryDao")
public class CategoryDaoImpl implements CategoryDao {

	@Autowired
	SessionFactory sessionFactory;

	@Transactional
	public boolean insertCategory(Category category) {
		try
		{
			HibernateConfig hbConfig = new HibernateConfig();
			SessionFactory sessionfac=hbConfig.getSessionFactory();
			Session s=sessionfac.openSession();
			s.beginTransaction();
		    s.save(category);
			s.getTransaction().commit();
			s.close();
			return true;
		}
		
			
		catch(Exception e)
		{
				System.out.println("Exception Arised:"+e);
				return false;
		}
	}

	@Transactional
	public boolean updateCategory(Category category) {
		try
		{
			HibernateConfig hbConfig = new HibernateConfig();
			SessionFactory sessionfac=hbConfig.getSessionFactory();
			Session s=sessionfac.openSession();
			s.beginTransaction();
		    s.update(category);
			s.getTransaction().commit();
			s.close();
			return true;
		}
		catch(Exception e)
		{
			System.out.println("Exception Arised:"+e);
			return false;
		}
	}

	@Transactional
	public boolean deleteCategory(Category category) {
		try
		{
			HibernateConfig hbConfig = new HibernateConfig();
			SessionFactory sessionfac=hbConfig.getSessionFactory();
			Session s=sessionfac.openSession();
			s.beginTransaction();
		    s.delete(category);
			s.getTransaction().commit();
			s.close();
			return true;
		}
		catch(Exception e)
		{
			System.out.println("Exception Arised:"+e);
			return false;
		}

	}

	public List<Category> ListCategory() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}

