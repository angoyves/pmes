package com.bixterprise.pmes.services.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bixterprise.pmes.domain.EmployeTestSVO;
import com.bixterprise.pmes.persistence.EmployeTestDAO;
import com.bixterprise.pmes.services.EmployeTestService;

@Service("EmployeTestService")

public class EmployeTestServiceImpl implements EmployeTestService {

	@Autowired
	EmployeTestDAO employeTestDAO;
	
	@Override
	public void selectListEmployeTest(EmployeTestSVO employeTestSVO) throws Exception {
		// TODO Auto-generated method stub
		employeTestSVO.setEmployeTestQVOList(employeTestDAO.selectListEmployeTest(employeTestSVO));

	}

	@Override
	public void insertEmployeTest(EmployeTestSVO employeTestSVO) throws Exception {
		// TODO Auto-generated method stub

	}

}
