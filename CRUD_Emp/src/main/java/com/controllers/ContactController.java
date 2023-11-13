package com.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.entity.ContactUsEntity;
import com.service.ContactUsService;

@Controller
public class ContactController {
	
	@Autowired
	ContactUsService contactusService;
	
	@GetMapping("/contactus")
	  String displayContactPage(){
	 return "contactus"; 
	 
	}
	
	@PostMapping("/contactus")
	  String doContact(@ModelAttribute ContactUsEntity contactusEntity ,Model model){
		contactusService.saveContactUs(contactusEntity);
		System.out.println(contactusEntity);
		model.addAttribute("msg", "Message Submitted done");
	 return "redirect:/home"; 
	 
	}
	
	@GetMapping("/showcomments")
	String displayAllComments(Model model) {
		List<ContactUsEntity> listOfComments=contactusService.findAllComments();
		model.addAttribute("listOfComments",listOfComments);
		return "showcomments";
	}
}
