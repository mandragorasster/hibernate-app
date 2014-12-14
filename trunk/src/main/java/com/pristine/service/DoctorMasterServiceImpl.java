package com.pristine.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pristine.dao.IDoctorMasterDao;
import com.pristine.domain.DoctorMasterEntity;
import com.pristine.util.EntityToVOConverter;
import com.pristine.util.VOToEntityConverter;
import com.pristine.vo.DoctorMasterVO;


@Service("doctorMasterService")
@Transactional
public class DoctorMasterServiceImpl implements IDoctorMasterService{

	@Autowired
	private IDoctorMasterDao doctorMasterDao;
	
	@Override
	public Integer createDoctorMaster(DoctorMasterVO doctorMasterVO){
		DoctorMasterEntity doctorMaster = VOToEntityConverter.convert(doctorMasterVO);
		doctorMasterDao.add(doctorMaster);
		return doctorMaster.getId();
	}
	
	@Override
	public Integer updateDoctorMaster(DoctorMasterVO doctorMasterVO){
		DoctorMasterEntity doctorMaster = VOToEntityConverter.convert(doctorMasterVO);
		doctorMasterDao.update(doctorMaster);
		return doctorMaster.getId();
	}
	
	@Override
	public void deleteDoctorMaster(DoctorMasterVO doctorMasterVO){
		DoctorMasterEntity doctorMaster = VOToEntityConverter.convert(doctorMasterVO);
		doctorMasterDao.remove(doctorMaster);
	}
	
	@Override
	public DoctorMasterVO getDoctorMaster(Integer id){
		DoctorMasterEntity doctorMaster = doctorMasterDao.find(id);
		DoctorMasterVO vo = EntityToVOConverter.convert(doctorMaster);
		return vo;
	}
	
}
