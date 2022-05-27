# semp-interface

## Description
Java SEMP v1 library

This library has been built using JAXB to generate code from Solace provided SEMP schemas. It can be used to call specific CLI commands via SEMP v1 from a Java project. 

It currently contains some sample tasks. The library contains package called: **sempv1** with SEMP commands.
Packages named: **solacesemprequest** and ** solacesempreply**, were generated from the Solace PubSub+ provided schemas.  

## Obtaining the schema XSDs
The PubSub+ product download portal should contain the schemas for SEMP v1. The following file can be downloaded for code generation to comply with newer PS+ broker versions:
- semp-rpc-reply-soltr-jaxb-bindings.xsd
- semp-rpc-reply-soltr-jaxb-bindings.xsd.md5
- semp-rpc-reply-soltr.xsd
- semp-rpc-soltr-jaxb-bindings.xsd
- semp-rpc-soltr-jaxb-bindings.xsd.md5
- semp-rpc-soltr.xsd
- semp-rpc-soltr.xsd.md5 

## Generating Java SEMP APIs
In order to integrate SEMP into a Java application, tools from the Java Architecture for XML Binding (JAXB) project can be used to generate a Java SEMP API. Using the third-party tool, you can create a set of Java classes from the SEMP XML schema that can be imported into Java applications. With those Java classes, your Java applications can create object-oriented SEMP request commands and decompose SEMP replies into Java objects.

More information can be found here:
https://tutorials.solace.dev/semp/generate-semp-client-lib/

To convert the Solace SEMP XML request and reply schemas to Java class files, the JAXB binding files for SEMP requests (semp-rpc-soltr-jaxb-bindings.xsd) and SEMP replies (semp-rpc-reply-soltr-jaxb-bindings.xsd) that are provided with the software release bundle must be specified when running the JAXB generation tool.

### To generate a Java SEMP API, perform the following:
Go to https://jaxb.java.net/ and download the latest release of JAXB.
Follow the instructions provided by the JAXB project to properly install the toolset.
Convert SEMP command schema.
In the JAXB conversion tool , enter the following command:

`xjc -p com.solace.psg.sempv1.solacesemprequest semp-rpc-soltr.xsd -b semp-rpc-soltr-jaxb-bindings.xsd`
The tool will create a SolaceSempRequestdirectory in the current directory. The new directory contains Java class files that represent the SEMP request commands.

### Convert SEMP reply schema.
In the JAXB conversion tool, enter the following command:

`xjc -p com.solace.psg.sempv1.solacesempreply semp-rpc-reply-soltr.xsd -b semp-rpc-reply-soltr-jaxb-bindings.xsd`
The tool will create a SolaceSempReply directory in the current directory. The new directory will contain Java class files that represent the SEMP reply commands.

For more information on how to import and use JAXB-generated APIs, go to https://jaxb.java.net.

### Merge newly generated files
If updating a new schema version, the newly generated files need to be merged into the existing source. The package types need to match the existing ones.

### Building the library:
To build solution use the folowing command:
 ```bash
 mvn clean compile package 
 ```
 
To skip tests add the follwoing parameter to the build command:
 ```bash
 mvn clean compile package -DskipTests
 ```
