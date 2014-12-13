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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

@Entity(name = "CUSTOMER")
public class CustomerEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customerid-gen")
	@SequenceGenerator(name = "customerid-gen", sequenceName = "CUSTOMER_SEQ", allocationSize = 1, initialValue = 0)
	@Column(name = "CUSTOMER_ID")
	private Integer id;

	private String customerName;

	@ManyToMany(cascade ={CascadeType.ALL})
    @JoinTable(name = "CUST_PHONE", joinColumns = @JoinColumn(name = "CUSTOMER_ID", referencedColumnName = "CUSTOMER_ID"), inverseJoinColumns = @JoinColumn(name = "PHONE_ID", referencedColumnName = "PHONE_ID"))
	private List<PhoneNumberEntity> phones = new ArrayList<PhoneNumberEntity>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void setPhones(List<PhoneNumberEntity> phones) {
		this.phones = phones;
	}

	public List<PhoneNumberEntity> getPhones() {
		return phones;
	}
	
	public CustomerEntity(String customerName) {
		this.customerName = customerName;
	}

	public CustomerEntity() {
	}

}
