package com.bixterprise.pmes.controller.views;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bixterprise.pmes.domain.EmployeTestQVO;
import com.bixterprise.pmes.domain.EmployeTestSVO;

@Controller
@RequestMapping("employes")
public class EmployeController {

	@Autowired EmployeTestSVO service;
	
	@GetMapping("/add")
	public String homeView(Model model) {
		model.addAttribute("employes", service.getEmployeTestQVOList());
		model.addAttribute("isEmploye", true);
		return "employes/addemployes";
	}
	
	@GetMapping
	public String addView(Model model) {
		model.addAttribute("employes", service.getEmployeTestQVOList());
		model.addAttribute("isEmploye", true);
		return "employes/home";
	}
	
	@GetMapping("/delete/{id}")
	public String deleteEmploye(@PathVariable String id) {
		EmployeTestQVO e = new EmployeTestQVO(id);
		service.delete(e);
		return "redirect:/employes";
	}
	
	@GetMapping("/add/{id}")
	public String addEmploye(@PathVariable String id) {
		EmployeTestQVO e = new EmployeTestQVO(id);
		service.add(e);
		return "redirect:/employes";
	}
}
