//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb"&gt;http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.04 at 09:27:13 AM GMT 
//


package com.solace.psg.sempv1.solacesempreply;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for user-vpn-access-level complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="user-vpn-access-level"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="vpn-name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="access-level" type="{}vpn-access-level"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "user-vpn-access-level", propOrder = {
        "vpnName",
        "accessLevel"
})
public class UserVpnAccessLevel {

    @XmlElement(name = "vpn-name", required = true)
    protected String vpnName;
    @XmlElement(name = "access-level", required = true)
    protected String accessLevel;

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
     * Gets the value of the accessLevel property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAccessLevel() {
        return accessLevel;
    }

    /**
     * Sets the value of the accessLevel property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAccessLevel(String value) {
        this.accessLevel = value;
    }

}
