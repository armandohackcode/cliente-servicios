
package com.banco.ws;

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
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WSBanco", targetNamespace = "http://ws.banco.com/", wsdlLocation = "http://localhost:8080/WSBanco/WSBanco?wsdl")
public class WSBanco_Service
    extends Service
{

    private final static URL WSBANCO_WSDL_LOCATION;
    private final static WebServiceException WSBANCO_EXCEPTION;
    private final static QName WSBANCO_QNAME = new QName("http://ws.banco.com/", "WSBanco");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/WSBanco/WSBanco?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WSBANCO_WSDL_LOCATION = url;
        WSBANCO_EXCEPTION = e;
    }

    public WSBanco_Service() {
        super(__getWsdlLocation(), WSBANCO_QNAME);
    }

    public WSBanco_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), WSBANCO_QNAME, features);
    }

    public WSBanco_Service(URL wsdlLocation) {
        super(wsdlLocation, WSBANCO_QNAME);
    }

    public WSBanco_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WSBANCO_QNAME, features);
    }

    public WSBanco_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WSBanco_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WSBanco
     */
    @WebEndpoint(name = "WSBancoPort")
    public WSBanco getWSBancoPort() {
        return super.getPort(new QName("http://ws.banco.com/", "WSBancoPort"), WSBanco.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WSBanco
     */
    @WebEndpoint(name = "WSBancoPort")
    public WSBanco getWSBancoPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.banco.com/", "WSBancoPort"), WSBanco.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WSBANCO_EXCEPTION!= null) {
            throw WSBANCO_EXCEPTION;
        }
        return WSBANCO_WSDL_LOCATION;
    }

}
