package com.pristine.service;

import java.util.List;

import com.pristine.domain.CountryMasterEntity;
import com.pristine.domain.StateMasterEntity;
import com.pristine.util.GenericDao;

public interface ICountryMasterService {
	
	public CountryMasterEntity getCountryMaster(Integer id);
	
	public void deleteCountryMaster(Integer id);
	
	public void updateCountryMaster(CountryMasterEntity countryMaster);
	
	public Integer createCountryMaster(CountryMasterEntity countryMaster);
	
	public List<StateMasterEntity> getStatesByCountryId(Integer countryId);

}
