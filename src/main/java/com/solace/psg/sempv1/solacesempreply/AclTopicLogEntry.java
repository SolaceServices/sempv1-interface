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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for acl-topic-log-entry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="acl-topic-log-entry"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="client-name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="client-username" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="vpn-name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="topic" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="acl-profile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "acl-topic-log-entry", propOrder = {

})
public class AclTopicLogEntry {

    @XmlElement(required = true)
    protected String timestamp;
    @XmlElement(name = "client-name")
    protected String clientName;
    @XmlElement(name = "client-username", required = true)
    protected String clientUsername;
    @XmlElement(name = "vpn-name", required = true)
    protected String vpnName;
    @XmlElement(required = true)
    protected String topic;
    @XmlElement(name = "acl-profile")
    protected String aclProfile;

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimestamp(String value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the clientName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientName() {
        return clientName;
    }

    /**
     * Sets the value of the clientName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientName(String value) {
        this.clientName = value;
    }

    /**
     * Gets the value of the clientUsername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientUsername() {
        return clientUsername;
    }

    /**
     * Sets the value of the clientUsername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientUsername(String value) {
        this.clientUsername = value;
    }

    /**
     * Gets the value of the vpnName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVpnName() {
        return vpnName;
    }

    /**
     * Sets the value of the vpnName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVpnName(String value) {
        this.vpnName = value;
    }

    /**
     * Gets the value of the topic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTopic() {
        return topic;
    }

    /**
     * Sets the value of the topic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTopic(String value) {
        this.topic = value;
    }

    /**
     * Gets the value of the aclProfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAclProfile() {
        return aclProfile;
    }

    /**
     * Sets the value of the aclProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAclProfile(String value) {
        this.aclProfile = value;
    }

}
