CREATIONAL PATTERNS - PROTOTYPE

What is a prototype?
--------------------

- We have a complex object that is costly to create.
  To create more instances of such class, we use an existing instance
  as our prototype.

- Prototype will allow us to make copies of existing object, and save us
  from having to recreate objects from scratch.


Implement a prototype
---------------------

- We start by implementing a class which will be a prototype.
    * The class must implement Cloneable interface.
    * Class should override Clone method and return a copy of itself.
    * The method should declare CloneNotSupportedException in throws clause
      to give subclasses chance to decide on whether to support cloning.

- Clone method implementation should consider the deep and shallow copy
  and decide whichever is applicable.
    * Shallow copy: Only properties of prototype object.
    * Deep copy   : Properties and all objects needed to create a new instance
                    of our prototype object.


Implementation Considerations
-----------------------------

- Pay attention on deep copy and shallow copy of references.
  Immutable fields on clones save the trouble of deep copy.

- Make sure to reset the mutable state of object before returning the prototype.
  It's a good idea to implement this in method to allow subclasses to initialize
  themselves.

- clone() method is protected in Object class and must be overridden to be public
  to be callable from outside the class.

- Cloneable is a "marker" interface (it does not define any method). It indicates
  that the class supports cloning.


Design Considerations
---------------------

- Prototypes are useful when you have large objects where majority of state is
  unchanged between instances, and you can easily identify that state.

- A prototype registry is a class where you can register various prototypes
  which other code can access to clone out instances. This solves the issue of
  getting access to initial instance.

- Prototypes are useful when working with Decorator and Composite patterns.


Examples
--------

- Actually the Object.clone() method is an example of a prototype|

- This method is provided by Java and can clone an existing object,
  thus allowing any object to act as a prototype.
  Classes still need to implement Cloneable, but the method does the
  job of cloning the object.


Pitfalls
--------

- Usability depends on the number of properties in state that are immutable
  or can be shallow copied.
  An object where state comprises large number of mutable objects is
  complicated to clone.

- In java the default clone operation will only perform the shallow copy, so
  if you need a deep copy, you have to implement it.

- Subclasses may not be able to support clone, and so the code becomes
  complicated, as you have to code for situations where an implementation
  may not support clone.


Summary
-------

- Think of prototype pattern when you have an object where construction of a
  new instance is costly or not possible (object is supplied to your code).

- In Java we typically implement this pattern with clone method.

- Objects which have a majority of their state is immutable are good candidates
  for prototypes.

- When implementing clone method, pay attention to the requirement of deep or
  shallow copy of object state.

- Also, we have to ensure that clone is "initialized"; that is appropriate states
  are reset before returning the copy to outside world.