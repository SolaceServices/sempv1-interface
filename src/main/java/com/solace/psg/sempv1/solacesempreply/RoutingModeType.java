//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.04 at 09:27:13 AM GMT 
//


package com.solace.psg.sempv1.solacesempreply;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for routing-mode-type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="routing-mode-type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="dynamic-message-routing"/>
 *     &lt;enumeration value="multi-node-routing"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "routing-mode-type")
@XmlEnum
public enum RoutingModeType {

    @XmlEnumValue("dynamic-message-routing")
    DYNAMIC_MESSAGE_ROUTING("dynamic-message-routing"),
    @XmlEnumValue("multi-node-routing")
    MULTI_NODE_ROUTING("multi-node-routing");
    private final String value;

    RoutingModeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RoutingModeType fromValue(String v) {
        for (RoutingModeType c : RoutingModeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}