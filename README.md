# The BaSys 4.0 Service Platform

The Platform Repository consists of three layered modules (1) *[Models](#models)*, (2) *[Runtime](#runtime)*, and (3) *[OSGi](#osgi)*. 

All artifacts can be downloaded from [Maven Central](https://mvnrepository.com/artifact/de.dfki.cos.basys.platform). The current version of the platform is 0.2.4.

## Models

This layer contains neccessary meta-models used in the runtime layer. 
The meta-models are designed with the [Eclipse Modeling Framework](https://www.eclipse.org/modeling/emf/) (EMF). 
Due to the underlying EMF code generation mechanism, the Models layer also contains generated editors (.edit and .editor projects) for the Eclipse IDE.


### The Base Model

As we pursue a holistic model-based system design that supports lightweight semantic reasoning at run-time, we need to have a root concept from which all other concepts derive. This is a standard approach in ontology engineering. As kind of an upper ontology, the Base Model contains the most abstract concepts and its properties and is depicted in the following diagram.

 <img src='/docs/model_base.png?raw=true' width='50%' height='50%'>

The root concept is called *Entity*. An *Entity* needs to have an *id* and might have a *name*. The implementation ensures that the *id* is automatically generated as a [UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier). So, you typically don't need to take care about this. Industrie 4.0 scenarios often deal with distributed information in terms of [Asset Administration Shells](https://www.zvei.org/fileadmin/user_upload/Presse_und_Medien/Publikationen/2018/November/Details_of-the_Asset_Administration_Shell/Details_of-the_Asset_Administration_Shell.PDF). Thus, we foresee that an *Entity* can also have *Metadata* attached.

*TODO:* describe the other meta-models

## Runtime

### Communication Middleware

Communication in the platform is realized by a Communication API that abstracts from technology-specific peculiarities and that supports the following communication patterns:
 - Request - Response (synchronous and asynchronous)
 - Publish - Subscribe

 <img src='/docs/communication_api.png?raw=true' width='75%' height='75%'>
 
In short, a Client manages a set of ChannelPools. 
A ChannelPool itself manages a set of named Channels.
In order to process incoming messages, a Channel needs to register a ChannelListener.
A ChannelPool and its Channels of course depend on a concrete communication technology. 
A sound mapping of the Communication API to such an existing middleware is provided by a CommunicationProvider.
A ChannelPool also manages the connection to this middleware, and from the perspective of this middleware, the ChannelPool acts as an actual client.

This Communication API is highly flexible. Without bothering the implementation and operation of BaSys platform components, it allows for
 - multiple ChannelPools that connect to the same communication middleware
 - multiple ChannelPools that connect to different communication middlewares
 - transfering a Channel between different ChannelPools
 - exchanging the CommunicationProvider of a ChannelPool

So far, CommunicationProviders are available for 
 - Apache ActiveMQ and
 - MQTT

A CommunicationProvider for [Apache Kafka](https://kafka.apache.org/) is under development.

To ensure functional equivalence, we run the same unit test against these provider implementations.

*TODO:* explain CommFactory

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
