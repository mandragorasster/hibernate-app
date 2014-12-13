package com.pristine.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="cat_type_master")
public class CatTypeMasterEntity {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="CAT_TYPE_ID")
	private Integer catTypeId;
	
	@Column(name="CAT_TYPE_NAME")
	private String catTypeName;
	
	@Column(name="STATUS")
	private Integer status;
	
	@Column(name="DATE_CREATED")
	private Date dateCreated;
	
	@Column(name="DATE_MODIFIED")
	private Date dateModified;
	
	@Column(name="CREATED_ID")
	private Integer createdId;
	
	@Column(name="MODIFIED_ID")
	private Integer modifiedId;

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

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Date getDateModified() {
		return dateModified;
	}

	public void setDateModified(Date dateModified) {
		this.dateModified = dateModified;
	}

	public Integer getCreatedId() {
		return createdId;
	}

	public void setCreatedId(Integer createdId) {
		this.createdId = createdId;
	}

	public Integer getModifiedId() {
		return modifiedId;
	}

	public void setModifiedId(Integer modifiedId) {
		this.modifiedId = modifiedId;
	}

}
