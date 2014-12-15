
package com.pristine.service.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for doctorMasterVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="doctorMasterVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="contactNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createdBy" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="createdOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="degree" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="department" type="{http://wsdl.service.pristine.com/}departmentMasterVO" minOccurs="0"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modificationOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="modifiedBy" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="speciality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "doctorMasterVO", propOrder = {
    "active",
    "contactNo",
    "createdBy",
    "createdOn",
    "degree",
    "department",
    "firstName",
    "id",
    "lastName",
    "middleName",
    "modificationOn",
    "modifiedBy",
    "speciality"
})
public class DoctorMasterVO {

    protected Integer active;
    protected String contactNo;
    protected Integer createdBy;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdOn;
    protected String degree;
    protected DepartmentMasterVO department;
    protected String firstName;
    protected int id;
    protected String lastName;
    protected String middleName;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modificationOn;
    protected Integer modifiedBy;
    protected String speciality;

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setActive(Integer value) {
        this.active = value;
    }

    /**
     * Gets the value of the contactNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactNo() {
        return contactNo;
    }

    /**
     * Sets the value of the contactNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactNo(String value) {
        this.contactNo = value;
    }

    /**
     * Gets the value of the createdBy property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the createdBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCreatedBy(Integer value) {
        this.createdBy = value;
    }

    /**
     * Gets the value of the createdOn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedOn() {
        return createdOn;
    }

    /**
     * Sets the value of the createdOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedOn(XMLGregorianCalendar value) {
        this.createdOn = value;
    }

    /**
     * Gets the value of the degree property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDegree() {
        return degree;
    }

    /**
     * Sets the value of the degree property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDegree(String value) {
        this.degree = value;
    }

    /**
     * Gets the value of the department property.
     * 
     * @return
     *     possible object is
     *     {@link DepartmentMasterVO }
     *     
     */
    public DepartmentMasterVO getDepartment() {
        return department;
    }

    /**
     * Sets the value of the department property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepartmentMasterVO }
     *     
     */
    public void setDepartment(DepartmentMasterVO value) {
        this.department = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the modificationOn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModificationOn() {
        return modificationOn;
    }

    /**
     * Sets the value of the modificationOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setModificationOn(XMLGregorianCalendar value) {
        this.modificationOn = value;
    }

    /**
     * Gets the value of the modifiedBy property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getModifiedBy() {
        return modifiedBy;
    }

    /**
     * Sets the value of the modifiedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setModifiedBy(Integer value) {
        this.modifiedBy = value;
    }

    /**
     * Gets the value of the speciality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeciality() {
        return speciality;
    }

    /**
     * Sets the value of the speciality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeciality(String value) {
        this.speciality = value;
    }

}
