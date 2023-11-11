package com.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	String doRegistration(@ModelAttribute EmployeeEntity employeeEntity,Model model) {
		
		//service layer saves this data: employeeEntity
		employeeService.saveEmployee(employeeEntity);
		
		System.out.println(employeeEntity);
		model.addAttribute("mssg","Employee Added Successfully!!");  //employeeEntity stores all the taken data
		return "redirect:/showAll";
	}
	
	
	
	@GetMapping("/showAll")
	String displayAllRecords(Model model) {
		List<EmployeeEntity> listOfEmployees=employeeService.getAllEmployees();
		model.addAttribute("listOfEmployees",listOfEmployees);
		return "showAll";
	}
	
	
	@GetMapping("/editEmployee")
	String showEditForm(@RequestParam int employeeId,Model model) {
		EmployeeEntity employeeEntity =employeeService.fetchEmployee(employeeId); 
		model.addAttribute("employee", employeeEntity);
		
		return "edit"; 
		}
	
	@PostMapping("/updateEmployee")
	String doUpdate(@ModelAttribute EmployeeEntity employeeEntity,Model model) {
		
		//service layer saves this data: employeeEntity
		employeeService.UpdateEmployee(employeeEntity);
		
		System.out.println(employeeEntity);
		model.addAttribute("mssg","Updation Done Successfully!!");  //employeeEntity stores all the taken data
		return "redirect:/showAll"; 
	}
	
	@GetMapping("/deleteEmployee")
	String deleteEmp(@RequestParam int employeeId,Model model) {
		employeeService.deleteEmp(employeeId); 
		  model.addAttribute("mssg", "Employee Deleted Successfully!");
		  return "redirect:/showAll"; //redirect to showAll mapping
		}
	
}
