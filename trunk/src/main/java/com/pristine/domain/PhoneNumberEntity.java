package com.pristine.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

@Entity(name = "PHONE")
public class PhoneNumberEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "phoneid-gen")
	@SequenceGenerator(name = "phoneid-gen", sequenceName = "PHONE_SEQ", allocationSize = 1, initialValue = 0)
	@Column(name = "PHONE_ID")
	private Integer id;

	private String phNumber;

	
	@ManyToMany(cascade ={CascadeType.ALL})
    @JoinTable(name = "CUST_PHONE", joinColumns = @JoinColumn(name = "PHONE_ID", referencedColumnName = "PHONE_ID"), 
    				inverseJoinColumns = @JoinColumn(name = "CUSTOMER_ID", referencedColumnName = "CUSTOMER_ID"))
	private List<CustomerEntity> customers;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPhNumber() {
		return phNumber;
	}

	public void setPhNumber(String phNumber) {
		this.phNumber = phNumber;
	}

	public void setCustomers(List<CustomerEntity> customers) {
		this.customers = customers;
	}
	public PhoneNumberEntity(Integer id) {
		this.id = id;
	}

	public PhoneNumberEntity(String phNumber) {
		this.phNumber = phNumber;
	}

	public PhoneNumberEntity() {
	}
	
	public List<CustomerEntity> getCustomers() {
		return customers;
	}

}
