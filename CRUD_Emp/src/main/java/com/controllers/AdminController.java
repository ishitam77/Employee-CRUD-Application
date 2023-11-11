package com.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.service.AdminService;

import com.entity.AdminEntity;
import com.entity.EmployeeEntity;

@Controller
public class AdminController {
	
	@Autowired
	AdminService adminService;
	
	@GetMapping("*")
	  String indexPage(){
	 return "home"; 
	 
	}
	
	@GetMapping("/home")
	  String homePage(){
	 return "home"; 
	 
	}

	@GetMapping("/login")
	  String displayLoginPage(){
	 return "mylogin"; //mylogin.jsp
	 
	}
	
	@PostMapping("/login")
	String authenticate(@RequestParam String email, @RequestParam String password, Model model) {
	    AdminEntity adminEntity = adminService.authenticate(email, password);
	    if (adminEntity != null) {
	    	model.addAttribute("email",email);
			model.addAttribute("password",password);
	        model.addAttribute("admin", adminEntity);
	        return "showAll";
	    } else {
	        model.addAttribute("mssg", "Invalid Email & Password!!");
	        return "mylogin";
	    }
	}
	
	@GetMapping("/adminreg")
	  String displayAdminRegistrationPage(){
	 return "adminreg"; 
	 
	}
	
	@PostMapping("/adminregister")
	String doRegistration(@ModelAttribute AdminEntity adminEntity,Model model) {
		
		//service layer saves this data: employeeEntity
		adminService.saveAdmin(adminEntity);
		
		System.out.println(adminEntity);
		model.addAttribute("mssg","Registration Done Successfully!!");  //employeeEntity stores all the taken data
		return "redirect:/login";
	}
	
	@GetMapping("/editadmin")
	String showAdminEditForm(@RequestParam int adminId,Model model) {
		AdminEntity adminEntity =adminService.fetchAdmin(adminId); 
		model.addAttribute("admin", adminEntity);
		
		return "profile"; 
		}
	
	@PostMapping("/updateadmin")
	String doUpdateAdmin(@ModelAttribute AdminEntity adminEntity,Model model) {
		
		//service layer saves this data: employeeEntity
		adminService.UpdateAdmin(adminEntity);
		
		System.out.println(adminEntity);
		model.addAttribute("mssg","Updation Done Successfully!!");  //employeeEntity stores all the taken data
		return "redirect:/showAll"; 
	}
	
	@GetMapping("/deleteadmin")
	String deleteAdmin(@RequestParam int adminId,Model model) {
		adminService.deleteAdmin(adminId); 
		  model.addAttribute("mssg", "Employee Deleted Successfully!");
		  return "redirect:/showAll"; //redirect to showAll mapping
		}
	
}
