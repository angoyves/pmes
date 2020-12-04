package com.bixterprise.pmes.persistence;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.bixterprise.pmes.domain.EmployeTestQVO;
import com.bixterprise.pmes.domain.EmployeTestSVO;

@Mapper
@Repository
public interface EmployeTestDAO {

	List<EmployeTestQVO> selectListEmployeTest(EmployeTestSVO employeTestSVO);
	
}