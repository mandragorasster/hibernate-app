package com.pristine.vo;

import java.util.Date;

public class MedicineMasterVO {
	private int id;
	
	private String medicineName;
	
	private int power;
	
	private String batchNo;
	
	private float rate;
	
	private char status;
	
	private Date createdOn;

	private Date modificationOn;
	
	private Integer createdBy;

	private Integer modifiedBy;

	/*@Column(name="CAT_TYPE_ID")
	private int catTypeId;
	
	public int getCatTypeId() {
		return catTypeId;
	}

	public void setCatTypeId(int catTypeId) {
		this.catTypeId = catTypeId;
	}*/

	
	public int getPower() {
		return power;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMedicineName() {
		return medicineName;
	}

	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public Date getModificationOn() {
		return modificationOn;
	}

	public void setModificationOn(Date modificationOn) {
		this.modificationOn = modificationOn;
	}

	public Integer getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	public Integer getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(Integer modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public String getBatchNo() {
		return batchNo;
	}

	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	public float getRate() {
		return rate;
	}

	public void setRate(float rate) {
		this.rate = rate;
	}

	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
	}

	

}
