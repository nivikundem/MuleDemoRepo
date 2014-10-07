
package com.crossing.www.BridgeCrossingWS;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.crossing.www.BridgeCrossingWS package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.crossing.www.BridgeCrossingWS
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SendCrossingDetails }
     * 
     */
    public SendCrossingDetails createSendCrossingDetails() {
        return new SendCrossingDetails();
    }

    /**
     * Create an instance of {@link SendCrossingDetailsResponse }
     * 
     */
    public SendCrossingDetailsResponse createSendCrossingDetailsResponse() {
        return new SendCrossingDetailsResponse();
    }

}
