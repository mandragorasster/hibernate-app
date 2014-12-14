package com.pristine.vo;


public class DepartmentMasterVO {

	private Integer deptId;

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

	public DepartmentMasterVO(String deptName) {
		super();
		this.deptName = deptName;
	}

	public DepartmentMasterVO() {
		super();
	}

	
	
	
	
}
