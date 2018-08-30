package com.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dao.SupplierDao;
import com.hbconfig.HibernateConfig;
import com.model.Supplier;

@Repository("SupplierDao")
public class SupplierDaoImpl implements SupplierDao {

	@Autowired
	SessionFactory sessionFactory;

	@Transactional
	public boolean insertSupplier(Supplier supplier) {
		try
		{
			HibernateConfig hbConfig = new HibernateConfig();
			SessionFactory sessionfac=hbConfig.getSessionFactory();
			Session s=sessionfac.openSession();
			s.beginTransaction();
		    s.save(supplier);
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
	public boolean updateSupplier(Supplier supplier) {
		try
		{
			HibernateConfig hbConfig = new HibernateConfig();
			SessionFactory sessionfac=hbConfig.getSessionFactory();
			Session s=sessionfac.openSession();
			s.beginTransaction();
		    s.update(supplier);
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
	public boolean deleteSupplier(Supplier supplier) {
		try
		{
			HibernateConfig hbConfig = new HibernateConfig();
			SessionFactory sessionfac=hbConfig.getSessionFactory();
			Session s=sessionfac.openSession();
			s.beginTransaction();
		    s.delete(supplier);
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

	public List<Supplier> ListSupplier() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
