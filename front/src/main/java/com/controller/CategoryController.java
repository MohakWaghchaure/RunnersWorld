package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dao.CategoryDao;
import com.model.Category;
import com.model.UserInfo;

@Controller
public class CategoryController {
	
	@Autowired
	private CategoryDao categoryDao;

	@RequestMapping("/category")
	public String showCategory(Model model)
	{
		List<Category> listcat= categoryDao.ListCategory();
		model.addAttribute("listcat", listcat);
		model.addAttribute("category", new Category());	
		return "category" ;	
	}
	
	@RequestMapping(value= "/category", method = RequestMethod.POST)
	public ModelAndView saveCategory(@ModelAttribute("category") Category cat )
	{
		ModelAndView mv= new ModelAndView();
		mv.setViewName("category");		
		
		List<Category> listcat= categoryDao.ListCategory();
		mv.addObject("listcat",listcat);
		categoryDao.insertCategory(cat);
		mv.addObject("category",new Category());		
		return mv;
	}
	
	
}
