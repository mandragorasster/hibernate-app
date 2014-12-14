package com.pristine.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity(name="cat_type_master")
public class CategoryTypeMasterEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator= "catTypeid-gen")
	@SequenceGenerator(name = "catTypeid-gen", sequenceName = "CAT_TYPE_SEQ", allocationSize = 1, initialValue = 0)
	@Column(name="CAT_TYPE_ID")
	private Integer catTypeId;
	
	@Column(name="CAT_TYPE_NAME")
	private String catTypeName;
	
	@Column(name="STATUS")
	private Integer status;
	
	@Column(name="CREATED_ON")
	private Date createdOn;
	
	@Column(name="MODIFIED_ON")
	private Date modifiedOn;
	
	@Column(name="CREATED_BY")
	private Integer createdBy;
	
	@Column(name="MODIFIED_BY")
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
