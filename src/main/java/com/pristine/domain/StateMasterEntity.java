package com.pristine.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity(name="state_master")
public class StateMasterEntity {
	
	@Id
//	@GeneratedValue(strategy= GenerationType.AUTO)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator= "stateid-gen")
	@SequenceGenerator(name = "stateid-gen", sequenceName = "STATE_SEQ", allocationSize = 1, initialValue = 0)
	@Column(name="STATE_ID")
	private Integer id;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="COUNTRY_ID", nullable=true)
	private CountryMasterEntity countryMaster;
	
	@Column(name="STATE_NAME")
	private String stateName;

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	
	public CountryMasterEntity getCountryMaster() {
		return countryMaster;
	}

	public void setCountryMaster(CountryMasterEntity countryMaster) {
		this.countryMaster = countryMaster;
	}

	
	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public StateMasterEntity(String stateName) {
		this.stateName = stateName;
	}

	public StateMasterEntity() {
	}
	
	
}
