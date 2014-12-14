package com.pristine.service;

import com.pristine.dao.IDoctorMasterDao;
import com.pristine.domain.DoctorMasterEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service("doctorMasterService")
@Transactional
public class DoctorMasterServiceImpl implements IDoctorMasterService{

	@Autowired
	private IDoctorMasterDao doctorMasterDao;
	
	@Override
	public Integer createDoctorMaster(DoctorMasterEntity doctorMaster){
		doctorMasterDao.add(doctorMaster);
		return null;
	}
	
	@Override
	public Integer updateDoctorMaster(DoctorMasterEntity doctorMaster){
		doctorMasterDao.update(doctorMaster);
		return null;
	}
	
	@Override
	public void deleteDoctorMaster(DoctorMasterEntity doctorMaster){
		doctorMasterDao.remove(doctorMaster);
	}
	
	@Override
	public DoctorMasterEntity getDoctorMaster(Integer id){
		return doctorMasterDao.find(id);
	}
	
}
