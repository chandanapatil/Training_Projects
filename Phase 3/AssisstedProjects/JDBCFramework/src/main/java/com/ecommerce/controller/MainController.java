package com.ecommerce.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ecommerce.dao.EProductDAO;
import com.ecommerce.entity.Eproduct;

@Controller


public class MainController {
	@Autowired    
    EProductDAO eproductDAO;    
   @RequestMapping(value = "/listProducts", method = RequestMethod.GET)
    public String listProducts(ModelMap map)
    {
            List<Eproduct> list= eproductDAO.getProducts();
        ModelMap.addAttribute("list",list);  
        return "listProducts";
    }

}
