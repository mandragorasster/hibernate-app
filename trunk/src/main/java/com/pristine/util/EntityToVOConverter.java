package com.pristine.util;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;

import com.pristine.domain.CategoryTypeMasterEntity;
import com.pristine.domain.CountryMasterEntity;
import com.pristine.domain.CustomerEntity;
import com.pristine.domain.DepartmentMasterEntity;
import com.pristine.domain.DoctorMasterEntity;
import com.pristine.domain.EmployeeEntity;
import com.pristine.domain.MedicineMasterEntity;
import com.pristine.domain.PhoneNumberEntity;
import com.pristine.vo.CategoryTypeMasterVO;
import com.pristine.vo.CountryMasterVO;
import com.pristine.vo.CustomerVO;
import com.pristine.vo.DepartmentMasterVO;
import com.pristine.vo.DoctorMasterVO;
import com.pristine.vo.EmployeeVO;
import com.pristine.vo.MedicineMasterVO;
import com.pristine.vo.PhoneNumberVO;

public class EntityToVOConverter {

	public static CategoryTypeMasterVO convert(CategoryTypeMasterEntity entity) {
		if (entity == null) {
			return null;
		}
		CategoryTypeMasterVO vo = new CategoryTypeMasterVO();
		if (entity.getCatTypeId() != null) {
			vo.setCatTypeId(entity.getCatTypeId());
		}
		vo.setCatTypeName(entity.getCatTypeName());
		vo.setCreatedBy(entity.getCreatedBy());
		vo.setCreatedOn(entity.getCreatedOn());
		vo.setModifiedBy(entity.getModifiedBy());
		vo.setModifiedOn(entity.getModifiedOn());
		vo.setStatus(entity.getStatus());

		return vo;
	}

	public static DepartmentMasterVO convert(DepartmentMasterEntity entity) {
		if (entity == null) {
			return null;
		}
		DepartmentMasterVO vo = new DepartmentMasterVO();
		if (entity.getDeptId() != null) {
			vo.setDeptId(entity.getDeptId());
		}
		vo.setDeptName(entity.getDeptName());
		return vo;
	}

	public static DoctorMasterVO convert(DoctorMasterEntity entity) {
		if (entity == null) {
			return null;
		}
		DoctorMasterVO vo = new DoctorMasterVO();
		if (entity.getId() != null) {
			vo.setId(entity.getId());
		}
		vo.setActive(entity.getActive());
		vo.setContactNo(entity.getContactNo());
		vo.setCreatedBy(entity.getCreatedBy());
		vo.setCreatedOn(entity.getCreatedOn());
		vo.setDegree(entity.getDegree());
		vo.setFirstName(entity.getFirstName());

		vo.setLastName(entity.getLastName());
		vo.setMiddleName(entity.getMiddleName());
		vo.setModificationOn(entity.getModificationOn());
		vo.setModifiedBy(entity.getModifiedBy());
		vo.setSpeciality(entity.getSpeciality());

		DepartmentMasterEntity departmentEntity = entity.getDepartment();
		vo.setDepartment(EntityToVOConverter.convert(departmentEntity));

		return vo;
	}

	public static MedicineMasterVO convert(MedicineMasterEntity entity) {
		if (entity == null) {
			return null;
		}
		MedicineMasterVO vo = new MedicineMasterVO();
		vo.setBatchNo(entity.getBatchNo());
		vo.setCreatedBy(entity.getCreatedBy());
		vo.setCreatedOn(entity.getCreatedOn());
		if (entity.getId() != null) {
			vo.setId(entity.getId());
		}

		vo.setMedicineName(entity.getMedicineName());
		vo.setModificationOn(entity.getModificationOn());
		vo.setModifiedBy(entity.getModifiedBy());
		vo.setPower(entity.getPower());
		vo.setRate(entity.getRate());
		vo.setStatus(entity.getStatus());
		return vo;
	}

	public static CustomerVO convert(CustomerEntity entity) {
		CustomerVO vo = new CustomerVO();
		vo.setCustomerName(entity.getCustomerName());
		vo.setId(entity.getId());

		List<PhoneNumberEntity> list = entity.getPhones();
		List<PhoneNumberVO> volist = new ArrayList<PhoneNumberVO>();
		if (CollectionUtils.isNotEmpty(list)) {
			for (PhoneNumberEntity phone : list) {
				PhoneNumberVO phonevo = convert(phone);
				volist.add(phonevo);
			}
		}
		vo.setPhones(volist);
		return vo;
	}

	public static PhoneNumberVO convert(PhoneNumberEntity entity) {
		PhoneNumberVO vo = new PhoneNumberVO();
		vo.setId(entity.getId());
		vo.setPhNumber(entity.getPhNumber());
/*		List<CustomerEntity> list = entity.getCustomers();
		List<CustomerVO> volist = new ArrayList<CustomerVO>();
		if(CollectionUtils.isNotEmpty(list)){
			for(CustomerEntity customerEntity:list){
				volist.add(EntityToVOConverter.convert(customerEntity));	
			}
		}
		vo.setCustomers(volist);
*/		return vo;
	}

	public static EmployeeVO convert(EmployeeEntity employee) {
		EmployeeVO employeeVO = new EmployeeVO();
		employeeVO.setAge(employee.getAge());
		employeeVO.setId(employee.getId());
		employeeVO.setName(employee.getName());
		
		return employeeVO;
	}

	public static CountryMasterVO convert(CountryMasterEntity countryMaster) {
		// TODO Auto-generated method stub
		return null;
	}

}
