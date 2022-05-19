package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity

public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private Long departmentId;
	@NotBlank(message="please add department name")
private String departmentName;
private String departmentCode;
private String departmentAddress;


public Department() {
	super();
}


public Department(Long departmentId, String departmentName, String departmentCode, String departmentAddress) {
	super();
	this.departmentId = departmentId;
	this.departmentName = departmentName;
	this.departmentCode = departmentCode;
	this.departmentAddress = departmentAddress;
}


public Long getDepartmentId() {
	return departmentId;
}


public void setDepartmentId(Long departmentId) {
	this.departmentId = departmentId;
}


public String getDepartmentName() {
	return departmentName;
}


public void setDepartmentName(String departmentName) {
	this.departmentName = departmentName;
}


public String getDepartmentCode() {
	return departmentCode;
}


public void setDepartmentCode(String departmentCode) {
	this.departmentCode = departmentCode;
}


public String getDepartmentAddress() {
	return departmentAddress;
}


public void setDepartmentAddress(String departmentAddress) {
	this.departmentAddress = departmentAddress;
}


@Override
public String toString() {
	return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + ", departmentCode="
			+ departmentCode + ", departmentAddress=" + departmentAddress + "]";
}


}
