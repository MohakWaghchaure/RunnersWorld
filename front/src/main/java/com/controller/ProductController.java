package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dao.CategoryDao;
import com.dao.ProductDao;
import com.dao.SupplierDao;
import com.model.Product;
import com.model.Category;
import com.model.Supplier;


@Controller
public class ProductController {

	@Autowired
	private ProductDao productDao;
	
	@Autowired
	CategoryDao categoryDao;
	
	@Autowired
	SupplierDao supplierDao;
	
	
	@RequestMapping("/product")
	public String showProduct(Model model)
	{
		model.addAttribute("product",new Product());
		return "product";
	}
	
	@RequestMapping(value= "/product", method = RequestMethod.POST)
	public ModelAndView saveProduct(@ModelAttribute("product") Product pro)
	{
		ModelAndView mv= new ModelAndView();
		mv.setViewName("product");
		productDao.insertProduct(pro);
		mv.addObject("Product",new Product());
		return mv;
	}
}
