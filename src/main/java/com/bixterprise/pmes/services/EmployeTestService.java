package com.bixterprise.pmes.services;

import com.bixterprise.pmes.domain.EmployeTestSVO;

public interface EmployeTestService {

	public void selectListEmployeTest(EmployeTestSVO employeTestSVO) throws Exception;
	public void insertEmployeTest(EmployeTestSVO employeTestSVO) throws Exception;
}
