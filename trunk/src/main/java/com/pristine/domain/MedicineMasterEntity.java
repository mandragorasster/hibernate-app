package com.pristine.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="Medicine_master")
public class MedicineMasterEntity {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="MEDICINE_ID")
	private int id;
	
	@Column(name="MEDICINE_NAME")
	private String medicineName;
	
	@Column(name="POWER")
	private int power;
	
	@Column(name="BATCH_NO")
	private String batchNo;
	
	@Column(name="RATE")
	private float rate;
	
	@Column(name="STATUS")
	private char status;
	
	@Column(name = "CREATED_ON")
	private Date createdOn;

	@Column(name = "MODIFIED_ON")
	private Date modificationOn;
	
	@Column(name = "CREATED_BY")
	private Integer createdBy;

	@Column(name = "MODIFIED_BY")
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
