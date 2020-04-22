//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.04 at 09:27:13 AM GMT 
//


package com.solace.psg.sempv1.solacesempreply;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for qendpt-unbind-stats complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="qendpt-unbind-stats">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="unbind-requests" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="unbind-responses" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="ok-response" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="fail-not-found" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="fail-other" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "qendpt-unbind-stats", propOrder = {
        "unbindRequests",
        "unbindResponses",
        "okResponse",
        "failNotFound",
        "failOther"
})
public class QendptUnbindStats {

    @XmlElement(name = "unbind-requests")
    @XmlSchemaType(name = "unsignedInt")
    protected long unbindRequests;
    @XmlElement(name = "unbind-responses")
    @XmlSchemaType(name = "unsignedInt")
    protected long unbindResponses;
    @XmlElement(name = "ok-response")
    @XmlSchemaType(name = "unsignedInt")
    protected long okResponse;
    @XmlElement(name = "fail-not-found")
    @XmlSchemaType(name = "unsignedInt")
    protected long failNotFound;
    @XmlElement(name = "fail-other")
    @XmlSchemaType(name = "unsignedInt")
    protected long failOther;

    /**
     * Gets the value of the unbindRequests property.
     */
    public long getUnbindRequests() {
        return unbindRequests;
    }

    /**
     * Sets the value of the unbindRequests property.
     */
    public void setUnbindRequests(long value) {
        this.unbindRequests = value;
    }

    /**
     * Gets the value of the unbindResponses property.
     */
    public long getUnbindResponses() {
        return unbindResponses;
    }

    /**
     * Sets the value of the unbindResponses property.
     */
    public void setUnbindResponses(long value) {
        this.unbindResponses = value;
    }

    /**
     * Gets the value of the okResponse property.
     */
    public long getOkResponse() {
        return okResponse;
    }

    /**
     * Sets the value of the okResponse property.
     */
    public void setOkResponse(long value) {
        this.okResponse = value;
    }

    /**
     * Gets the value of the failNotFound property.
     */
    public long getFailNotFound() {
        return failNotFound;
    }

    /**
     * Sets the value of the failNotFound property.
     */
    public void setFailNotFound(long value) {
        this.failNotFound = value;
    }

    /**
     * Gets the value of the failOther property.
     */
    public long getFailOther() {
        return failOther;
    }

    /**
     * Sets the value of the failOther property.
     */
    public void setFailOther(long value) {
        this.failOther = value;
    }

}
