STRUCTURAL PATTERNS - BRIDGE


What is Bridge?
---------------

- Our implementations and abstractions are generally coupled to each other in normal
  inheritance.

- Using bridge pattern we can decouple them, so they can both change without affecting
  each other.

- We achieve this feat by creating two separated inheritance hierarchies; One for
  implementation and another for abstraction.

- We use composition to bridge these two hierarchies.


Implement a Bridge
------------------

- We start by defining our abstraction as needed by client.
    * We determine common base operations and define them in abstraction.
    * We can optionally also define a refined abstraction, and provide more specialized
      operations.
    * Then we define our implementor next. Implementor methods do NOT have to match with
      abstractor. However, abstractor can carry out it's work by using implementor methods.
    * Then we write one or more concrete implementor providing implementation.

- Abstractions are created by composing them with an instance of concrete implementor which
  is used by methods in abstraction.


Implementation Considerations
-----------------------------

- In case we are ever going to have a single implementation, then we can skip creating abstract
  implementor.

- Abstraction can decide on its own which concrete implementor to use in its constructor, or we
  can delegate that decision to a third class.
  In last approach, abstraction remain unaware of concrete implementors, and provides great
  decoupling.


Design Considerations
---------------------

- Bridge provides great extensibility by allowing us to change abstraction and implementor
  independently.
  You can build and package them separately to modularize overall system.

- By using abstract factory pattern to create abstraction objects with correct implementation
  you can decouple concrete implementors from abstraction.


Example
-------

- An example of bridge pattern often given is the JDBC API. More specifically, the
  'java.sql.DriverManager' class with the 'java.sql.Driver' interface form a bridge pattern.

- An example of bridge pattern often given is the 'java.util.Collections.newSetFromMap' method.
  This method returns a Set that is backed by given map object.


Pitfalls
--------

- It is fairly complex to understand and implement bridge design pattern.

- You need to have a well-thought-out and fairly comprehensive design in front of you
  before you can decide on bridge pattern.

- Needs to be designed up-front. Adding bridge to legacy code is difficult. Even for ongoing
  project, adding bridge at later time in development may require fair amount of rework.


Summary
-------

- We use bridge design pattern when we want our abstractions and implementations to be decoupled.

- Bridge pattern defines separate inheritance hierarchies for abstraction and implementations and
  bridges these two together using composition.

- Implementations do NOT have to define methods that match up with methods in abstraction.
  It is fairly common to have primitive methods which do small work in implementor.
  Abstraction uses these methods to provide its functionality.