package com.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.entity.AdminEntity;
import com.entity.ContactUsEntity;
import com.entity.EmployeeEntity;
import com.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	
	@GetMapping("/registration")
	  String displayRegistrationPage(){
	 return "registration"; 
	 
	}
	
	@PostMapping("/register")
	String doRegistration(@ModelAttribute EmployeeEntity employeeEntity, Model model, HttpSession session) {
	    // Get the logged-in admin from the session
	    AdminEntity loggedInAdmin = (AdminEntity) session.getAttribute("admin");

	    // Set the admin for the employee
	    employeeEntity.setAdmin(loggedInAdmin);

	    // Service layer saves this data: employeeEntity
	    employeeService.saveEmployee(employeeEntity);

	    // Fetch the updated list of employees associated with the logged-in admin
	    List<EmployeeEntity> listOfEmployees = employeeService.getEmployeesByAdminId(loggedInAdmin.getAdminId());

	    model.addAttribute("listOfEmployees", listOfEmployees);
	    model.addAttribute("mssg", "Employee Added Successfully!!");
	    return "redirect:/showAll";
	}

	
	@GetMapping("/showAll")
	String displayAllRecords(Model model, HttpSession session) {
	    AdminEntity loggedInAdmin = (AdminEntity) session.getAttribute("admin");

	    // Check if loggedInAdmin is null before accessing its properties
	    if (loggedInAdmin == null) {
	        // Handle the case when admin is not logged in, you might want to redirect to a login page
	        return "redirect:/login"; // Replace "/login" with your actual login mapping
	    }

	    // Fetch employees associated with the logged-in admin
	    List<EmployeeEntity> listOfEmployees = employeeService.getEmployeesByAdminId(loggedInAdmin.getAdminId());

	    model.addAttribute("listOfEmployees", listOfEmployees);
	    return "showAll";
	}

	
	
	@GetMapping("/editEmployee")
	String showEditForm(@RequestParam int employeeId,Model model) {
		EmployeeEntity employeeEntity =employeeService.fetchEmployee(employeeId); 
		model.addAttribute("employee", employeeEntity);
		
		return "edit"; 
		}
	
	@PostMapping("/updateEmployee")
	String doUpdate(@ModelAttribute EmployeeEntity employeeEntity, Model model, HttpSession session) {
	    // Get the logged-in admin from the session
	    AdminEntity loggedInAdmin = (AdminEntity) session.getAttribute("admin");

	    // Set the admin for the employee
	    employeeEntity.setAdmin(loggedInAdmin);

	    // Service layer saves this data: employeeEntity
	    employeeService.UpdateEmployee(employeeEntity);

	    System.out.println(employeeEntity);
	    model.addAttribute("mssg", "Updation Done Successfully!!");
	    return "redirect:/showAll";
	}
	
	@GetMapping("/deleteEmployee")
	String deleteEmp(@RequestParam int employeeId,Model model) {
		employeeService.deleteEmp(employeeId); 
		  model.addAttribute("mssg", "Employee Deleted Successfully!");
		  return "redirect:/showAll"; //redirect to showAll mapping
		}
	
}
