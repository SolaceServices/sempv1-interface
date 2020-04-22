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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rest-consumer-header complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="rest-consumer-header">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rdp-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vpn-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="operational-state" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="last-failure-reason" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="last-failure-time" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="last-conn-failure-local-endpoint" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="last-conn-failure-remote-endpoint" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="last-conn-failure-reason" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="last-conn-failure-time" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rest-consumer-header", propOrder = {
        "name",
        "rdpName",
        "vpnName",
        "enabled",
        "operationalState",
        "lastFailureReason",
        "lastFailureTime",
        "lastConnFailureLocalEndpoint",
        "lastConnFailureRemoteEndpoint",
        "lastConnFailureReason",
        "lastConnFailureTime"
})
public class RestConsumerHeader {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(name = "rdp-name", required = true)
    protected String rdpName;
    @XmlElement(name = "vpn-name", required = true)
    protected String vpnName;
    protected boolean enabled;
    @XmlElement(name = "operational-state")
    protected boolean operationalState;
    @XmlElement(name = "last-failure-reason", required = true)
    protected String lastFailureReason;
    @XmlElement(name = "last-failure-time", required = true)
    protected String lastFailureTime;
    @XmlElement(name = "last-conn-failure-local-endpoint", required = true)
    protected String lastConnFailureLocalEndpoint;
    @XmlElement(name = "last-conn-failure-remote-endpoint", required = true)
    protected String lastConnFailureRemoteEndpoint;
    @XmlElement(name = "last-conn-failure-reason", required = true)
    protected String lastConnFailureReason;
    @XmlElement(name = "last-conn-failure-time", required = true)
    protected String lastConnFailureTime;

    /**
     * Gets the value of the name property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the rdpName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getRdpName() {
        return rdpName;
    }

    /**
     * Sets the value of the rdpName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRdpName(String value) {
        this.rdpName = value;
    }

    /**
     * Gets the value of the vpnName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getVpnName() {
        return vpnName;
    }

    /**
     * Sets the value of the vpnName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setVpnName(String value) {
        this.vpnName = value;
    }

    /**
     * Gets the value of the enabled property.
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     */
    public void setEnabled(boolean value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the operationalState property.
     */
    public boolean isOperationalState() {
        return operationalState;
    }

    /**
     * Sets the value of the operationalState property.
     */
    public void setOperationalState(boolean value) {
        this.operationalState = value;
    }

    /**
     * Gets the value of the lastFailureReason property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLastFailureReason() {
        return lastFailureReason;
    }

    /**
     * Sets the value of the lastFailureReason property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLastFailureReason(String value) {
        this.lastFailureReason = value;
    }

    /**
     * Gets the value of the lastFailureTime property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLastFailureTime() {
        return lastFailureTime;
    }

    /**
     * Sets the value of the lastFailureTime property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLastFailureTime(String value) {
        this.lastFailureTime = value;
    }

    /**
     * Gets the value of the lastConnFailureLocalEndpoint property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLastConnFailureLocalEndpoint() {
        return lastConnFailureLocalEndpoint;
    }

    /**
     * Sets the value of the lastConnFailureLocalEndpoint property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLastConnFailureLocalEndpoint(String value) {
        this.lastConnFailureLocalEndpoint = value;
    }

    /**
     * Gets the value of the lastConnFailureRemoteEndpoint property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLastConnFailureRemoteEndpoint() {
        return lastConnFailureRemoteEndpoint;
    }

    /**
     * Sets the value of the lastConnFailureRemoteEndpoint property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLastConnFailureRemoteEndpoint(String value) {
        this.lastConnFailureRemoteEndpoint = value;
    }

    /**
     * Gets the value of the lastConnFailureReason property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLastConnFailureReason() {
        return lastConnFailureReason;
    }

    /**
     * Sets the value of the lastConnFailureReason property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLastConnFailureReason(String value) {
        this.lastConnFailureReason = value;
    }

    /**
     * Gets the value of the lastConnFailureTime property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLastConnFailureTime() {
        return lastConnFailureTime;
    }

    /**
     * Sets the value of the lastConnFailureTime property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLastConnFailureTime(String value) {
        this.lastConnFailureTime = value;
    }

}
