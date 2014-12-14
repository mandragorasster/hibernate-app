package com.pristine.vo;

import java.util.ArrayList;
import java.util.List;

public class CustomerVO {
	private Integer id;

	private String customerName;

	private List<PhoneNumberVO> phones = new ArrayList<PhoneNumberVO>();

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

	public void setPhones(List<PhoneNumberVO> phones) {
		this.phones = phones;
	}

	public List<PhoneNumberVO> getPhones() {
		return phones;
	}
	
	public CustomerVO(String customerName) {
		this.customerName = customerName;
	}

	public CustomerVO() {
	}

}
