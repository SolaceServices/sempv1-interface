//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
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
 * <p>Java class for mqtt-subscription-type complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="mqtt-subscription-type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="qos" type="{}mqtt-qos-type"/>
 *         &lt;element name="topic" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mqtt-subscription-type", propOrder = {

})
public class MqttSubscriptionType {

    @XmlSchemaType(name = "integer")
    protected int qos;
    @XmlElement(required = true)
    protected String topic;

    /**
     * Gets the value of the qos property.
     */
    public int getQos() {
        return qos;
    }

    /**
     * Sets the value of the qos property.
     */
    public void setQos(int value) {
        this.qos = value;
    }

    /**
     * Gets the value of the topic property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTopic() {
        return topic;
    }

    /**
     * Sets the value of the topic property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTopic(String value) {
        this.topic = value;
    }

}