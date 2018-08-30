package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dao.SupplierDao;
import com.model.Supplier;

@Controller
public class SupplierController {

	@Autowired
	private SupplierDao supplierDao;
	
	@RequestMapping("/supplier")
	public String showSupplier(Model model)
	{
		model.addAttribute("supplier",new Supplier());
		return "supplier";		
	}
	
	@RequestMapping(value= "/supplier", method = RequestMethod.POST)
	public ModelAndView saveSupplier(@ModelAttribute("supplier") Supplier sup)
	{
		ModelAndView mv= new ModelAndView();
		mv.setViewName("supplier");
		supplierDao.insertSupplier(sup);
		mv.addObject("supplier", new Supplier());
		return mv;
	}
}
