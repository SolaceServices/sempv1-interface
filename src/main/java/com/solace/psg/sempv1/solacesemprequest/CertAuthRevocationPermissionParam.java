//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.28 at 11:25:20 PM BST 
//


package com.solace.psg.sempv1.solacesemprequest;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for certAuth_RevocationPermission_param.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="certAuth_RevocationPermission_param"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="allow-all"/&gt;
 *     &lt;enumeration value="allow-unknown"/&gt;
 *     &lt;enumeration value="allow-valid"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "certAuth_RevocationPermission_param")
@XmlEnum
public enum CertAuthRevocationPermissionParam {

    @XmlEnumValue("allow-all")
    ALLOW_ALL("allow-all"),
    @XmlEnumValue("allow-unknown")
    ALLOW_UNKNOWN("allow-unknown"),
    @XmlEnumValue("allow-valid")
    ALLOW_VALID("allow-valid");
    private final String value;

    CertAuthRevocationPermissionParam(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CertAuthRevocationPermissionParam fromValue(String v) {
        for (CertAuthRevocationPermissionParam c: CertAuthRevocationPermissionParam.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
