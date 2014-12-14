package com.pristine.vo;

import java.util.Date;

public class CategoryTypeMasterVO {
	private Integer catTypeId;
	
	private String catTypeName;
	
	private Integer status;
	
	private Date createdOn;
	
	private Date modifiedOn;
	
	private Integer createdBy;
	
	private Integer modifiedBy;

	public Integer getCatTypeId() {
		return catTypeId;
	}

	public void setCatTypeId(Integer catTypeId) {
		this.catTypeId = catTypeId;
	}

	public String getCatTypeName() {
		return catTypeName;
	}

	public void setCatTypeName(String catTypeName) {
		this.catTypeName = catTypeName;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public Date getModifiedOn() {
		return modifiedOn;
	}

	public void setModifiedOn(Date modifiedOn) {
		this.modifiedOn = modifiedOn;
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

	
}
