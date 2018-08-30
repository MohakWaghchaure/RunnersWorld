package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dao.UserInfoDao;
import com.model.UserInfo;

@Controller
public class SignupController {

	@Autowired
	private UserInfoDao userInfoDao;
	
	//user signup page return object to give path in spring form 
		@RequestMapping(value="/authSignup",method=RequestMethod.GET)
		public String SignUp(Model model)
		{
			model.addAttribute("userInfo", new UserInfo());
			return "signup";
			
		}
		
		//signup user
		@RequestMapping(value="/authSignUp",method=RequestMethod.POST)
		public ModelAndView saveUserData(@ModelAttribute("userInfo") UserInfo userReq)
		{
			ModelAndView mv=new ModelAndView();
			mv.setViewName("login");
			
			userReq.setuRole("USER");
			userInfoDao.insertUserInfo(userReq);
			mv.addObject("userInfo",new UserInfo());
			return mv;
		}
		
		
}

