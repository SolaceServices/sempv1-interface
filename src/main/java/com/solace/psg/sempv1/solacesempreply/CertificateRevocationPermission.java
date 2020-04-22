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
 * <p>Java class for certificate-revocation-permission.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="certificate-revocation-permission">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="allow-unknown"/>
 *     &lt;enumeration value="allow-valid"/>
 *     &lt;enumeration value="allow-all"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "certificate-revocation-permission")
@XmlEnum
public enum CertificateRevocationPermission {

    @XmlEnumValue("allow-unknown")
    ALLOW_UNKNOWN("allow-unknown"),
    @XmlEnumValue("allow-valid")
    ALLOW_VALID("allow-valid"),
    @XmlEnumValue("allow-all")
    ALLOW_ALL("allow-all");
    private final String value;

    CertificateRevocationPermission(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CertificateRevocationPermission fromValue(String v) {
        for (CertificateRevocationPermission c : CertificateRevocationPermission.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
