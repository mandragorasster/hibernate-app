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
import com.pristine.domain.StateMasterEntity;
import com.pristine.vo.CategoryTypeMasterVO;
import com.pristine.vo.CountryMasterVO;
import com.pristine.vo.CustomerVO;
import com.pristine.vo.DepartmentMasterVO;
import com.pristine.vo.DoctorMasterVO;
import com.pristine.vo.EmployeeVO;
import com.pristine.vo.MedicineMasterVO;
import com.pristine.vo.PhoneNumberVO;
import com.pristine.vo.StateMasterVO;

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
		CustomerEntity entity = new CustomerEntity();
		entity.setCustomerName(customerVO.getCustomerName());
		entity.setId(customerVO.getId());

		List<PhoneNumberEntity> list = new ArrayList<PhoneNumberEntity>();
		List<PhoneNumberVO> volist = customerVO.getPhones();
		if (CollectionUtils.isNotEmpty(volist)) {
			for (PhoneNumberVO phone : volist) {
				PhoneNumberEntity phoneentity = convert(phone);
				list.add(phoneentity);
			}
		}
		entity.setPhones(list);
		return entity;
	}

	public static PhoneNumberEntity convert(PhoneNumberVO phoneVO) {
		PhoneNumberEntity entity = new PhoneNumberEntity();
		entity.setId(phoneVO.getId());
		entity.setPhNumber(phoneVO.getPhNumber());
		List<CustomerEntity> list = new ArrayList<CustomerEntity>();
		List<CustomerVO> volist = phoneVO.getCustomers();
		if (CollectionUtils.isNotEmpty(volist)) {
			for (CustomerVO vo : volist) {
				list.add(VOToEntityConverter.convert(vo));
			}
		}
		entity.setCustomers(list);
		return entity;
	}

	public static EmployeeEntity convert(EmployeeVO employeeVO) {
		EmployeeEntity employee = new EmployeeEntity();
		employee.setAge(employeeVO.getAge());
		employee.setId(employeeVO.getId());
		employee.setName(employeeVO.getName());

		return employee;
	}

	public static CountryMasterEntity convert(CountryMasterVO masterVO) {
		CountryMasterEntity entity = new CountryMasterEntity();
		entity.setCountryName(masterVO.getCountryName());
		entity.setId(masterVO.getId());
		List<StateMasterEntity> stateMasters = new ArrayList<StateMasterEntity>();
		
		List<StateMasterVO> stateVOList= masterVO.getStateMasters();
		if(CollectionUtils.isNotEmpty(stateVOList)){
			for(StateMasterVO stateMasterVO : stateVOList){
				stateMasters.add(convert(stateMasterVO));	
			}
		}
		entity.setStateMasters(stateMasters );
		
		return entity;
	}

	public static StateMasterEntity convert(StateMasterVO masterVO) {
		StateMasterEntity entity = new StateMasterEntity();
		entity.setId(masterVO.getId());
		entity.setStateName(masterVO.getStateName());
		if(masterVO.getCountryMaster()!=null){
			entity.setCountryMaster(VOToEntityConverter.convert(masterVO.getCountryMaster()));	
		}
		
		return entity;
	}

}
