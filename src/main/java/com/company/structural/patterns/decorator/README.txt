STRUCTURAL PATTERNS - DECORATOR


What is Decorator?
------------------

- When we want to enhance behaviour of our existing object as and when required then
  we can use decorator design pattern.

- Decorator wraps an object within itself and provides same functionality as the
  wrapped object, so the client of original object doesn't need to change.

- A decorator provides alternative to subclassing for extending functionality of existing
  classes.


Implement a decorator
---------------------

- We start with our component
    * Component defines interface needed or already used by client.
    * Concrete component implements the component.
    * We define our decorator. Decorator implements component, and also needs reference to
      concrete component.
    * In decorator methods we provide additional behaviour on top that provided by concrete
      component instance.

- Decorator can be abstract as well, and depend on subclasses to provided functionality.


Implementation Considerations
-----------------------------

- Since we have decorators and concrete classes extending from common component, avoid large
  state in this base class, as decorators may not need all that state.

- Pay attention to equals and hashCode methods of decorator. When using decorators, you have to
  decide if decorated object is equal to same instance without decorator.

- Decorators support recursive composition, and so this pattern lends itself to creation of lots
  of small objects that add "just a little" functionality. Code using these objects becomes
  difficult to debug.


Design Considerations
---------------------

- Decorators are more flexible and powerful than inheritance. Inheritance is static by definition,
  but decorators allow you to dynamically compose behaviour using objects at runtime.

- Decorators should act like additional skin over your project. They should add helpful small
  behaviours to object's original behaviour.
  Do not change meaning of operations.


Example
-------

- Classes in Java's I/O package are great examples of decorator pattern.

- For example, the 'java.io.BufferedOutputStream' class decorates any 'java.io.OutputStream' object
  and adds buffering to file writing operation. This improves the disk i/o performance by reducing
  number of writes.


Pitfalls
--------

- Often results in large number of classes being added to system, where each class adds a small
  amount of functionality. You often end up with lots of objects, one nested inside another and so on.

- Sometimes newcomers will start using it as a replacement of inheritance in every scenario.
  Think of decorators as a thin skin over existing object.


Summary
-------

- We use decorator when we want to add small behaviour on top of existing object.

- A decorator has the same interface as the object it decorates or contains.

- Decorator allows you to dynamically construct behaviour by using composition. A decorator can wrap
  another decorator which in turn wraps original object.

- Client of object is unaware of existence of decorator.


Implementation Considerations
-----------------------------

- You can provide a method to access parent of a node. This will simplify traversal of the entire tree.

 - You can define the collection field to maintain children in base component instead of composite, but
   again that field has no use in leaf class.

- If leaf objects can be repeated in the hierarchy, then shared leaf nodes can be used to save memory and
  initialization costs. But again the number of nodes is a major deciding factor as using a cache for
  small total number of nodes may cost more.


Design Considerations
---------------------

- Decision needs to be made about where child management operations are defined.
  Defining them on component provides transparency, but leaf nodes are forced to implement those methods.
  Defining them on composite is safer, but client needs to be made aware of composite.

- Overall goal of design should be to ake client code easier to implement when using composite.
  This is possible if client code can work with component interface only and doesn't need to worry about
  leaf-composite distinction.


Example
--------

- Composite is used in many UI frameworks, since it easily allows to represent a tree of UI controls.

- In JSF we have UIViewRoot class which acts as composite. Other UIComponent implementations like
  UIOutput, UIMessage act as leaf nodes.


Pitfalls
--------

- Difficult to restrict what is added to hierarchy. If multiple types of leaf nodes are present in system,
  then client code ends up doing runtime checks to ensure the operation is available on a node.

- Creating the original hierarchy can still be complex implementation especially if you are using
  caching to reuse nodes and the number of nodes is quite high.


Summary
-------

- We have a parent-child or whole-part relation between objects. We can use composite pattern to
  simplify dealing with such object arrangements.

- Goal of composite pattern is to simplify the client code by allowing it to treat the composites and leaf
  nodes in the same way.

- Composites will delegate the operations to its children while leaf nodes implement the functionality.

- You have to decide which methods the base component will define. Adding all methods here will allow
  client to treat all nodes in the same way, but it may force classes to implement behaviour which they
  don't have.
