package com.pristine.service;

import java.util.List;

import com.pristine.vo.DepartmentMasterVO;

public interface IDepartmentMasterService {
	
	Integer addDepartment(DepartmentMasterVO departmentMaster);

	void updateDepartment(DepartmentMasterVO departmentMaster);

	void removeDepartment(DepartmentMasterVO departmentMaster);

	List<DepartmentMasterVO> list();

	DepartmentMasterVO findDepartment(Integer id);
}
