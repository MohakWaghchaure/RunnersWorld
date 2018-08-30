package com.daoimpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.dao.UserInfoDao;
import com.hbconfig.HibernateConfig;
import com.model.UserInfo;

public class UserInfoDaoImpl implements UserInfoDao{

	@Autowired
	SessionFactory sessionFactory;

	@Transactional
	public boolean insertUserInfo(UserInfo userInfo) {
		
			try
			{
				HibernateConfig hbConfig = new HibernateConfig();
				SessionFactory sessionfac=hbConfig.getSessionFactory();
				Session s=sessionfac.openSession();
				s.beginTransaction();
			    s.save(userInfo);
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

	public boolean deleteUserInfo(UserInfo userInfo) {
		
		try
		{
			HibernateConfig hbConfig = new HibernateConfig();
			SessionFactory sessionfac=hbConfig.getSessionFactory();
			Session s=sessionfac.openSession();
			s.beginTransaction();
		    s.delete(userInfo);
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
	
	
}
