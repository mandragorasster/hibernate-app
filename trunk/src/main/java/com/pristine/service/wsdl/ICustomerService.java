package com.pristine.service.wsdl;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.0.2
 * 2014-12-15T15:28:09.724+05:30
 * Generated source version: 3.0.2
 * 
 */
@WebServiceClient(name = "ICustomerService", 
                  wsdlLocation = "file:/C:/Java/hibernate/wsdltojava/src/main/resources/ICustomerService.wsdl",
                  targetNamespace = "http://wsdl.service.pristine.com/") 
public class ICustomerService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://wsdl.service.pristine.com/", "ICustomerService");
    public final static QName ICustomerServicePort = new QName("http://wsdl.service.pristine.com/", "ICustomerServicePort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Java/hibernate/wsdltojava/src/main/resources/ICustomerService.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ICustomerService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Java/hibernate/wsdltojava/src/main/resources/ICustomerService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ICustomerService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ICustomerService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ICustomerService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ICustomerService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ICustomerService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ICustomerService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    

    /**
     *
     * @return
     *     returns ICustomerServicePortType
     */
    @WebEndpoint(name = "ICustomerServicePort")
    public ICustomerServicePortType getICustomerServicePort() {
        return super.getPort(ICustomerServicePort, ICustomerServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ICustomerServicePortType
     */
    @WebEndpoint(name = "ICustomerServicePort")
    public ICustomerServicePortType getICustomerServicePort(WebServiceFeature... features) {
        return super.getPort(ICustomerServicePort, ICustomerServicePortType.class, features);
    }

}
