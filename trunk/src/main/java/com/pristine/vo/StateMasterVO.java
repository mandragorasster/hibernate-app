package com.pristine.vo;


public class StateMasterVO {
	
	private Integer id;
	
	private CountryMasterVO countryMaster;
	
	private String stateName;

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	
	public CountryMasterVO getCountryMaster() {
		return countryMaster;
	}

	public void setCountryMaster(CountryMasterVO countryMaster) {
		this.countryMaster = countryMaster;
	}

	
	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public StateMasterVO(String stateName) {
		this.stateName = stateName;
	}

	public StateMasterVO() {
	}
	
	
}
