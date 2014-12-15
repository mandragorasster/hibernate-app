package com.pristine.service;

import java.util.List;

import com.pristine.vo.CountryMasterVO;
import com.pristine.vo.StateMasterVO;

public interface ICountryMasterService {
	
	public CountryMasterVO getCountryMaster(Integer id);
	
	public void deleteCountryMaster(Integer id);
	
	public void updateCountryMaster(CountryMasterVO countryMaster);
	
	public Integer createCountryMaster(CountryMasterVO countryMaster);
	
	public List<StateMasterVO> getStatesByCountryId(Integer countryId);

}
