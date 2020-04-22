//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.04 at 09:27:13 AM GMT 
//


package com.solace.psg.sempv1.solacesempreply;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for message-spool-flow-type complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="message-spool-flow-type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="flows-to-client" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="flow" type="{}client-bind-info"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="flows-from-client" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="flow" type="{}client-bind-info"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "message-spool-flow-type", propOrder = {
        "flowsToClient",
        "flowsFromClient"
})
public class MessageSpoolFlowType {

    @XmlElement(name = "flows-to-client")
    protected MessageSpoolFlowType.FlowsToClient flowsToClient;
    @XmlElement(name = "flows-from-client")
    protected MessageSpoolFlowType.FlowsFromClient flowsFromClient;

    /**
     * Gets the value of the flowsToClient property.
     *
     * @return possible object is
     * {@link MessageSpoolFlowType.FlowsToClient }
     */
    public MessageSpoolFlowType.FlowsToClient getFlowsToClient() {
        return flowsToClient;
    }

    /**
     * Sets the value of the flowsToClient property.
     *
     * @param value allowed object is
     *              {@link MessageSpoolFlowType.FlowsToClient }
     */
    public void setFlowsToClient(MessageSpoolFlowType.FlowsToClient value) {
        this.flowsToClient = value;
    }

    /**
     * Gets the value of the flowsFromClient property.
     *
     * @return possible object is
     * {@link MessageSpoolFlowType.FlowsFromClient }
     */
    public MessageSpoolFlowType.FlowsFromClient getFlowsFromClient() {
        return flowsFromClient;
    }

    /**
     * Sets the value of the flowsFromClient property.
     *
     * @param value allowed object is
     *              {@link MessageSpoolFlowType.FlowsFromClient }
     */
    public void setFlowsFromClient(MessageSpoolFlowType.FlowsFromClient value) {
        this.flowsFromClient = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="flow" type="{}client-bind-info"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "flow"
    })
    public static class FlowsFromClient {

        protected List<ClientBindInfo> flow;

        /**
         * Gets the value of the flow property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the flow property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFlow().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ClientBindInfo }
         */
        public List<ClientBindInfo> getFlow() {
            if (flow == null) {
                flow = new ArrayList<ClientBindInfo>();
            }
            return this.flow;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="flow" type="{}client-bind-info"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "flow"
    })
    public static class FlowsToClient {

        protected List<ClientBindInfo> flow;

        /**
         * Gets the value of the flow property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the flow property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFlow().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ClientBindInfo }
         */
        public List<ClientBindInfo> getFlow() {
            if (flow == null) {
                flow = new ArrayList<ClientBindInfo>();
            }
            return this.flow;
        }

    }

}