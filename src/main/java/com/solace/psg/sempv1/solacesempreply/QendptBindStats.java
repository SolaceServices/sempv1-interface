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
 * <p>Java class for qendpt-bind-stats complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="qendpt-bind-stats">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bind-requests" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="bind-responses" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="ok-response" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="fail-already-bound" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="fail-exceeded-clients" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="fail-shutdown" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="fail-denied-guaranteed-messages" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="fail-denied-cut-through-forwarding" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="fail-invalid-selector" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="fail-other" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "qendpt-bind-stats", propOrder = {
        "bindRequests",
        "bindResponses",
        "okResponse",
        "failAlreadyBound",
        "failExceededClients",
        "failShutdown",
        "failDeniedGuaranteedMessages",
        "failDeniedCutThroughForwarding",
        "failInvalidSelector",
        "failOther"
})
public class QendptBindStats {

    @XmlElement(name = "bind-requests")
    @XmlSchemaType(name = "unsignedInt")
    protected long bindRequests;
    @XmlElement(name = "bind-responses")
    @XmlSchemaType(name = "unsignedInt")
    protected long bindResponses;
    @XmlElement(name = "ok-response")
    @XmlSchemaType(name = "unsignedInt")
    protected long okResponse;
    @XmlElement(name = "fail-already-bound")
    @XmlSchemaType(name = "unsignedInt")
    protected long failAlreadyBound;
    @XmlElement(name = "fail-exceeded-clients")
    @XmlSchemaType(name = "unsignedInt")
    protected long failExceededClients;
    @XmlElement(name = "fail-shutdown")
    @XmlSchemaType(name = "unsignedInt")
    protected Long failShutdown;
    @XmlElement(name = "fail-denied-guaranteed-messages")
    @XmlSchemaType(name = "unsignedInt")
    protected Long failDeniedGuaranteedMessages;
    @XmlElement(name = "fail-denied-cut-through-forwarding")
    @XmlSchemaType(name = "unsignedInt")
    protected Long failDeniedCutThroughForwarding;
    @XmlElement(name = "fail-invalid-selector")
    @XmlSchemaType(name = "unsignedInt")
    protected Long failInvalidSelector;
    @XmlElement(name = "fail-other")
    @XmlSchemaType(name = "unsignedInt")
    protected long failOther;

    /**
     * Gets the value of the bindRequests property.
     */
    public long getBindRequests() {
        return bindRequests;
    }

    /**
     * Sets the value of the bindRequests property.
     */
    public void setBindRequests(long value) {
        this.bindRequests = value;
    }

    /**
     * Gets the value of the bindResponses property.
     */
    public long getBindResponses() {
        return bindResponses;
    }

    /**
     * Sets the value of the bindResponses property.
     */
    public void setBindResponses(long value) {
        this.bindResponses = value;
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
     * Gets the value of the failAlreadyBound property.
     */
    public long getFailAlreadyBound() {
        return failAlreadyBound;
    }

    /**
     * Sets the value of the failAlreadyBound property.
     */
    public void setFailAlreadyBound(long value) {
        this.failAlreadyBound = value;
    }

    /**
     * Gets the value of the failExceededClients property.
     */
    public long getFailExceededClients() {
        return failExceededClients;
    }

    /**
     * Sets the value of the failExceededClients property.
     */
    public void setFailExceededClients(long value) {
        this.failExceededClients = value;
    }

    /**
     * Gets the value of the failShutdown property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getFailShutdown() {
        return failShutdown;
    }

    /**
     * Sets the value of the failShutdown property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setFailShutdown(Long value) {
        this.failShutdown = value;
    }

    /**
     * Gets the value of the failDeniedGuaranteedMessages property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getFailDeniedGuaranteedMessages() {
        return failDeniedGuaranteedMessages;
    }

    /**
     * Sets the value of the failDeniedGuaranteedMessages property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setFailDeniedGuaranteedMessages(Long value) {
        this.failDeniedGuaranteedMessages = value;
    }

    /**
     * Gets the value of the failDeniedCutThroughForwarding property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getFailDeniedCutThroughForwarding() {
        return failDeniedCutThroughForwarding;
    }

    /**
     * Sets the value of the failDeniedCutThroughForwarding property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setFailDeniedCutThroughForwarding(Long value) {
        this.failDeniedCutThroughForwarding = value;
    }

    /**
     * Gets the value of the failInvalidSelector property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getFailInvalidSelector() {
        return failInvalidSelector;
    }

    /**
     * Sets the value of the failInvalidSelector property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setFailInvalidSelector(Long value) {
        this.failInvalidSelector = value;
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
