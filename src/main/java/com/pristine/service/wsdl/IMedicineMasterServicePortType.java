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
 * 2014-12-15T15:28:10.239+05:30
 * Generated source version: 3.0.2
 * 
 */
@WebService(targetNamespace = "http://wsdl.service.pristine.com/", name = "IMedicineMasterServicePortType")
@XmlSeeAlso({ObjectFactory.class})
public interface IMedicineMasterServicePortType {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "createMedicineMaster", targetNamespace = "http://wsdl.service.pristine.com/", className = "com.pristine.service.wsdl.CreateMedicineMaster")
    @WebMethod
    @ResponseWrapper(localName = "createMedicineMasterResponse", targetNamespace = "http://wsdl.service.pristine.com/", className = "com.pristine.service.wsdl.CreateMedicineMasterResponse")
    public java.lang.Integer createMedicineMaster(
        @WebParam(name = "arg0", targetNamespace = "")
        com.pristine.service.wsdl.MedicineMasterVO arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getMedicineMasterById", targetNamespace = "http://wsdl.service.pristine.com/", className = "com.pristine.service.wsdl.GetMedicineMasterById")
    @WebMethod
    @ResponseWrapper(localName = "getMedicineMasterByIdResponse", targetNamespace = "http://wsdl.service.pristine.com/", className = "com.pristine.service.wsdl.GetMedicineMasterByIdResponse")
    public com.pristine.service.wsdl.MedicineMasterVO getMedicineMasterById(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.Integer arg0
    );

    @RequestWrapper(localName = "deleteMedicineMaster", targetNamespace = "http://wsdl.service.pristine.com/", className = "com.pristine.service.wsdl.DeleteMedicineMaster")
    @WebMethod
    @ResponseWrapper(localName = "deleteMedicineMasterResponse", targetNamespace = "http://wsdl.service.pristine.com/", className = "com.pristine.service.wsdl.DeleteMedicineMasterResponse")
    public void deleteMedicineMaster(
        @WebParam(name = "arg0", targetNamespace = "")
        com.pristine.service.wsdl.MedicineMasterVO arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "updateMedicineMaster", targetNamespace = "http://wsdl.service.pristine.com/", className = "com.pristine.service.wsdl.UpdateMedicineMaster")
    @WebMethod
    @ResponseWrapper(localName = "updateMedicineMasterResponse", targetNamespace = "http://wsdl.service.pristine.com/", className = "com.pristine.service.wsdl.UpdateMedicineMasterResponse")
    public java.lang.Integer updateMedicineMaster(
        @WebParam(name = "arg0", targetNamespace = "")
        com.pristine.service.wsdl.MedicineMasterVO arg0
    );
}