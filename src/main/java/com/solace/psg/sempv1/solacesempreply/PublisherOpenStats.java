//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.28 at 11:41:04 PM BST 
//


package com.solace.psg.sempv1.solacesempreply;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for publisher-open-stats complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="publisher-open-stats"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="requests" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *         &lt;element name="responses" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *         &lt;element name="ok-response" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *         &lt;element name="fail-exceeded-clients" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *         &lt;element name="fail-denied-guaranteed-messages" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *         &lt;element name="fail-other" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "publisher-open-stats", propOrder = {
    "requests",
    "responses",
    "okResponse",
    "failExceededClients",
    "failDeniedGuaranteedMessages",
    "failOther"
})
public class PublisherOpenStats {

    @XmlSchemaType(name = "unsignedInt")
    protected long requests;
    @XmlSchemaType(name = "unsignedInt")
    protected long responses;
    @XmlElement(name = "ok-response")
    @XmlSchemaType(name = "unsignedInt")
    protected long okResponse;
    @XmlElement(name = "fail-exceeded-clients")
    @XmlSchemaType(name = "unsignedInt")
    protected long failExceededClients;
    @XmlElement(name = "fail-denied-guaranteed-messages")
    @XmlSchemaType(name = "unsignedInt")
    protected long failDeniedGuaranteedMessages;
    @XmlElement(name = "fail-other")
    @XmlSchemaType(name = "unsignedInt")
    protected long failOther;

    /**
     * Gets the value of the requests property.
     * 
     */
    public long getRequests() {
        return requests;
    }

    /**
     * Sets the value of the requests property.
     * 
     */
    public void setRequests(long value) {
        this.requests = value;
    }

    /**
     * Gets the value of the responses property.
     * 
     */
    public long getResponses() {
        return responses;
    }

    /**
     * Sets the value of the responses property.
     * 
     */
    public void setResponses(long value) {
        this.responses = value;
    }

    /**
     * Gets the value of the okResponse property.
     * 
     */
    public long getOkResponse() {
        return okResponse;
    }

    /**
     * Sets the value of the okResponse property.
     * 
     */
    public void setOkResponse(long value) {
        this.okResponse = value;
    }

    /**
     * Gets the value of the failExceededClients property.
     * 
     */
    public long getFailExceededClients() {
        return failExceededClients;
    }

    /**
     * Sets the value of the failExceededClients property.
     * 
     */
    public void setFailExceededClients(long value) {
        this.failExceededClients = value;
    }

    /**
     * Gets the value of the failDeniedGuaranteedMessages property.
     * 
     */
    public long getFailDeniedGuaranteedMessages() {
        return failDeniedGuaranteedMessages;
    }

    /**
     * Sets the value of the failDeniedGuaranteedMessages property.
     * 
     */
    public void setFailDeniedGuaranteedMessages(long value) {
        this.failDeniedGuaranteedMessages = value;
    }

    /**
     * Gets the value of the failOther property.
     * 
     */
    public long getFailOther() {
        return failOther;
    }

    /**
     * Sets the value of the failOther property.
     * 
     */
    public void setFailOther(long value) {
        this.failOther = value;
    }

}
