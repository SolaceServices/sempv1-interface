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
 * <p>Java class for destination-type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="destination-type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="remote-router"/>
 *     &lt;enumeration value="client"/>
 *     &lt;enumeration value="queue"/>
 *     &lt;enumeration value="topic-endpoint"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "destination-type")
@XmlEnum
public enum DestinationType {

    @XmlEnumValue("remote-router")
    REMOTE_ROUTER("remote-router"),
    @XmlEnumValue("client")
    CLIENT("client"),
    @XmlEnumValue("queue")
    QUEUE("queue"),
    @XmlEnumValue("topic-endpoint")
    TOPIC_ENDPOINT("topic-endpoint");
    private final String value;

    DestinationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DestinationType fromValue(String v) {
        for (DestinationType c : DestinationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
