package com.pristine.service;

import com.pristine.domain.MedicineMasterEntity;


public interface IMedicineMasterService {

	public Integer createMedicineMaster(MedicineMasterEntity medicineMaster);
	
	public Integer updateMedicineMaster(MedicineMasterEntity medicineMaster);
	
	public void deleteMedicineMaster(MedicineMasterEntity medicineMaster);
	
	public MedicineMasterEntity getMedicineMasterById(Integer id);
	
}
