//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.28 at 11:41:04 PM BST 
//


package com.solace.psg.sempv1.solacesempreply;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for clientUsernameType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="clientUsernameType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="client-username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="message-vpn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="guaranteed-endpoint-permission-override" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="profile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="acl-profile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="authorization-group" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dynamically-configured" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="password-configured" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="subscription-manager" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="num-clients" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="num-clients-service-smf" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="num-clients-service-web" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="max-connections" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="max-connections-service-smf" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="max-connections-service-web" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="denied-login-authorization-failed" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="denied-login-client-username-shutdown" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="guaranteed-endpoints" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="guaranteed-endpoint" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="num-endpoints" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="max-endpoints" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clientUsernameType", propOrder = {

})
public class ClientUsernameType {

    @XmlElement(name = "client-username")
    protected String clientUsername;
    @XmlElement(name = "message-vpn")
    protected String messageVpn;
    protected Boolean enabled;
    @XmlElement(name = "guaranteed-endpoint-permission-override")
    protected Boolean guaranteedEndpointPermissionOverride;
    protected String profile;
    @XmlElement(name = "acl-profile")
    protected String aclProfile;
    @XmlElement(name = "authorization-group")
    protected String authorizationGroup;
    @XmlElement(name = "dynamically-configured")
    protected Boolean dynamicallyConfigured;
    @XmlElement(name = "password-configured")
    protected Boolean passwordConfigured;
    @XmlElement(name = "subscription-manager")
    protected Boolean subscriptionManager;
    @XmlElement(name = "num-clients")
    protected Integer numClients;
    @XmlElement(name = "num-clients-service-smf")
    protected Integer numClientsServiceSmf;
    @XmlElement(name = "num-clients-service-web")
    protected Integer numClientsServiceWeb;
    @XmlElement(name = "max-connections")
    @XmlSchemaType(name = "unsignedInt")
    protected Long maxConnections;
    @XmlElement(name = "max-connections-service-smf")
    @XmlSchemaType(name = "unsignedInt")
    protected Long maxConnectionsServiceSmf;
    @XmlElement(name = "max-connections-service-web")
    @XmlSchemaType(name = "unsignedInt")
    protected Long maxConnectionsServiceWeb;
    @XmlElement(name = "denied-login-authorization-failed")
    protected Long deniedLoginAuthorizationFailed;
    @XmlElement(name = "denied-login-client-username-shutdown")
    protected Long deniedLoginClientUsernameShutdown;
    @XmlElement(name = "guaranteed-endpoints")
    protected ClientUsernameType.GuaranteedEndpoints guaranteedEndpoints;
    @XmlElement(name = "num-endpoints")
    @XmlSchemaType(name = "unsignedInt")
    protected Long numEndpoints;
    @XmlElement(name = "max-endpoints")
    @XmlSchemaType(name = "unsignedInt")
    protected Long maxEndpoints;

    /**
     * Gets the value of the clientUsername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientUsername() {
        return clientUsername;
    }

    /**
     * Sets the value of the clientUsername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientUsername(String value) {
        this.clientUsername = value;
    }

    /**
     * Gets the value of the messageVpn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageVpn() {
        return messageVpn;
    }

    /**
     * Sets the value of the messageVpn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageVpn(String value) {
        this.messageVpn = value;
    }

    /**
     * Gets the value of the enabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnabled(Boolean value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the guaranteedEndpointPermissionOverride property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGuaranteedEndpointPermissionOverride() {
        return guaranteedEndpointPermissionOverride;
    }

    /**
     * Sets the value of the guaranteedEndpointPermissionOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGuaranteedEndpointPermissionOverride(Boolean value) {
        this.guaranteedEndpointPermissionOverride = value;
    }

    /**
     * Gets the value of the profile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfile() {
        return profile;
    }

    /**
     * Sets the value of the profile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfile(String value) {
        this.profile = value;
    }

    /**
     * Gets the value of the aclProfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAclProfile() {
        return aclProfile;
    }

    /**
     * Sets the value of the aclProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAclProfile(String value) {
        this.aclProfile = value;
    }

    /**
     * Gets the value of the authorizationGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizationGroup() {
        return authorizationGroup;
    }

    /**
     * Sets the value of the authorizationGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationGroup(String value) {
        this.authorizationGroup = value;
    }

    /**
     * Gets the value of the dynamicallyConfigured property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDynamicallyConfigured() {
        return dynamicallyConfigured;
    }

    /**
     * Sets the value of the dynamicallyConfigured property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDynamicallyConfigured(Boolean value) {
        this.dynamicallyConfigured = value;
    }

    /**
     * Gets the value of the passwordConfigured property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPasswordConfigured() {
        return passwordConfigured;
    }

    /**
     * Sets the value of the passwordConfigured property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPasswordConfigured(Boolean value) {
        this.passwordConfigured = value;
    }

    /**
     * Gets the value of the subscriptionManager property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSubscriptionManager() {
        return subscriptionManager;
    }

    /**
     * Sets the value of the subscriptionManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSubscriptionManager(Boolean value) {
        this.subscriptionManager = value;
    }

    /**
     * Gets the value of the numClients property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumClients() {
        return numClients;
    }

    /**
     * Sets the value of the numClients property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumClients(Integer value) {
        this.numClients = value;
    }

    /**
     * Gets the value of the numClientsServiceSmf property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumClientsServiceSmf() {
        return numClientsServiceSmf;
    }

    /**
     * Sets the value of the numClientsServiceSmf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumClientsServiceSmf(Integer value) {
        this.numClientsServiceSmf = value;
    }

    /**
     * Gets the value of the numClientsServiceWeb property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumClientsServiceWeb() {
        return numClientsServiceWeb;
    }

    /**
     * Sets the value of the numClientsServiceWeb property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumClientsServiceWeb(Integer value) {
        this.numClientsServiceWeb = value;
    }

    /**
     * Gets the value of the maxConnections property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxConnections() {
        return maxConnections;
    }

    /**
     * Sets the value of the maxConnections property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxConnections(Long value) {
        this.maxConnections = value;
    }

    /**
     * Gets the value of the maxConnectionsServiceSmf property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxConnectionsServiceSmf() {
        return maxConnectionsServiceSmf;
    }

    /**
     * Sets the value of the maxConnectionsServiceSmf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxConnectionsServiceSmf(Long value) {
        this.maxConnectionsServiceSmf = value;
    }

    /**
     * Gets the value of the maxConnectionsServiceWeb property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxConnectionsServiceWeb() {
        return maxConnectionsServiceWeb;
    }

    /**
     * Sets the value of the maxConnectionsServiceWeb property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxConnectionsServiceWeb(Long value) {
        this.maxConnectionsServiceWeb = value;
    }

    /**
     * Gets the value of the deniedLoginAuthorizationFailed property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDeniedLoginAuthorizationFailed() {
        return deniedLoginAuthorizationFailed;
    }

    /**
     * Sets the value of the deniedLoginAuthorizationFailed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDeniedLoginAuthorizationFailed(Long value) {
        this.deniedLoginAuthorizationFailed = value;
    }

    /**
     * Gets the value of the deniedLoginClientUsernameShutdown property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDeniedLoginClientUsernameShutdown() {
        return deniedLoginClientUsernameShutdown;
    }

    /**
     * Sets the value of the deniedLoginClientUsernameShutdown property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDeniedLoginClientUsernameShutdown(Long value) {
        this.deniedLoginClientUsernameShutdown = value;
    }

    /**
     * Gets the value of the guaranteedEndpoints property.
     * 
     * @return
     *     possible object is
     *     {@link ClientUsernameType.GuaranteedEndpoints }
     *     
     */
    public ClientUsernameType.GuaranteedEndpoints getGuaranteedEndpoints() {
        return guaranteedEndpoints;
    }

    /**
     * Sets the value of the guaranteedEndpoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientUsernameType.GuaranteedEndpoints }
     *     
     */
    public void setGuaranteedEndpoints(ClientUsernameType.GuaranteedEndpoints value) {
        this.guaranteedEndpoints = value;
    }

    /**
     * Gets the value of the numEndpoints property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumEndpoints() {
        return numEndpoints;
    }

    /**
     * Sets the value of the numEndpoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumEndpoints(Long value) {
        this.numEndpoints = value;
    }

    /**
     * Gets the value of the maxEndpoints property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxEndpoints() {
        return maxEndpoints;
    }

    /**
     * Sets the value of the maxEndpoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxEndpoints(Long value) {
        this.maxEndpoints = value;
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
     *       &lt;sequence&gt;
     *         &lt;element name="guaranteed-endpoint" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "guaranteedEndpoint"
    })
    public static class GuaranteedEndpoints {

        @XmlElement(name = "guaranteed-endpoint")
        protected List<ClientUsernameType.GuaranteedEndpoints.GuaranteedEndpoint> guaranteedEndpoint;

        /**
         * Gets the value of the guaranteedEndpoint property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the guaranteedEndpoint property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGuaranteedEndpoint().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ClientUsernameType.GuaranteedEndpoints.GuaranteedEndpoint }
         * 
         * 
         */
        public List<ClientUsernameType.GuaranteedEndpoints.GuaranteedEndpoint> getGuaranteedEndpoint() {
            if (guaranteedEndpoint == null) {
                guaranteedEndpoint = new ArrayList<ClientUsernameType.GuaranteedEndpoints.GuaranteedEndpoint>();
            }
            return this.guaranteedEndpoint;
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
         *       &lt;sequence&gt;
         *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "name",
            "type"
        })
        public static class GuaranteedEndpoint {

            @XmlElement(required = true)
            protected String name;
            @XmlElement(required = true)
            protected String type;

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * Gets the value of the type property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getType() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setType(String value) {
                this.type = value;
            }

        }

    }

}
