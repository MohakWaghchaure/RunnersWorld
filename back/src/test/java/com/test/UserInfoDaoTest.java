package com.test;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dao.UserInfoDao;
import com.model.UserInfo;

public class UserInfoDaoTest {
	
	static UserInfoDao userInfoDao;

	@BeforeClass
	public static void setup()
	{
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext();
		context.scan("com");
		context.refresh();
		
		userInfoDao=(UserInfoDao)context.getBean("UserInfoDao");
	}
	
	@Test
	public void insertUserInfoTest()
	{
		UserInfo u= new UserInfo();
		u.setuId(345);
		u.setuName("mswdn");
		u.setuUsername("solsnd");
		u.setuPassward("kjckq");
		u.setuRole("admin");
		u.setuCon("1235486");
		u.setuEmail("swar@gmail.com");
		u.setuAdd("jvsksmsv....ss");
	}
	
	@Test
	public void deleteUserInfoTest()
	{
		UserInfo u= new UserInfo();
		u.setuId(345);
		u.setuName("mswdn");
		u.setuUsername("solsnd");
		u.setuPassward("kjckq");
		u.setuRole("admin");
		u.setuCon("1235486");
		u.setuEmail("swar@gmail.com");
		u.setuAdd("jvsksmsv....ss");
	}
}
