//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.04 at 09:27:51 AM GMT 
//


package com.solace.psg.sempv1.solacesemprequest;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CMD_bridgeDeliverToOne_priority_parameterType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CMD_bridgeDeliverToOne_priority_parameterType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="P1"/>
 *     &lt;enumeration value="P2"/>
 *     &lt;enumeration value="P3"/>
 *     &lt;enumeration value="P4"/>
 *     &lt;enumeration value="DA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "CMD_bridgeDeliverToOne_priority_parameterType")
@XmlEnum
public enum CMDBridgeDeliverToOnePriorityParameterType {

    @XmlEnumValue("P1")
    P_1("P1"),
    @XmlEnumValue("P2")
    P_2("P2"),
    @XmlEnumValue("P3")
    P_3("P3"),
    @XmlEnumValue("P4")
    P_4("P4"),
    DA("DA");
    private final String value;

    CMDBridgeDeliverToOnePriorityParameterType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CMDBridgeDeliverToOnePriorityParameterType fromValue(String v) {
        for (CMDBridgeDeliverToOnePriorityParameterType c : CMDBridgeDeliverToOnePriorityParameterType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
