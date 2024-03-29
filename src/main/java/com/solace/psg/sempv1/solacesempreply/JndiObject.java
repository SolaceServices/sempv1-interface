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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for jndi-object complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="jndi-object"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="message-vpn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="primary-property" type="{}jndi-property" minOccurs="0"/&gt;
 *         &lt;element name="properties" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0"&gt;
 *                   &lt;element name="property" type="{}jndi-property"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="property-lists" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0"&gt;
 *                   &lt;element name="property-list"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{}jndi-property-list"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="properties"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence maxOccurs="unbounded" minOccurs="0"&gt;
 *                                       &lt;element name="property" type="{}jndi-property"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
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
@XmlType(name = "jndi-object", propOrder = {
    "name",
    "messageVpn",
    "primaryProperty",
    "properties",
    "propertyLists"
})
public class JndiObject {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(name = "message-vpn", required = true)
    protected String messageVpn;
    @XmlElement(name = "primary-property")
    protected JndiProperty primaryProperty;
    protected JndiObject.Properties properties;
    @XmlElement(name = "property-lists")
    protected JndiObject.PropertyLists propertyLists;

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
     * Gets the value of the primaryProperty property.
     * 
     * @return
     *     possible object is
     *     {@link JndiProperty }
     *     
     */
    public JndiProperty getPrimaryProperty() {
        return primaryProperty;
    }

    /**
     * Sets the value of the primaryProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link JndiProperty }
     *     
     */
    public void setPrimaryProperty(JndiProperty value) {
        this.primaryProperty = value;
    }

    /**
     * Gets the value of the properties property.
     * 
     * @return
     *     possible object is
     *     {@link JndiObject.Properties }
     *     
     */
    public JndiObject.Properties getProperties() {
        return properties;
    }

    /**
     * Sets the value of the properties property.
     * 
     * @param value
     *     allowed object is
     *     {@link JndiObject.Properties }
     *     
     */
    public void setProperties(JndiObject.Properties value) {
        this.properties = value;
    }

    /**
     * Gets the value of the propertyLists property.
     * 
     * @return
     *     possible object is
     *     {@link JndiObject.PropertyLists }
     *     
     */
    public JndiObject.PropertyLists getPropertyLists() {
        return propertyLists;
    }

    /**
     * Sets the value of the propertyLists property.
     * 
     * @param value
     *     allowed object is
     *     {@link JndiObject.PropertyLists }
     *     
     */
    public void setPropertyLists(JndiObject.PropertyLists value) {
        this.propertyLists = value;
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
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0"&gt;
     *         &lt;element name="property" type="{}jndi-property"/&gt;
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
        "property"
    })
    public static class Properties {

        protected List<JndiProperty> property;

        /**
         * Gets the value of the property property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the property property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProperty().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JndiProperty }
         * 
         * 
         */
        public List<JndiProperty> getProperty() {
            if (property == null) {
                property = new ArrayList<JndiProperty>();
            }
            return this.property;
        }

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
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0"&gt;
     *         &lt;element name="property-list"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{}jndi-property-list"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="properties"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence maxOccurs="unbounded" minOccurs="0"&gt;
     *                             &lt;element name="property" type="{}jndi-property"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/extension&gt;
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
        "propertyList"
    })
    public static class PropertyLists {

        @XmlElement(name = "property-list")
        protected List<JndiObject.PropertyLists.PropertyList> propertyList;

        /**
         * Gets the value of the propertyList property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the propertyList property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPropertyList().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JndiObject.PropertyLists.PropertyList }
         * 
         * 
         */
        public List<JndiObject.PropertyLists.PropertyList> getPropertyList() {
            if (propertyList == null) {
                propertyList = new ArrayList<JndiObject.PropertyLists.PropertyList>();
            }
            return this.propertyList;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{}jndi-property-list"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="properties"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence maxOccurs="unbounded" minOccurs="0"&gt;
         *                   &lt;element name="property" type="{}jndi-property"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "name",
            "properties"
        })
        public static class PropertyList
            extends JndiPropertyList
        {

            @XmlElement(required = true)
            protected String name;
            @XmlElement(required = true)
            protected JndiObject.PropertyLists.PropertyList.Properties properties;

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
             * Gets the value of the properties property.
             * 
             * @return
             *     possible object is
             *     {@link JndiObject.PropertyLists.PropertyList.Properties }
             *     
             */
            public JndiObject.PropertyLists.PropertyList.Properties getProperties() {
                return properties;
            }

            /**
             * Sets the value of the properties property.
             * 
             * @param value
             *     allowed object is
             *     {@link JndiObject.PropertyLists.PropertyList.Properties }
             *     
             */
            public void setProperties(JndiObject.PropertyLists.PropertyList.Properties value) {
                this.properties = value;
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
             *       &lt;sequence maxOccurs="unbounded" minOccurs="0"&gt;
             *         &lt;element name="property" type="{}jndi-property"/&gt;
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
                "property"
            })
            public static class Properties {

                protected List<JndiProperty> property;

                /**
                 * Gets the value of the property property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the property property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getProperty().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link JndiProperty }
                 * 
                 * 
                 */
                public List<JndiProperty> getProperty() {
                    if (property == null) {
                        property = new ArrayList<JndiProperty>();
                    }
                    return this.property;
                }

            }

        }

    }

}
