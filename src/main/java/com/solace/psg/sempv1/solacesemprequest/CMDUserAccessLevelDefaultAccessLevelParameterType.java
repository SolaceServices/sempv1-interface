//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb"&gt;http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.04 at 09:27:51 AM GMT 
//


package com.solace.psg.sempv1.solacesemprequest;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CMD_userAccessLevel_defaultAccessLevel_parameterType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CMD_userAccessLevel_defaultAccessLevel_parameterType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="read-only"/&gt;
 *     &lt;enumeration value="read-write"/&gt;
 *     &lt;enumeration value="admin"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "CMD_userAccessLevel_defaultAccessLevel_parameterType")
@XmlEnum
public enum CMDUserAccessLevelDefaultAccessLevelParameterType {

    @XmlEnumValue("read-only")
    READ_ONLY("read-only"),
    @XmlEnumValue("read-write")
    READ_WRITE("read-write"),
    @XmlEnumValue("admin")
    ADMIN("admin");
    private final String value;

    CMDUserAccessLevelDefaultAccessLevelParameterType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CMDUserAccessLevelDefaultAccessLevelParameterType fromValue(String v) {
        for (CMDUserAccessLevelDefaultAccessLevelParameterType c : CMDUserAccessLevelDefaultAccessLevelParameterType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
