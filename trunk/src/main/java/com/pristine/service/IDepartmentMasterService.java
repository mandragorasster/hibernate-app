package com.pristine.service;

import java.util.List;

import com.pristine.domain.DepartmentMasterEntity;

public interface IDepartmentMasterService {
	
	Integer addDepartment(DepartmentMasterEntity departmentMaster);

	void updateDepartment(DepartmentMasterEntity departmentMaster);

	void removeDepartment(DepartmentMasterEntity departmentMaster);

	List<DepartmentMasterEntity> list();

	DepartmentMasterEntity findDepartment(Integer id);
}
