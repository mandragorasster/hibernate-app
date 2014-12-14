package com.pristine.util;

import com.pristine.domain.CategoryTypeMasterEntity;
import com.pristine.domain.CustomerEntity;
import com.pristine.domain.DepartmentMasterEntity;
import com.pristine.domain.DoctorMasterEntity;
import com.pristine.domain.MedicineMasterEntity;
import com.pristine.vo.CategoryTypeMasterVO;
import com.pristine.vo.CustomerVO;
import com.pristine.vo.DepartmentMasterVO;
import com.pristine.vo.DoctorMasterVO;
import com.pristine.vo.MedicineMasterVO;

public class VOToEntityConverter {

	public static CategoryTypeMasterEntity convert(CategoryTypeMasterVO vo) {
		CategoryTypeMasterEntity entity = new CategoryTypeMasterEntity();
		entity.setCatTypeId(vo.getCatTypeId());
		entity.setCatTypeName(vo.getCatTypeName());
		entity.setCreatedBy(vo.getCreatedBy());
		entity.setCreatedOn(vo.getCreatedOn());
		entity.setModifiedBy(vo.getModifiedBy());
		entity.setModifiedOn(vo.getModifiedOn());
		entity.setStatus(vo.getStatus());
		return entity;
	}

	public static DepartmentMasterEntity convert(DepartmentMasterVO vo) {
		DepartmentMasterEntity entity = new DepartmentMasterEntity();
		entity.setDeptId(vo.getDeptId());
		entity.setDeptName(vo.getDeptName());
		return entity;
	}

	public static DoctorMasterEntity convert(DoctorMasterVO vo) {
		DoctorMasterEntity entity = new DoctorMasterEntity();
		entity.setActive(vo.getActive());
		entity.setContactNo(vo.getContactNo());
		entity.setCreatedBy(vo.getCreatedBy());
		entity.setCreatedOn(vo.getCreatedOn());
		entity.setDegree(vo.getDegree());
		entity.setFirstName(vo.getFirstName());
		entity.setId(vo.getId());
		entity.setLastName(vo.getLastName());
		entity.setMiddleName(vo.getMiddleName());
		entity.setModificationOn(vo.getModificationOn());
		entity.setModifiedBy(vo.getModifiedBy());
		entity.setSpeciality(vo.getSpeciality());
		
		DepartmentMasterVO departmentVO = vo.getDepartment(); 
		entity.setDepartment(VOToEntityConverter.convert(departmentVO));
		
		return entity;
	}

	public static MedicineMasterEntity convert(MedicineMasterVO vo) {
		MedicineMasterEntity entity = new MedicineMasterEntity();
		entity.setBatchNo(vo.getBatchNo());
		entity.setCreatedBy(vo.getCreatedBy());
		entity.setCreatedOn(vo.getCreatedOn());
		entity.setId(vo.getId());
		entity.setMedicineName(vo.getMedicineName());
		entity.setModificationOn(vo.getModificationOn());
		entity.setModifiedBy(vo.getModifiedBy());
		entity.setPower(vo.getPower());
		entity.setRate(vo.getRate());
		entity.setStatus(vo.getStatus());
		return entity;
	}

	public static CustomerEntity convert(CustomerVO customerVO) {
		// TODO Auto-generated method stub
		return null;
	}

}
