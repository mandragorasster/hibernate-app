package com.pristine.service;

import com.pristine.vo.DoctorMasterVO;


public interface IDoctorMasterService {

	public Integer createDoctorMaster(DoctorMasterVO doctorMaster);
	
	public Integer updateDoctorMaster(DoctorMasterVO doctorMaster);
	
	public void deleteDoctorMaster(DoctorMasterVO doctorMaster);
	
	public DoctorMasterVO getDoctorMaster(Integer id);
	
}
