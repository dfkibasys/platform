# The BaSys 4.0 Service Platform

The Platform Repository consists of three layered modules (1) *[Models](#models)*, (2) *[Runtime](#runtime)*, and (3) *[OSGi](#osgi)*. 

All artifacts can be downloaded from [Maven Central](https://mvnrepository.com/artifact/de.dfki.cos.basys.platform). The current version of the platform is 0.2.4.

## Models

This layer contains neccessary meta-models used in the runtime layer. 
The meta-models are designed with the [Eclipse Modeling Framework](https://www.eclipse.org/modeling/emf/) (EMF). 
Due to the underlying EMF code generation mechanism, the Models layer also contains generated editors (.edit and .editor projects) for the Eclipse IDE.

*TODO:* describe meta-models

## Runtime

### Communication Middleware

*TODO:* explain supported communication patterns, resulting API, and supporting technology providers for ActiveMQ and MQTT.

### Core Runtime Components

*TODO:* explain the notion of BaSys service/device components

### Technology adapters for device integration

Different devices support different communication technologies and protocols. This service platform currently supports (in alphabetical order):

 * **de.dfki.cos.basys.runtime.component.device.mqtt**: [MQTT v3.1.1](http://mqtt.org/)
 * **de.dfki.cos.basys.runtime.component.device.opcua**: [OPC-UA](https://opcfoundation.org/about/opc-technologies/opc-ua/)
 * **de.dfki.cos.basys.runtime.component.device.rest**: HTTP/REST
 * **de.dfki.cos.basys.runtime.component.device.ros**: [ROS](http://www.ros.org/)
 * **de.dfki.cos.basys.runtime.component.device.xmlrpc**: [XML-RPC](http://www.xmlrpc.com/)
 
Other technologies and protocols can easily be integrated as well.

## OSGi

This module implements an integration layer for the OSGi service platform. It consists of:

 * **de.dfki.cos.basys.platform.osgi.cm**: a custom, file-based Configuration Manager for OSGi service components.
 * **de.dfki.cos.basys.platform.osgi.services**: a set of concrete OSGi service components that wrap required BaSys service components for bootstrapping a BaSys service platform on top of OSGi.
 * **de.dfki.cos.basys.platform.osgi.logging**: an OSGi fragment bundle for session-based log files using log4j.
