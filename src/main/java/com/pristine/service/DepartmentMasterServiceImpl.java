package com.pristine.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pristine.dao.IDepartmentMasterDao;
import com.pristine.domain.DepartmentMasterEntity;


@Service("departmentMasterService")
@Transactional
public class DepartmentMasterServiceImpl implements IDepartmentMasterService {

	@Autowired
	private IDepartmentMasterDao departmentMasterDao;
	
	@Override
	public Integer addDepartment(DepartmentMasterEntity departmentMaster) {
		departmentMasterDao.add(departmentMaster);
		return departmentMaster.getDeptId();
		
	}

	@Override
	public void updateDepartment(DepartmentMasterEntity departmentMaster) {
		departmentMasterDao.update(departmentMaster);
		
	}

	@Override
	public void removeDepartment(DepartmentMasterEntity departmentMaster) {
		departmentMasterDao.remove(departmentMaster);
	}

	@Override
	public DepartmentMasterEntity findDepartment(Integer id) {
		return departmentMasterDao.find(id);
	}

	@Override
	public List<DepartmentMasterEntity> list() {
		return departmentMasterDao.list();
	}
	
	
	
}
