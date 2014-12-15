package com.pristine.vo;

import java.util.List;

public class PhoneNumberVO {
	private Integer id;

	private String phNumber;

	
	private List<CustomerVO> customers;

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

	public void setCustomers(List<CustomerVO> customers) {
		this.customers = customers;
	}
	public PhoneNumberVO(Integer id) {
		this.id = id;
	}

	public PhoneNumberVO(String phNumber) {
		this.phNumber = phNumber;
	}

	public PhoneNumberVO() {
	}
	
	public List<CustomerVO> getCustomers() {
		return customers;
	}

}
