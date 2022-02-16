package com.phase3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.phase3.entity.User;
import com.phase3.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/adduser")
	public String newUser(User user) {
		if(userService.addUser(user)) {
			return "redirect:/editdashboard/" + user.getId();
		}
		return "/adduser";
	}
	
	
	@GetMapping("/adduser")
	public ModelAndView addNewUser() {
		User user = new User();
		
		return new ModelAndView("newuser", "form", user);
	}
	
	@PostMapping("/searchuser")
	public String searchUser(User user) {
		if(userService.searchUser(user.getId())) {
			return "redirect:/editdashboard/"+ user.getId();
		}
		return "redirect:/errors";
	}
	
	@GetMapping("/searchuser")
	public ModelAndView searchUserId() {
		User user = new User();
		return new ModelAndView("searchuserid", "form", user);
	}
	
	
	
	@GetMapping("/editdashboard/{id}")
	public ModelAndView updateUser(@PathVariable("id") int id) {
		ModelAndView mv = new ModelAndView("editdashboard");
		User user = userService.getUser(id);
		mv.addObject("edituser", user);
		return mv;
		
	}
	
	@PostMapping("/editdashboard/{id}")
	public String save(@ModelAttribute("edituser") User user) {
		
		if(userService.updateUser(user)) {
			return "redirect:/dashboard/"+user.getId();
		}
		return "/editdashboard" + user.getId();
	}
	
	
	@GetMapping("/dashboard/{id}")
	public ModelAndView dashboard(@PathVariable("id") int id) {
		ModelAndView mv = new ModelAndView("dashboard");
		User user = userService.getUser(id);
		mv.addObject("useratt", user);
		return mv;
	}
	
	@GetMapping("/errors")
	public ModelAndView errors() {
		return new ModelAndView("usernotfound");
		
	}

	
}
