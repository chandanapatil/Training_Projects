package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.entity.Categories;
import com.service.CategoriesService;

@Controller
public class CategoriesController {
	@Autowired
	private com.entity.Categories catserv;
	
	@RequestMapping("/listcat")
	public String viewListPage(Model model)
	{
		List<com.entity.Categories> listCategories= ((Categories) catserv).listAll();
		model.addAttribute("listCategories", listCategories);
		return "manage";
		
	}
	
	@RequestMapping("/new")
	public String addNewCatPage(Model model)
	{
		Categories categories= new Categories();
		model.addAttribute("categories", categories);
		
		return "new_category";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveCategory(@ModelAttribute("categories") Categories categories, Model m) 
	{   
		
		catserv.save(categories);
		List<Categories> listCategories= catserv.listAll();
		m.addAttribute("listCategories", listCategories);
		
		return "manage";
	
	}	
	
	@RequestMapping("/delete/{id}")
	public String deleteCategory(@PathVariable(name ="id") long id, Model m)
	{
		catserv.delete(id);
		List<Categories> listCategories= catserv.listAll();
		m.addAttribute("listCategories", listCategories);
		
		return "manage";
	}
}
