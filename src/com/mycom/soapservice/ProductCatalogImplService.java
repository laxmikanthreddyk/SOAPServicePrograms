
package com.mycom.soapservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ProductCatalogImplService", targetNamespace = "http://soapservice.mycom.com/", wsdlLocation = "http://localhost:8080/SOAPWebservice/ProductCatalog?wsdl")
public class ProductCatalogImplService
    extends Service
{

    private final static URL PRODUCTCATALOGIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException PRODUCTCATALOGIMPLSERVICE_EXCEPTION;
    private final static QName PRODUCTCATALOGIMPLSERVICE_QNAME = new QName("http://soapservice.mycom.com/", "ProductCatalogImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/SOAPWebservice/ProductCatalog?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PRODUCTCATALOGIMPLSERVICE_WSDL_LOCATION = url;
        PRODUCTCATALOGIMPLSERVICE_EXCEPTION = e;
    }

    public ProductCatalogImplService() {
        super(__getWsdlLocation(), PRODUCTCATALOGIMPLSERVICE_QNAME);
    }

    public ProductCatalogImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), PRODUCTCATALOGIMPLSERVICE_QNAME, features);
    }

    public ProductCatalogImplService(URL wsdlLocation) {
        super(wsdlLocation, PRODUCTCATALOGIMPLSERVICE_QNAME);
    }

    public ProductCatalogImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PRODUCTCATALOGIMPLSERVICE_QNAME, features);
    }

    public ProductCatalogImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ProductCatalogImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ProductCatalog
     */
    @WebEndpoint(name = "ProductCatalogImplPort")
    public ProductCatalog getProductCatalogImplPort() {
        return super.getPort(new QName("http://soapservice.mycom.com/", "ProductCatalogImplPort"), ProductCatalog.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ProductCatalog
     */
    @WebEndpoint(name = "ProductCatalogImplPort")
    public ProductCatalog getProductCatalogImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://soapservice.mycom.com/", "ProductCatalogImplPort"), ProductCatalog.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PRODUCTCATALOGIMPLSERVICE_EXCEPTION!= null) {
            throw PRODUCTCATALOGIMPLSERVICE_EXCEPTION;
        }
        return PRODUCTCATALOGIMPLSERVICE_WSDL_LOCATION;
    }

}