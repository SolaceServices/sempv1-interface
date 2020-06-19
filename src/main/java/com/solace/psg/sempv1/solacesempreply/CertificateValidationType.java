//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb"&gt;http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.04 at 09:27:13 AM GMT 
//


package com.solace.psg.sempv1.solacesempreply;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for certificate-validation-type complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="certificate-validation-type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="enforce-trusted-common-name" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="max-certificate-chain-depth" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *         &lt;element name="validate-certificate-date" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "certificate-validation-type", propOrder = {
        "enforceTrustedCommonName",
        "maxCertificateChainDepth",
        "validateCertificateDate"
})
public class CertificateValidationType {

    @XmlElement(name = "enforce-trusted-common-name")
    protected boolean enforceTrustedCommonName;
    @XmlElement(name = "max-certificate-chain-depth")
    @XmlSchemaType(name = "unsignedByte")
    protected short maxCertificateChainDepth;
    @XmlElement(name = "validate-certificate-date")
    protected boolean validateCertificateDate;

    /**
     * Gets the value of the enforceTrustedCommonName property.
     */
    public boolean isEnforceTrustedCommonName() {
        return enforceTrustedCommonName;
    }

    /**
     * Sets the value of the enforceTrustedCommonName property.
     */
    public void setEnforceTrustedCommonName(boolean value) {
        this.enforceTrustedCommonName = value;
    }

    /**
     * Gets the value of the maxCertificateChainDepth property.
     */
    public short getMaxCertificateChainDepth() {
        return maxCertificateChainDepth;
    }

    /**
     * Sets the value of the maxCertificateChainDepth property.
     */
    public void setMaxCertificateChainDepth(short value) {
        this.maxCertificateChainDepth = value;
    }

    /**
     * Gets the value of the validateCertificateDate property.
     */
    public boolean isValidateCertificateDate() {
        return validateCertificateDate;
    }

    /**
     * Sets the value of the validateCertificateDate property.
     */
    public void setValidateCertificateDate(boolean value) {
        this.validateCertificateDate = value;
    }

}
