package com.springmvc.hibernate.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.hibernate.bean.EmployeeBean;
import com.springmvc.hibernate.dao.EmployeeDAO;
import com.springmvc.hibernate.entity.EmployeeEntity;

@Service("employeeService")
public class EmployeeService {
	
	@Autowired
	private EmployeeDAO employeedao; 
	
	@Transactional
	public void saveEmployee(EmployeeEntity employeeEntity) {
		// TODO Auto-generated method stub
		employeedao.saveEmployee(employeeEntity);
	}

	public void deleteEmployee(Integer id) {
		// TODO Auto-generated method stub
		employeedao.deleteEmployee(id);
	}

	public EmployeeEntity updateEmployee(Integer id) {
		// TODO Auto-generated method stub
		return employeedao.updateEmployee(id);
	}

	public List<EmployeeBean> viewEmployees() {
		// TODO Auto-generated method stub
		
		return employeedao.viewEmployees();
		
	}
	

}
