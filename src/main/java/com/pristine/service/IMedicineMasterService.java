package com.pristine.service;

import com.pristine.vo.MedicineMasterVO;


public interface IMedicineMasterService {

	public Integer createMedicineMaster(MedicineMasterVO medicineMaster);
	
	public Integer updateMedicineMaster(MedicineMasterVO medicineMaster);
	
	public void deleteMedicineMaster(MedicineMasterVO medicineMaster);
	
	public MedicineMasterVO getMedicineMasterById(Integer id);
	
}
