package com.pristine.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity(name = "department_master")
public class DepartmentMasterEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator= "depid-gen")
	@SequenceGenerator(name = "depid-gen", sequenceName = "DEPARTMENT_SEQ", allocationSize = 1, initialValue = 0)
	@Column(name = "DEPT_ID")
	private Integer deptId;
	@Column(name = "DEPT_NAME")
	private String deptName;

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public DepartmentMasterEntity(String deptName) {
		super();
		this.deptName = deptName;
	}

	public DepartmentMasterEntity() {
		super();
	}

	
	
	
	
}
