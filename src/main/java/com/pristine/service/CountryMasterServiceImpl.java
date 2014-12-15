package com.pristine.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pristine.dao.ICountryMasterDao;
import com.pristine.domain.CountryMasterEntity;
import com.pristine.util.EntityToVOConverter;
import com.pristine.util.VOToEntityConverter;
import com.pristine.vo.CountryMasterVO;
import com.pristine.vo.StateMasterVO;

@Service("countryMasterService")
@Transactional
public class CountryMasterServiceImpl implements ICountryMasterService{

	@Autowired
	ICountryMasterDao countryMasterDao;
	@Override
	public CountryMasterVO getCountryMaster(Integer id) {
		CountryMasterEntity countryMaster = countryMasterDao.find(id);
		CountryMasterVO masterVO= EntityToVOConverter.convert(countryMaster);
		return masterVO;
	}

	@Override
	public void deleteCountryMaster(Integer id) {
		CountryMasterEntity countryMaster = countryMasterDao.find(id);
		countryMasterDao.remove(countryMaster);
		
	}

	@Override
	public void updateCountryMaster(CountryMasterVO masterVO) {
		CountryMasterEntity countryMaster= VOToEntityConverter.convert(masterVO);
		countryMasterDao.update(countryMaster);
		
	}

	@Override
	public Integer createCountryMaster(CountryMasterVO masterVO) {
		CountryMasterEntity countryMaster= VOToEntityConverter.convert(masterVO);
		countryMasterDao.add(countryMaster);
		return countryMaster.getId();
	}

	@Override
	public List<StateMasterVO> getStatesByCountryId(Integer countryId) {
		
		return null;
	}
	
	
}
