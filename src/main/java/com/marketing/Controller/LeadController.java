package com.marketing.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.marketing.Entities.Lead;
import com.marketing.Services.LeadService;
// to make controller layer
@Controller
public class LeadController {
// we need to develop handler method (do get, do post)
		@Autowired
		private LeadService leadService;
	//http://localhost:8080/create
	@RequestMapping("/create")
	public String viewCreateLeadPage() {
		return "create_lead";
		
	}
	@RequestMapping("/savelead")
	public String saveOneLead(@ModelAttribute("l") Lead lead,ModelMap model) {
		
		leadService.saveLeadInfo(lead);
	model.addAttribute("msg", "Record is Saved");
		return "create_lead";
		
	}
//	@RequestMapping("/savelead")
//	public String saveOneLead(@RequestParam("firstname") String firstname,
//								@RequestParam("lastname") String lastname,
//								@RequestParam("email") String email,
//								@RequestParam("mobile") String mobile,ModelMap model) {
//		Lead lead =new Lead();
//		lead.setFirstName(firstname);
//		lead.setFirstName(lastname);
//		lead.setEmail(email);
//		lead.setMobile(mobile);
//		
//		LeadService.saveLeadInfo(lead);
//		model.addAttribute("msg", "Record is Saved");
//				
//		return "create_lead";
//}
	}
