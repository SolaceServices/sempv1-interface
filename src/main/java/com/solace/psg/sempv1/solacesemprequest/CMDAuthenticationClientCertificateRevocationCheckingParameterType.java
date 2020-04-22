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
 * <p>Java class for CMD_authentication_clientCertificateRevocationChecking_parameterType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CMD_authentication_clientCertificateRevocationChecking_parameterType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="ocsp"/>
 *     &lt;enumeration value="crl"/>
 *     &lt;enumeration value="ocsp-crl"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "CMD_authentication_clientCertificateRevocationChecking_parameterType")
@XmlEnum
public enum CMDAuthenticationClientCertificateRevocationCheckingParameterType {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("ocsp")
    OCSP("ocsp"),
    @XmlEnumValue("crl")
    CRL("crl"),
    @XmlEnumValue("ocsp-crl")
    OCSP_CRL("ocsp-crl");
    private final String value;

    CMDAuthenticationClientCertificateRevocationCheckingParameterType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CMDAuthenticationClientCertificateRevocationCheckingParameterType fromValue(String v) {
        for (CMDAuthenticationClientCertificateRevocationCheckingParameterType c : CMDAuthenticationClientCertificateRevocationCheckingParameterType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
