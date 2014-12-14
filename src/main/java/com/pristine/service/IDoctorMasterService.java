package com.pristine.service;

import com.pristine.domain.DoctorMasterEntity;


public interface IDoctorMasterService {

	public Integer createDoctorMaster(DoctorMasterEntity doctorMaster);
	
	public Integer updateDoctorMaster(DoctorMasterEntity doctorMaster);
	
	public void deleteDoctorMaster(DoctorMasterEntity doctorMaster);
	
	public DoctorMasterEntity getDoctorMaster(Integer id);
	
}
