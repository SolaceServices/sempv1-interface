//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.28 at 11:41:04 PM BST 
//


package com.solace.psg.sempv1.solacesempreply;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dto-priority-type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dto-priority-type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INV"/&gt;
 *     &lt;enumeration value="P1"/&gt;
 *     &lt;enumeration value="P2"/&gt;
 *     &lt;enumeration value="P3"/&gt;
 *     &lt;enumeration value="P4"/&gt;
 *     &lt;enumeration value="DA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "dto-priority-type")
@XmlEnum
public enum DtoPriorityType {

    INV("INV"),
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

    DtoPriorityType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DtoPriorityType fromValue(String v) {
        for (DtoPriorityType c: DtoPriorityType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
