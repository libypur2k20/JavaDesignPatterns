CREATIONAL PATTERNS - ABSTRACT FACTORY

What is an Abstract Factory?
----------------------------

- Abstract factory is used when we have two or ore objects which work together forming a
  kit or set and there can be multiple sets or kits that can be created by client code.

- So we separate client code from concrete objects forming such a set and also from the
  code which create these sets.


Implementation Steps
--------------------

- We start by studying the product "sets"
  * Create abstract factory as an abstract class or an interface.
  * Abstract factory defines abstract methods for creating products.
  * Provide concrete implementation of factory for each set of products.

- Abstract factory makes use of factory method pattern. You can think of
  abstract factory as an object with multiple factory methods.


Implementation Considerations
-----------------------------

- Factories can be implemented as singletons,
  we typically ever need only one instance of it anyway.
  But make sure to familiarize yourself with drawbacks of singletons.

- Adding a new product type requires changes to the base factory as well
  as all implementations of factory.

- We provide the client code with concrete factory so that it can create objects.


Design Considerations
---------------------

- When you want to constrain object creations so that they all work together,
  then abstract factory is a good design pattern.

- Abstract factory uses factory method pattern.

- If objects are expensive to create, then you can transparently switch factory
  implementations to use prototype design pattern to create objects.


Example
-------

- The 'javax.xml.parsers.DocumentBuilderFactory' is a good example of an abstract
  factory pattern.

- However this implementation doesn't match 100% with the UL of abstract factory from
  GoF. The class has a static 'newInstance()' method which returns actual factory
  class object.

- The 'newInstance()' method however uses classpath scanning, system properties, an
  external property file as ways to find the factory class, and creates the factory
  object, so we can change the factory class being used, even if this is a static
  method.


Pitfalls
--------

- A lot more complex to implement than factory method.

- Adding a new product requires changes to base factory as well as ALL implementations
  of factory.

- Difficult to visualize the need at start of development and usually starts out as a
  factory method.

- Abstract factory design pattern is very specific to the problem of "product families".


Summary
-------

- When you have multiple sets of objects where objects in one set work together then you can use
  abstract factory pattern to isolate client code from concrete object and their factories.

- Abstract factory itself uses factory method pattern, and you can think of them as objects with
  multiple factory methods.

- Adding a new product type needs changes to base factory and all its implementations.

- Concrete factories can be singleton as we need only one instance of them in code.

- We provide client code with concrete factory instance. Factories can be changed at runtime.