//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb"&gt;http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.04 at 09:27:51 AM GMT 
//


package com.solace.psg.sempv1.solacesemprequest;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PROCESS_NAME_PARAM.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PROCESS_NAME_PARAM"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="cli"/&gt;
 *     &lt;enumeration value="mgmtplane"/&gt;
 *     &lt;enumeration value="controlplane"/&gt;
 *     &lt;enumeration value="dataplane"/&gt;
 *     &lt;enumeration value="soldebug"/&gt;
 *     &lt;enumeration value="watchdog"/&gt;
 *     &lt;enumeration value="adbtool"/&gt;
 *     &lt;enumeration value="smlmanager"/&gt;
 *     &lt;enumeration value="solsnmp"/&gt;
 *     &lt;enumeration value="trmmanager"/&gt;
 *     &lt;enumeration value="msgbusadapter"/&gt;
 *     &lt;enumeration value="solcachemgr"/&gt;
 *     &lt;enumeration value="smrp"/&gt;
 *     &lt;enumeration value="solevent"/&gt;
 *     &lt;enumeration value="dnsmanager"/&gt;
 *     &lt;enumeration value="xfrm-persistObjBinToDbBaseline"/&gt;
 *     &lt;enumeration value="nab"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "PROCESS_NAME_PARAM")
@XmlEnum
public enum PROCESSNAMEPARAM {

    @XmlEnumValue("cli")
    CLI("cli"),
    @XmlEnumValue("mgmtplane")
    MGMTPLANE("mgmtplane"),
    @XmlEnumValue("controlplane")
    CONTROLPLANE("controlplane"),
    @XmlEnumValue("dataplane")
    DATAPLANE("dataplane"),
    @XmlEnumValue("soldebug")
    SOLDEBUG("soldebug"),
    @XmlEnumValue("watchdog")
    WATCHDOG("watchdog"),
    @XmlEnumValue("adbtool")
    ADBTOOL("adbtool"),
    @XmlEnumValue("smlmanager")
    SMLMANAGER("smlmanager"),
    @XmlEnumValue("solsnmp")
    SOLSNMP("solsnmp"),
    @XmlEnumValue("trmmanager")
    TRMMANAGER("trmmanager"),
    @XmlEnumValue("msgbusadapter")
    MSGBUSADAPTER("msgbusadapter"),
    @XmlEnumValue("solcachemgr")
    SOLCACHEMGR("solcachemgr"),
    @XmlEnumValue("smrp")
    SMRP("smrp"),
    @XmlEnumValue("solevent")
    SOLEVENT("solevent"),
    @XmlEnumValue("dnsmanager")
    DNSMANAGER("dnsmanager"),
    @XmlEnumValue("xfrm-persistObjBinToDbBaseline")
    XFRM_PERSIST_OBJ_BIN_TO_DB_BASELINE("xfrm-persistObjBinToDbBaseline"),
    @XmlEnumValue("nab")
    NAB("nab");
    private final String value;

    PROCESSNAMEPARAM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PROCESSNAMEPARAM fromValue(String v) {
        for (PROCESSNAMEPARAM c : PROCESSNAMEPARAM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
