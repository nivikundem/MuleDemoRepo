
package com.crossing.www.BridgeCrossingWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vrn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gateno" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="direction" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "vrn",
    "gateno",
    "direction"
})
@XmlRootElement(name = "sendCrossingDetails")
public class SendCrossingDetails {

    @XmlElement(required = true)
    protected String vrn;
    @XmlElement(required = true)
    protected String gateno;
    @XmlElement(required = true)
    protected String direction;

    /**
     * Gets the value of the vrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVrn() {
        return vrn;
    }

    /**
     * Sets the value of the vrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVrn(String value) {
        this.vrn = value;
    }

    /**
     * Gets the value of the gateno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGateno() {
        return gateno;
    }

    /**
     * Sets the value of the gateno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGateno(String value) {
        this.gateno = value;
    }

    /**
     * Gets the value of the direction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirection(String value) {
        this.direction = value;
    }

}
