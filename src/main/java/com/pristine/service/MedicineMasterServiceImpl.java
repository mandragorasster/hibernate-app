package com.pristine.service;

import com.pristine.domain.MedicineMasterEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.pristine.dao.IMedicineMasterDao;

@Service("medicineMasterService")
@Transactional
public class MedicineMasterServiceImpl implements IMedicineMasterService{

	@Autowired
	private IMedicineMasterDao medicineMasterDao;
	
	@Override
	public Integer createMedicineMaster(MedicineMasterEntity medicineMaster){
		medicineMasterDao.add(medicineMaster);
		return null;
	}
	
	@Override
	public Integer updateMedicineMaster(MedicineMasterEntity medicineMaster){
		medicineMasterDao.update(medicineMaster);
		return null;
	}
	
	@Override
	public void deleteMedicineMaster(MedicineMasterEntity medicineMaster){
		medicineMasterDao.remove(medicineMaster);
	}
	
	@Override
	public MedicineMasterEntity getMedicineMasterById(Integer id){
		return medicineMasterDao.find(id);
	}
	
}
