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
 * <p>Java class for CP_QUEUE_NAME_PARAM.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CP_QUEUE_NAME_PARAM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="G-1"/>
 *     &lt;enumeration value="D-1"/>
 *     &lt;enumeration value="D-2"/>
 *     &lt;enumeration value="D-3"/>
 *     &lt;enumeration value="C-1"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "CP_QUEUE_NAME_PARAM")
@XmlEnum
public enum CPQUEUENAMEPARAM {

    @XmlEnumValue("G-1")
    G_1("G-1"),
    @XmlEnumValue("D-1")
    D_1("D-1"),
    @XmlEnumValue("D-2")
    D_2("D-2"),
    @XmlEnumValue("D-3")
    D_3("D-3"),
    @XmlEnumValue("C-1")
    C_1("C-1");
    private final String value;

    CPQUEUENAMEPARAM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CPQUEUENAMEPARAM fromValue(String v) {
        for (CPQUEUENAMEPARAM c : CPQUEUENAMEPARAM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
