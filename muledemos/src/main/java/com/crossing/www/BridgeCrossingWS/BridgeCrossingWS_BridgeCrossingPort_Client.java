
package com.crossing.www.BridgeCrossingWS;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.5.1
 * 2014-10-01T14:46:47.919+01:00
 * Generated source version: 2.5.1
 * 
 */
public final class BridgeCrossingWS_BridgeCrossingPort_Client {

    private static final QName SERVICE_NAME = new QName("http://www.crossing.com/BridgeCrossingWS/", "BridgeCrossingWS");

    private BridgeCrossingWS_BridgeCrossingPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = BridgeCrossingWS_Service.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        BridgeCrossingWS_Service ss = new BridgeCrossingWS_Service(wsdlURL, SERVICE_NAME);
        BridgeCrossingWS port = ss.getBridgeCrossingPort();  
        
        {
        System.out.println("Invoking sendCrossingDetails...");
        java.lang.String _sendCrossingDetails_vrn = "";
        java.lang.String _sendCrossingDetails_gateno = "";
        java.lang.String _sendCrossingDetails_direction = "";
        java.lang.String _sendCrossingDetails__return = port.sendCrossingDetails(_sendCrossingDetails_vrn, _sendCrossingDetails_gateno, _sendCrossingDetails_direction);
        System.out.println("sendCrossingDetails.result=" + _sendCrossingDetails__return);


        }

        System.exit(0);
    }

}