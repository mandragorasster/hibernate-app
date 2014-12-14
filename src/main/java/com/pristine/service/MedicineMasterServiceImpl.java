package com.pristine.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pristine.dao.IMedicineMasterDao;
import com.pristine.domain.MedicineMasterEntity;
import com.pristine.util.EntityToVOConverter;
import com.pristine.util.VOToEntityConverter;
import com.pristine.vo.MedicineMasterVO;

@Service("medicineMasterService")
@Transactional
public class MedicineMasterServiceImpl implements IMedicineMasterService{

	@Autowired
	private IMedicineMasterDao medicineMasterDao;
	
	@Override
	public Integer createMedicineMaster(MedicineMasterVO masterVO){
		MedicineMasterEntity medicineMaster  = VOToEntityConverter.convert(masterVO);
		medicineMasterDao.add(medicineMaster);
		return medicineMaster.getId();
	}
	
	@Override
	public Integer updateMedicineMaster(MedicineMasterVO masterVO){
		MedicineMasterEntity medicineMaster  = VOToEntityConverter.convert(masterVO);
		medicineMasterDao.update(medicineMaster);
		return medicineMaster.getId();
	}
	
	@Override
	public void deleteMedicineMaster(MedicineMasterVO masterVO){
		MedicineMasterEntity medicineMaster  = VOToEntityConverter.convert(masterVO);
		medicineMasterDao.remove(medicineMaster);
	}
	
	@Override
	public MedicineMasterVO getMedicineMasterById(Integer id){
		MedicineMasterEntity medicineMaster  =  medicineMasterDao.find(id);
		MedicineMasterVO masterVO = EntityToVOConverter.convert(medicineMaster);
		return masterVO;
	}
	
}
