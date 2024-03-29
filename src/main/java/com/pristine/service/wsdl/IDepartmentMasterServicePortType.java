package com.pristine.service.wsdl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.0.2
 * 2014-12-15T15:28:09.833+05:30
 * Generated source version: 3.0.2
 * 
 */
@WebService(targetNamespace = "http://wsdl.service.pristine.com/", name = "IDepartmentMasterServicePortType")
@XmlSeeAlso({ObjectFactory.class})
public interface IDepartmentMasterServicePortType {

    @RequestWrapper(localName = "removeDepartment", targetNamespace = "http://wsdl.service.pristine.com/", className = "com.pristine.service.wsdl.RemoveDepartment")
    @WebMethod
    @ResponseWrapper(localName = "removeDepartmentResponse", targetNamespace = "http://wsdl.service.pristine.com/", className = "com.pristine.service.wsdl.RemoveDepartmentResponse")
    public void removeDepartment(
        @WebParam(name = "arg0", targetNamespace = "")
        com.pristine.service.wsdl.DepartmentMasterVO arg0
    );

    @RequestWrapper(localName = "updateDepartment", targetNamespace = "http://wsdl.service.pristine.com/", className = "com.pristine.service.wsdl.UpdateDepartment")
    @WebMethod
    @ResponseWrapper(localName = "updateDepartmentResponse", targetNamespace = "http://wsdl.service.pristine.com/", className = "com.pristine.service.wsdl.UpdateDepartmentResponse")
    public void updateDepartment(
        @WebParam(name = "arg0", targetNamespace = "")
        com.pristine.service.wsdl.DepartmentMasterVO arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "list", targetNamespace = "http://wsdl.service.pristine.com/", className = "com.pristine.service.wsdl.List")
    @WebMethod
    @ResponseWrapper(localName = "listResponse", targetNamespace = "http://wsdl.service.pristine.com/", className = "com.pristine.service.wsdl.ListResponse")
    public java.util.List<com.pristine.service.wsdl.DepartmentMasterVO> list();

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "addDepartment", targetNamespace = "http://wsdl.service.pristine.com/", className = "com.pristine.service.wsdl.AddDepartment")
    @WebMethod
    @ResponseWrapper(localName = "addDepartmentResponse", targetNamespace = "http://wsdl.service.pristine.com/", className = "com.pristine.service.wsdl.AddDepartmentResponse")
    public java.lang.Integer addDepartment(
        @WebParam(name = "arg0", targetNamespace = "")
        com.pristine.service.wsdl.DepartmentMasterVO arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "findDepartment", targetNamespace = "http://wsdl.service.pristine.com/", className = "com.pristine.service.wsdl.FindDepartment")
    @WebMethod
    @ResponseWrapper(localName = "findDepartmentResponse", targetNamespace = "http://wsdl.service.pristine.com/", className = "com.pristine.service.wsdl.FindDepartmentResponse")
    public com.pristine.service.wsdl.DepartmentMasterVO findDepartment(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.Integer arg0
    );
}
