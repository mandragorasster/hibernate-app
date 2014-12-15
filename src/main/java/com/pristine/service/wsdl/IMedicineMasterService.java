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
 * 2014-12-15T15:28:10.243+05:30
 * Generated source version: 3.0.2
 * 
 */
@WebServiceClient(name = "IMedicineMasterService", 
                  wsdlLocation = "file:/C:/Java/hibernate/wsdltojava/src/main/resources/IMedicineMasterService.wsdl",
                  targetNamespace = "http://wsdl.service.pristine.com/") 
public class IMedicineMasterService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://wsdl.service.pristine.com/", "IMedicineMasterService");
    public final static QName IMedicineMasterServicePort = new QName("http://wsdl.service.pristine.com/", "IMedicineMasterServicePort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Java/hibernate/wsdltojava/src/main/resources/IMedicineMasterService.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(IMedicineMasterService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Java/hibernate/wsdltojava/src/main/resources/IMedicineMasterService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public IMedicineMasterService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public IMedicineMasterService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public IMedicineMasterService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public IMedicineMasterService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public IMedicineMasterService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public IMedicineMasterService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    

    /**
     *
     * @return
     *     returns IMedicineMasterServicePortType
     */
    @WebEndpoint(name = "IMedicineMasterServicePort")
    public IMedicineMasterServicePortType getIMedicineMasterServicePort() {
        return super.getPort(IMedicineMasterServicePort, IMedicineMasterServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IMedicineMasterServicePortType
     */
    @WebEndpoint(name = "IMedicineMasterServicePort")
    public IMedicineMasterServicePortType getIMedicineMasterServicePort(WebServiceFeature... features) {
        return super.getPort(IMedicineMasterServicePort, IMedicineMasterServicePortType.class, features);
    }

}
