# How to ...

## ... create a new platform instance? ##

In order to instantiate the BaSys 4.0 service platform, use the corresponding Apache Maven Archetype. 
Issue the following command in a console window and answer the questions regarding *groupId*, *artifactId*, *name*, and *description*.

```
mvn archetype:generate 
	-DarchetypeGroupId=de.dfki.cos.basys.platform.archetype 
	-DarchetypeArtifactId=de.dfki.cos.basys.platform.archetype.platform-instance 
```

The appropriate folder structure is automatically created including basic models, a sample device component, and a sample process.

From this point onwards, you may want to ...
* Build and install everything with Apache Maven
* Import the platform instance as Apache Maven Projects in the Eclipse IDE
* Launch the platform instance from the Eclipse IDE
* Launch the platform instance as standalone Apache Karaf Distribution

## ... work with the Commmunication API? 
*TODO:* explain

## ... implement a new CommunicationProvider?
*TODO:* explain

## ... implement a new service component?
*TODO:* explain

## ... deploy a new service component into the BaSys-OSGI-Platform?
*TODO:* explain

## ... configure a service component?
*TODO:* explain

## ... implement a new technology adapter for device integration?
*TODO:* explain

## ... implement a device component based on an available technology adapter?
*TODO:* explain

## ... configure a device component?
*TODO:* explain

## ... model the capabilities of a device component?
*TODO:* explain

## ... implement a Camunda BPMN process that controls devices?
*TODO:* explain

## ... deploy a BPMN process to the Camunda BPM platform?
*TODO:* explain

## ... build a new demonstrator?
1. Model your topology.
2. Model your product (variants) to produce.
3. Model your device types including basic capabilities.
4. Model your device instances including product-specific capabilities.
5. Assign your device instances to topology elements.
6. Model your manufacturing process as sequence of product-specific capability requirements.
7. Implement your PackML-based device components for each distinct device instance in (4).
8. Create appropriate configuration files for instantiation implemented device components.


*TODO:* explain