package com.bixterprise.pmes.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bixterprise.pmes.domain.EmployeTestSVO;
import com.bixterprise.pmes.services.EmployeTestService;

@Controller("EmployeTestCtrl")

public class EmployeTestCtrl {
	
	@Resource(name="EmployeTestService")
	
	EmployeTestService employeTestService;
	
	@RequestMapping(value="/employes/employesTest.do")
	public String moveEmployeTest(@ModelAttribute("employeTestSVO") EmployeTestSVO employeTestSVO)throws Exception{
		return "/employes/EmployeTest";
	}
	
	@RequestMapping(value="/employes/selectListPageEmployeTest.do")
	public String selectListPageEmployeTest(
			@ModelAttribute("employeTestSVO") EmployeTestSVO employeTestSVO) throws Exception{
		employeTestService.selectListEmployeTest(employeTestSVO);
		return "/employes/EmployeTestFrame";
	}
}
