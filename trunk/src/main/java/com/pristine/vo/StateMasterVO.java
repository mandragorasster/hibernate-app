package com.pristine.vo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

public class StateMasterVO {
	
	private Integer id;
	
	private CountryMasterVO countryMaster;
	
	@Column(name="STATE_NAME")
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
