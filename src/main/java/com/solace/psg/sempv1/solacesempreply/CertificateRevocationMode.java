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
 * <p>Java class for certificate-revocation-mode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="certificate-revocation-mode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="none"/&gt;
 *     &lt;enumeration value="ocsp"/&gt;
 *     &lt;enumeration value="crl"/&gt;
 *     &lt;enumeration value="ocsp-crl"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "certificate-revocation-mode")
@XmlEnum
public enum CertificateRevocationMode {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("ocsp")
    OCSP("ocsp"),
    @XmlEnumValue("crl")
    CRL("crl"),
    @XmlEnumValue("ocsp-crl")
    OCSP_CRL("ocsp-crl");
    private final String value;

    CertificateRevocationMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CertificateRevocationMode fromValue(String v) {
        for (CertificateRevocationMode c: CertificateRevocationMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
