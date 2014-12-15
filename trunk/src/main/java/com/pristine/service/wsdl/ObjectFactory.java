
package com.pristine.service.wsdl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.pristine.service.wsdl package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _MedicineMaster_QNAME = new QName("http://wsdl.service.pristine.com/", "MedicineMaster");
    private final static QName _CreateMedicineMasterResponse_QNAME = new QName("http://wsdl.service.pristine.com/", "createMedicineMasterResponse");
    private final static QName _GetMedicineMasterById_QNAME = new QName("http://wsdl.service.pristine.com/", "getMedicineMasterById");
    private final static QName _UpdateMedicineMasterResponse_QNAME = new QName("http://wsdl.service.pristine.com/", "updateMedicineMasterResponse");
    private final static QName _CreateMedicineMaster_QNAME = new QName("http://wsdl.service.pristine.com/", "createMedicineMaster");
    private final static QName _UpdateMedicineMaster_QNAME = new QName("http://wsdl.service.pristine.com/", "updateMedicineMaster");
    private final static QName _DeleteMedicineMaster_QNAME = new QName("http://wsdl.service.pristine.com/", "deleteMedicineMaster");
    private final static QName _DeleteMedicineMasterResponse_QNAME = new QName("http://wsdl.service.pristine.com/", "deleteMedicineMasterResponse");
    private final static QName _GetMedicineMasterByIdResponse_QNAME = new QName("http://wsdl.service.pristine.com/", "getMedicineMasterByIdResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.pristine.service.wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateMedicineMasterResponse }
     * 
     */
    public CreateMedicineMasterResponse createCreateMedicineMasterResponse() {
        return new CreateMedicineMasterResponse();
    }

    /**
     * Create an instance of {@link MedicineMasterVO }
     * 
     */
    public MedicineMasterVO createMedicineMasterVO() {
        return new MedicineMasterVO();
    }

    /**
     * Create an instance of {@link UpdateMedicineMaster }
     * 
     */
    public UpdateMedicineMaster createUpdateMedicineMaster() {
        return new UpdateMedicineMaster();
    }

    /**
     * Create an instance of {@link CreateMedicineMaster }
     * 
     */
    public CreateMedicineMaster createCreateMedicineMaster() {
        return new CreateMedicineMaster();
    }

    /**
     * Create an instance of {@link UpdateMedicineMasterResponse }
     * 
     */
    public UpdateMedicineMasterResponse createUpdateMedicineMasterResponse() {
        return new UpdateMedicineMasterResponse();
    }

    /**
     * Create an instance of {@link GetMedicineMasterById }
     * 
     */
    public GetMedicineMasterById createGetMedicineMasterById() {
        return new GetMedicineMasterById();
    }

    /**
     * Create an instance of {@link DeleteMedicineMaster }
     * 
     */
    public DeleteMedicineMaster createDeleteMedicineMaster() {
        return new DeleteMedicineMaster();
    }

    /**
     * Create an instance of {@link GetMedicineMasterByIdResponse }
     * 
     */
    public GetMedicineMasterByIdResponse createGetMedicineMasterByIdResponse() {
        return new GetMedicineMasterByIdResponse();
    }

    /**
     * Create an instance of {@link DeleteMedicineMasterResponse }
     * 
     */
    public DeleteMedicineMasterResponse createDeleteMedicineMasterResponse() {
        return new DeleteMedicineMasterResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MedicineMasterVO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.service.pristine.com/", name = "MedicineMaster")
    public JAXBElement<MedicineMasterVO> createMedicineMaster(MedicineMasterVO value) {
        return new JAXBElement<MedicineMasterVO>(_MedicineMaster_QNAME, MedicineMasterVO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateMedicineMasterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.service.pristine.com/", name = "createMedicineMasterResponse")
    public JAXBElement<CreateMedicineMasterResponse> createCreateMedicineMasterResponse(CreateMedicineMasterResponse value) {
        return new JAXBElement<CreateMedicineMasterResponse>(_CreateMedicineMasterResponse_QNAME, CreateMedicineMasterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMedicineMasterById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.service.pristine.com/", name = "getMedicineMasterById")
    public JAXBElement<GetMedicineMasterById> createGetMedicineMasterById(GetMedicineMasterById value) {
        return new JAXBElement<GetMedicineMasterById>(_GetMedicineMasterById_QNAME, GetMedicineMasterById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateMedicineMasterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.service.pristine.com/", name = "updateMedicineMasterResponse")
    public JAXBElement<UpdateMedicineMasterResponse> createUpdateMedicineMasterResponse(UpdateMedicineMasterResponse value) {
        return new JAXBElement<UpdateMedicineMasterResponse>(_UpdateMedicineMasterResponse_QNAME, UpdateMedicineMasterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateMedicineMaster }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.service.pristine.com/", name = "createMedicineMaster")
    public JAXBElement<CreateMedicineMaster> createCreateMedicineMaster(CreateMedicineMaster value) {
        return new JAXBElement<CreateMedicineMaster>(_CreateMedicineMaster_QNAME, CreateMedicineMaster.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateMedicineMaster }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.service.pristine.com/", name = "updateMedicineMaster")
    public JAXBElement<UpdateMedicineMaster> createUpdateMedicineMaster(UpdateMedicineMaster value) {
        return new JAXBElement<UpdateMedicineMaster>(_UpdateMedicineMaster_QNAME, UpdateMedicineMaster.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteMedicineMaster }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.service.pristine.com/", name = "deleteMedicineMaster")
    public JAXBElement<DeleteMedicineMaster> createDeleteMedicineMaster(DeleteMedicineMaster value) {
        return new JAXBElement<DeleteMedicineMaster>(_DeleteMedicineMaster_QNAME, DeleteMedicineMaster.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteMedicineMasterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.service.pristine.com/", name = "deleteMedicineMasterResponse")
    public JAXBElement<DeleteMedicineMasterResponse> createDeleteMedicineMasterResponse(DeleteMedicineMasterResponse value) {
        return new JAXBElement<DeleteMedicineMasterResponse>(_DeleteMedicineMasterResponse_QNAME, DeleteMedicineMasterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMedicineMasterByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.service.pristine.com/", name = "getMedicineMasterByIdResponse")
    public JAXBElement<GetMedicineMasterByIdResponse> createGetMedicineMasterByIdResponse(GetMedicineMasterByIdResponse value) {
        return new JAXBElement<GetMedicineMasterByIdResponse>(_GetMedicineMasterByIdResponse_QNAME, GetMedicineMasterByIdResponse.class, null, value);
    }

}
