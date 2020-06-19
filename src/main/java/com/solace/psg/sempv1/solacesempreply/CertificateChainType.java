//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb"&gt;http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.04 at 09:27:13 AM GMT 
//


package com.solace.psg.sempv1.solacesempreply;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for certificate-chain-type complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="certificate-chain-type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="certificate-content" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="chained-certificate" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="chain-depth" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                   &lt;element name="certificate-content" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "certificate-chain-type", propOrder = {
        "certificateContent",
        "chainedCertificate"
})
public class CertificateChainType {

    @XmlElement(name = "certificate-content")
    protected String certificateContent;
    @XmlElement(name = "chained-certificate")
    protected List<CertificateChainType.ChainedCertificate> chainedCertificate;

    /**
     * Gets the value of the certificateContent property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCertificateContent() {
        return certificateContent;
    }

    /**
     * Sets the value of the certificateContent property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCertificateContent(String value) {
        this.certificateContent = value;
    }

    /**
     * Gets the value of the chainedCertificate property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chainedCertificate property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChainedCertificate().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CertificateChainType.ChainedCertificate }
     */
    public List<CertificateChainType.ChainedCertificate> getChainedCertificate() {
        if (chainedCertificate == null) {
            chainedCertificate = new ArrayList<CertificateChainType.ChainedCertificate>();
        }
        return this.chainedCertificate;
    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;all&gt;
     *         &lt;element name="chain-depth" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *         &lt;element name="certificate-content" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *       &lt;/all&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class ChainedCertificate {

        @XmlElement(name = "chain-depth", required = true)
        protected BigInteger chainDepth;
        @XmlElement(name = "certificate-content", required = true)
        protected String certificateContent;

        /**
         * Gets the value of the chainDepth property.
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getChainDepth() {
            return chainDepth;
        }

        /**
         * Sets the value of the chainDepth property.
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setChainDepth(BigInteger value) {
            this.chainDepth = value;
        }

        /**
         * Gets the value of the certificateContent property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getCertificateContent() {
            return certificateContent;
        }

        /**
         * Sets the value of the certificateContent property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setCertificateContent(String value) {
            this.certificateContent = value;
        }

    }

}
