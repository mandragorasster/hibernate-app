package com.pristine.domain;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity(name = "Doctor_Master")
public class DoctorMasterEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator= "doctorid-gen")
	@SequenceGenerator(name = "doctorid-gen", sequenceName = "DOCTOR_SEQ", allocationSize = 1, initialValue = 0)
	@Column(name="DOCTOR_ID")
	private int id;

	@Column(name = "FIRST_NAME")
	private String firstName;

	@Column(name = "MIDDLE_NAME")
	private String middleName;

	@Column(name = "LAST_NAME")
	private String lastName;

	@Column(name = "DEGREE")
	private String degree;

	@Column(name = "SPECIALITY")
	private String speciality;

	@Column(name = "CONTACT_NO")
	private String contactNo;

	@Column(name = "ACTIVE")
	private Integer active;

	@Column(name = "CREATED_ON")
	private Date createdOn;

	@Column(name = "MODIFIED_ON")
	private Date modificationOn;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="DEPARTMENT_ID", nullable=true)
	private DepartmentMasterEntity department;
	
	@Column(name = "CREATED_BY")
	private Integer createdBy;

	@Column(name = "MODIFIED_BY")
	private Integer modifiedBy;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public Integer getActive() {
		return active;
	}

	public void setActive(Integer active) {
		this.active = active;
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

	public DepartmentMasterEntity getDepartment() {
		return department;
	}

	public void setDepartment(DepartmentMasterEntity department) {
		this.department = department;
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
