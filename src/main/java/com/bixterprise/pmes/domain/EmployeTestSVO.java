package com.bixterprise.pmes.domain;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EmployeTestSVO {

	private EmployeTestQVO employeTestQVO;
	private List<EmployeTestQVO> employeTestQVOList;
	
	public EmployeTestQVO getEmployeTestQVO() {
		return employeTestQVO;
	}
	public void setEmployeTestQVO(EmployeTestQVO employeTestQVO) {
		this.employeTestQVO = employeTestQVO;
	}
	public List<EmployeTestQVO> getEmployeTestQVOList() {
		return employeTestQVOList;
	}
	public void setEmployeTestQVOList(List<EmployeTestQVO> employeTestQVOList) {
		this.employeTestQVOList = employeTestQVOList;
	}
	public void delete(EmployeTestQVO e) {

		
	}
	public void add(EmployeTestQVO e) {

		
	}
	

}
