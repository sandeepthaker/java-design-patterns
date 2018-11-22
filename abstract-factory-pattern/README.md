Abstract Factory pattern is almost similar to Factory Pattern except the fact that its more like factory of factories.
Abstract factory pattern implementation provides us a framework that allows us to create objects that follow a general pattern. So at runtime, abstract factory is coupled with any desired concrete factory which can create objects of desired type.

__Some real world examples__

__javax.xml.parsers.DocumentBuilderFactory#newInstance()__

__javax.xml.transform.TransformerFactory#newInstance()__

__javax.xml.xpath.XPathFactory#newInstance()__

![Abstract Factory Pattern UML Diagram](https://upload.wikimedia.org/wikipedia/commons/thumb/9/9d/Abstract_factory_UML.svg/677px-Abstract_factory_UML.svg.png)