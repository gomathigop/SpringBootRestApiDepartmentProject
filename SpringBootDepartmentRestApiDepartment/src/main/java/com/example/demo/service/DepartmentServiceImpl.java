package com.example.demo.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Department;
import com.example.demo.error.DepartmentNotFoundException;
import com.example.demo.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService{
@Autowired
	DepartmentRepository departmentRepo;
	
	@Override
	public Department saveDepartment(Department department) {
		
		return departmentRepo.save(department);
	}

	@Override
	public List<Department> fetchDepartmentList() {
		// TODO Auto-generated method stub
		return departmentRepo.findAll();
	}

	@Override
	public void deleteDepartmentById(Long did) {
		// TODO Auto-generated method stub
		departmentRepo.deleteById(did);
		
	}
	/*@Override
	public Department fetchDepartmentById(Long did) throws DepartmentNotFoundException {
		// TODO Auto-generated method stub
		//System.out.println(did);
		
		Optional<Department> department =repository.findById(did);
		if(!department.isPresent()) {
			throw new DepartmentNotFoundException("Department Not Available");
		}
		return repository.findById(did).get();
	}

	@Override
	public Department updateDepartment(Long did, Department department) throws DepartmentNotFoundException {
		Optional<Department> department1=repository.findById(did);
		Department depDB=null;
		if(department1.isPresent()) {
		 depDB=repository.findById(did).get();
		if(Objects.nonNull(department.getDepartmentName()) && !"".equalsIgnoreCase(department.getDepartmentName())) {
			depDB.setDepartmentName(department.getDepartmentName());
			
		}
		if(Objects.nonNull(department.getDepartmentAddress()) && !"".equalsIgnoreCase(department.getDepartmentAddress())) {
			depDB.setDepartmentAddress(department.getDepartmentAddress());
			System.out.println(department.getDepartmentAddress());
		}
		if(Objects.nonNull(department.getDepartmentCode()) && !"".equalsIgnoreCase(department.getDepartmentCode())) {
			depDB.setDepartmentCode(department.getDepartmentCode());
			System.out.println(department.getDepartmentCode());
		}
		
		return repository.save(depDB);
		}
		else {
			throw new DepartmentNotFoundException("Department Not available");
		}
		}	

	@Override
	public Department fetchDepartmentByName(String departmentName) {
		// TODO Auto-generated method stub
		return repository.findByDepartmentName(departmentName);
	}

	@Override
	public Department updateDepartment(Long did, Department department) throws DepartmentNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}*/

	@Override
	public Department fetchDepartmentById(Long did) throws DepartmentNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Department updateDepartment(Long did, Department department) throws DepartmentNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Department fetchDepartmentByName(String dname) {
		// TODO Auto-generated method stub
		return null;
	}

}