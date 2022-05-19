package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Department;
import com.example.demo.error.DepartmentNotFoundException;

public interface DepartmentService {

	Department saveDepartment(Department department);

	List<Department> fetchDepartmentList();

	void deleteDepartmentById(Long did);

	Department updateDepartment(Long did, Department department) throws DepartmentNotFoundException;

	Department fetchDepartmentById(Long did) throws DepartmentNotFoundException;

	Department fetchDepartmentByName(String dname);

}
