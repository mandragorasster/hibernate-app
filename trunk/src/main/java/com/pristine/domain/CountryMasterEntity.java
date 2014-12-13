package com.pristine.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity(name = "Country_master")
public class CountryMasterEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator= "countryid-gen")
	@SequenceGenerator(name = "countryid-gen", sequenceName = "COUNTRY_SEQ", allocationSize = 1, initialValue = 0)
	@Column(name = "COUNTRY_ID")
	private int id;
	
	@Column(name = "COUNTRY_NAME")
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

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "COUNTRY_ID")
	private List<StateMasterEntity> stateMasters = new ArrayList<StateMasterEntity>();

	
	
	public List<StateMasterEntity> getStateMasters() {
		return stateMasters;
	}

	public void setStateMasters(List<StateMasterEntity> stateMasters) {
		this.stateMasters = stateMasters;
	}

	public CountryMasterEntity(String countryName) {
		super();
		this.countryName = countryName;
	}

	public CountryMasterEntity() {
	}

}
