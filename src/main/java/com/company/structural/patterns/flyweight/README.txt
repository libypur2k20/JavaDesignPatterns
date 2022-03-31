STRUCTURAL PATTERNS - FLYWEIGHT


What is Flyweight?
------------------

- Our system needs a large number of objects of a particular class, and maintaining these
  instances is a performance concern.

- Flyweight allows us to share an object in multiple contexts, but instead of sharing the
  entire object, which may not be feasible, we divide object state in two parts: intrinsic
  (state that is shared in every context) and extrinsic (context specific state).
  We create objects with only intrinsic state and share them in multiple contexts.

- Client or user of object provides the extrinsic staate to object to carry out its
  functionality.

- We provide a factory so  client can get requires flyweight objects based on some key to
  identity flyweight.


Implement a Flyweight
---------------------

- We start by identifying "intrinsic" and "extrinsic" state of our object.
    * We create an interface for flyweight we add intrinsic state and also implement methods.
    * In implementation of shared flyweight we add instrinsic state and also implement methods.
    * In unshared flyweight implementation we simply ignore the xtrinsic state argument as we
      have all state within object.

- Next we implement the flyweight factory which caches flyweights and also provides method to
  get them.

- In our client we either maintain the extrinsic state or compute it on the fly when using
  flyweight.


Implementation Considerations
-----------------------------

- A factory is necessary with flyweight design pattern as client code needs easy way to get hold
  of shared flyweight. Also, number of shared instances can be large, so a central place is good
  strategy to keep track of all of them.

- Flyweight's intrinsic state should be immutable for successful use of flyweight pattern.


Design Considerations
---------------------

- Usability of flyweight is entirely dependent upon presence of sensible extrinsic state in object
  which can be moved out of object without any issue.

- Some other design patterns like state and strategy can make best use of flyweight pattern.


Example
-------

- Java uses flyweight pattern for Wrapper classes like 'java.lang.Integer', 'java.lang.Short',
  'java.lang.Byte', etc.
  Here the valueOf static method serves as the factory method.

- String pool which is maintained by JVM is also an example of flyweight. We can call the
  'intern()' method on a String object to explicitly request this String object to be interned.
  This method will return a reference to already cached object if present or else will create
  new String in cache if not present.


Pitfalls
--------

- Runtime cost may be added for maintaining extrinsic state. Client code has to either maintain
  it or compute it every time it needs to use flyweight.

- It is often difficult to find perfect candidate objects for flyweight. Graphical applications
  benefit heavily from this pattern however, a typical web application may not have a lot of use
  for this pattern.


Summary
-------

- We use flyweight design pattern if we need large number of objects of class where we can
  easily separate out state that can be shared and state that can be externalized.

- Flyweights store only "intrinsic" state or state that can be shared in any context.

- Code using flyweight instance provides the extrinsic state when calling methods on flyweight.
  Flyweight object then uses this state along with its inner state to carry out the work.

- Client code can store extrinsic per flyweight instance it uses or compute it on the fly.