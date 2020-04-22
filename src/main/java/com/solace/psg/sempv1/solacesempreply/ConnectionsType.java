//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.04 at 09:27:13 AM GMT 
//


package com.solace.psg.sempv1.solacesempreply;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for connections-type complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="connections-type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="connection-name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="protocol" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="is-zip" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="is-ssl" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="receive-queue-bytes" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *         &lt;element name="receive-queue-segments" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *         &lt;element name="send-queue-bytes" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *         &lt;element name="send-queue-segments" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *         &lt;element name="local-address" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="foreign-address" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="maximum-segment-size" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="bytes-sent-32bits" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *         &lt;element name="bytes-received-32bits" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *         &lt;element name="retransmit-time-ms" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="round-trip-time-smooth-us" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="round-trip-time-minimum-us" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="round-trip-time-variance-us" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="advertised-window-size" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *         &lt;element name="transmit-window-size" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *         &lt;element name="bandwidth-window-size" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *         &lt;element name="congestion-window-size" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *         &lt;element name="slow-start-threshold-size" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *         &lt;element name="segments-received-out-of-order" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *         &lt;element name="fast-retransmits" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *         &lt;element name="timed-retransmits" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *         &lt;element name="connection-uptime-s" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *         &lt;element name="blocked-cycles-percent" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="interface" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "connections-type", propOrder = {

})
public class ConnectionsType {

    @XmlElement(name = "connection-name")
    protected String connectionName;
    @XmlElement(required = true)
    protected String protocol;
    @XmlElement(name = "is-zip")
    protected Boolean isZip;
    @XmlElement(name = "is-ssl")
    protected Boolean isSsl;
    @XmlElement(name = "receive-queue-bytes", required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger receiveQueueBytes;
    @XmlElement(name = "receive-queue-segments", required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger receiveQueueSegments;
    @XmlElement(name = "send-queue-bytes", required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger sendQueueBytes;
    @XmlElement(name = "send-queue-segments", required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger sendQueueSegments;
    @XmlElement(name = "local-address", required = true)
    protected String localAddress;
    @XmlElement(name = "foreign-address", required = true)
    protected String foreignAddress;
    @XmlElement(required = true)
    protected String state;
    @XmlElement(name = "maximum-segment-size")
    @XmlSchemaType(name = "unsignedInt")
    protected long maximumSegmentSize;
    @XmlElement(name = "bytes-sent-32bits", required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger bytesSent32Bits;
    @XmlElement(name = "bytes-received-32bits", required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger bytesReceived32Bits;
    @XmlElement(name = "retransmit-time-ms")
    protected double retransmitTimeMs;
    @XmlElement(name = "round-trip-time-smooth-us")
    protected double roundTripTimeSmoothUs;
    @XmlElement(name = "round-trip-time-minimum-us")
    protected double roundTripTimeMinimumUs;
    @XmlElement(name = "round-trip-time-variance-us")
    protected double roundTripTimeVarianceUs;
    @XmlElement(name = "advertised-window-size", required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger advertisedWindowSize;
    @XmlElement(name = "transmit-window-size", required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger transmitWindowSize;
    @XmlElement(name = "bandwidth-window-size", required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger bandwidthWindowSize;
    @XmlElement(name = "congestion-window-size", required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger congestionWindowSize;
    @XmlElement(name = "slow-start-threshold-size", required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger slowStartThresholdSize;
    @XmlElement(name = "segments-received-out-of-order", required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger segmentsReceivedOutOfOrder;
    @XmlElement(name = "fast-retransmits", required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger fastRetransmits;
    @XmlElement(name = "timed-retransmits", required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger timedRetransmits;
    @XmlElement(name = "connection-uptime-s", required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger connectionUptimeS;
    @XmlElement(name = "blocked-cycles-percent")
    @XmlSchemaType(name = "unsignedInt")
    protected long blockedCyclesPercent;
    @XmlElement(name = "interface", required = true)
    protected String _interface;

    /**
     * Gets the value of the connectionName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getConnectionName() {
        return connectionName;
    }

    /**
     * Sets the value of the connectionName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setConnectionName(String value) {
        this.connectionName = value;
    }

    /**
     * Gets the value of the protocol property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getProtocol() {
        return protocol;
    }

    /**
     * Sets the value of the protocol property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setProtocol(String value) {
        this.protocol = value;
    }

    /**
     * Gets the value of the isZip property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isIsZip() {
        return isZip;
    }

    /**
     * Sets the value of the isZip property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setIsZip(Boolean value) {
        this.isZip = value;
    }

    /**
     * Gets the value of the isSsl property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isIsSsl() {
        return isSsl;
    }

    /**
     * Sets the value of the isSsl property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setIsSsl(Boolean value) {
        this.isSsl = value;
    }

    /**
     * Gets the value of the receiveQueueBytes property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getReceiveQueueBytes() {
        return receiveQueueBytes;
    }

    /**
     * Sets the value of the receiveQueueBytes property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setReceiveQueueBytes(BigInteger value) {
        this.receiveQueueBytes = value;
    }

    /**
     * Gets the value of the receiveQueueSegments property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getReceiveQueueSegments() {
        return receiveQueueSegments;
    }

    /**
     * Sets the value of the receiveQueueSegments property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setReceiveQueueSegments(BigInteger value) {
        this.receiveQueueSegments = value;
    }

    /**
     * Gets the value of the sendQueueBytes property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getSendQueueBytes() {
        return sendQueueBytes;
    }

    /**
     * Sets the value of the sendQueueBytes property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setSendQueueBytes(BigInteger value) {
        this.sendQueueBytes = value;
    }

    /**
     * Gets the value of the sendQueueSegments property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getSendQueueSegments() {
        return sendQueueSegments;
    }

    /**
     * Sets the value of the sendQueueSegments property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setSendQueueSegments(BigInteger value) {
        this.sendQueueSegments = value;
    }

    /**
     * Gets the value of the localAddress property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLocalAddress() {
        return localAddress;
    }

    /**
     * Sets the value of the localAddress property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLocalAddress(String value) {
        this.localAddress = value;
    }

    /**
     * Gets the value of the foreignAddress property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getForeignAddress() {
        return foreignAddress;
    }

    /**
     * Sets the value of the foreignAddress property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setForeignAddress(String value) {
        this.foreignAddress = value;
    }

    /**
     * Gets the value of the state property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the maximumSegmentSize property.
     */
    public long getMaximumSegmentSize() {
        return maximumSegmentSize;
    }

    /**
     * Sets the value of the maximumSegmentSize property.
     */
    public void setMaximumSegmentSize(long value) {
        this.maximumSegmentSize = value;
    }

    /**
     * Gets the value of the bytesSent32Bits property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getBytesSent32Bits() {
        return bytesSent32Bits;
    }

    /**
     * Sets the value of the bytesSent32Bits property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setBytesSent32Bits(BigInteger value) {
        this.bytesSent32Bits = value;
    }

    /**
     * Gets the value of the bytesReceived32Bits property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getBytesReceived32Bits() {
        return bytesReceived32Bits;
    }

    /**
     * Sets the value of the bytesReceived32Bits property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setBytesReceived32Bits(BigInteger value) {
        this.bytesReceived32Bits = value;
    }

    /**
     * Gets the value of the retransmitTimeMs property.
     */
    public double getRetransmitTimeMs() {
        return retransmitTimeMs;
    }

    /**
     * Sets the value of the retransmitTimeMs property.
     */
    public void setRetransmitTimeMs(double value) {
        this.retransmitTimeMs = value;
    }

    /**
     * Gets the value of the roundTripTimeSmoothUs property.
     */
    public double getRoundTripTimeSmoothUs() {
        return roundTripTimeSmoothUs;
    }

    /**
     * Sets the value of the roundTripTimeSmoothUs property.
     */
    public void setRoundTripTimeSmoothUs(double value) {
        this.roundTripTimeSmoothUs = value;
    }

    /**
     * Gets the value of the roundTripTimeMinimumUs property.
     */
    public double getRoundTripTimeMinimumUs() {
        return roundTripTimeMinimumUs;
    }

    /**
     * Sets the value of the roundTripTimeMinimumUs property.
     */
    public void setRoundTripTimeMinimumUs(double value) {
        this.roundTripTimeMinimumUs = value;
    }

    /**
     * Gets the value of the roundTripTimeVarianceUs property.
     */
    public double getRoundTripTimeVarianceUs() {
        return roundTripTimeVarianceUs;
    }

    /**
     * Sets the value of the roundTripTimeVarianceUs property.
     */
    public void setRoundTripTimeVarianceUs(double value) {
        this.roundTripTimeVarianceUs = value;
    }

    /**
     * Gets the value of the advertisedWindowSize property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getAdvertisedWindowSize() {
        return advertisedWindowSize;
    }

    /**
     * Sets the value of the advertisedWindowSize property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setAdvertisedWindowSize(BigInteger value) {
        this.advertisedWindowSize = value;
    }

    /**
     * Gets the value of the transmitWindowSize property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getTransmitWindowSize() {
        return transmitWindowSize;
    }

    /**
     * Sets the value of the transmitWindowSize property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setTransmitWindowSize(BigInteger value) {
        this.transmitWindowSize = value;
    }

    /**
     * Gets the value of the bandwidthWindowSize property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getBandwidthWindowSize() {
        return bandwidthWindowSize;
    }

    /**
     * Sets the value of the bandwidthWindowSize property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setBandwidthWindowSize(BigInteger value) {
        this.bandwidthWindowSize = value;
    }

    /**
     * Gets the value of the congestionWindowSize property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getCongestionWindowSize() {
        return congestionWindowSize;
    }

    /**
     * Sets the value of the congestionWindowSize property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setCongestionWindowSize(BigInteger value) {
        this.congestionWindowSize = value;
    }

    /**
     * Gets the value of the slowStartThresholdSize property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getSlowStartThresholdSize() {
        return slowStartThresholdSize;
    }

    /**
     * Sets the value of the slowStartThresholdSize property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setSlowStartThresholdSize(BigInteger value) {
        this.slowStartThresholdSize = value;
    }

    /**
     * Gets the value of the segmentsReceivedOutOfOrder property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getSegmentsReceivedOutOfOrder() {
        return segmentsReceivedOutOfOrder;
    }

    /**
     * Sets the value of the segmentsReceivedOutOfOrder property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setSegmentsReceivedOutOfOrder(BigInteger value) {
        this.segmentsReceivedOutOfOrder = value;
    }

    /**
     * Gets the value of the fastRetransmits property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getFastRetransmits() {
        return fastRetransmits;
    }

    /**
     * Sets the value of the fastRetransmits property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setFastRetransmits(BigInteger value) {
        this.fastRetransmits = value;
    }

    /**
     * Gets the value of the timedRetransmits property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getTimedRetransmits() {
        return timedRetransmits;
    }

    /**
     * Sets the value of the timedRetransmits property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setTimedRetransmits(BigInteger value) {
        this.timedRetransmits = value;
    }

    /**
     * Gets the value of the connectionUptimeS property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getConnectionUptimeS() {
        return connectionUptimeS;
    }

    /**
     * Sets the value of the connectionUptimeS property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setConnectionUptimeS(BigInteger value) {
        this.connectionUptimeS = value;
    }

    /**
     * Gets the value of the blockedCyclesPercent property.
     */
    public long getBlockedCyclesPercent() {
        return blockedCyclesPercent;
    }

    /**
     * Sets the value of the blockedCyclesPercent property.
     */
    public void setBlockedCyclesPercent(long value) {
        this.blockedCyclesPercent = value;
    }

    /**
     * Gets the value of the interface property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getInterface() {
        return _interface;
    }

    /**
     * Sets the value of the interface property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setInterface(String value) {
        this._interface = value;
    }

}
