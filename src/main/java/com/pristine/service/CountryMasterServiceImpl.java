package com.pristine.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pristine.dao.ICountryMasterDao;
import com.pristine.domain.CountryMasterEntity;
import com.pristine.domain.StateMasterEntity;

@Service("countryMasterService")
@Transactional
public class CountryMasterServiceImpl implements ICountryMasterService{

	@Autowired
	ICountryMasterDao countryMasterDao;
	@Override
	public CountryMasterEntity getCountryMaster(Integer id) {
		
		return new CountryMasterEntity();
	}

	@Override
	public void deleteCountryMaster(Integer id) {
		CountryMasterEntity countryMaster = countryMasterDao.find(id);
		countryMasterDao.remove(countryMaster);
		
	}

	@Override
	public void updateCountryMaster(CountryMasterEntity countryMaster) {
		countryMasterDao.update(countryMaster);
		
	}

	@Override
	public Integer createCountryMaster(CountryMasterEntity countryMaster) {
		countryMasterDao.add(countryMaster);
		System.out.println(countryMaster.getId());
		return countryMaster.getId();
	}

	@Override
	public List<StateMasterEntity> getStatesByCountryId(Integer countryId) {
		
		return null;
	}
	
	
}
