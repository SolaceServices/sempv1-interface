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
 * <p>Java class for VIRTUAL_ROUTER_INDEX_PARAM.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VIRTUAL_ROUTER_INDEX_PARAM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="primary"/>
 *     &lt;enumeration value="backup"/>
 *     &lt;enumeration value="static"/>
 *     &lt;enumeration value="auto"/>
 *     &lt;enumeration value="invalid"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "VIRTUAL_ROUTER_INDEX_PARAM")
@XmlEnum
public enum VIRTUALROUTERINDEXPARAM {

    @XmlEnumValue("primary")
    PRIMARY("primary"),
    @XmlEnumValue("backup")
    BACKUP("backup"),
    @XmlEnumValue("static")
    STATIC("static"),
    @XmlEnumValue("auto")
    AUTO("auto"),
    @XmlEnumValue("invalid")
    INVALID("invalid");
    private final String value;

    VIRTUALROUTERINDEXPARAM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VIRTUALROUTERINDEXPARAM fromValue(String v) {
        for (VIRTUALROUTERINDEXPARAM c : VIRTUALROUTERINDEXPARAM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
