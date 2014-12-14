package com.pristine.vo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

public class CountryMasterVO {
	
	private int id;
	
	private String countryName;

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	private List<StateMasterVO> stateMasters = new ArrayList<StateMasterVO>();

	
	
	public List<StateMasterVO> getStateMasters() {
		return stateMasters;
	}

	public void setStateMasters(List<StateMasterVO> stateMasters) {
		this.stateMasters = stateMasters;
	}

	public CountryMasterVO(String countryName) {
		this.countryName = countryName;
	}

	public CountryMasterVO() {
	}

}
