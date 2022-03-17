SIMPLE FACTORY DESIGN PATTERN

- Multiple types can be instantiated and the choice is based on some simple criteria.

- Here we simply move the instantiation logic to a separate class and most commonly
  to a static method of this class.

- Some do not consider simple factory to be a "design pattern", as its simply a
  method that encapsulates object instantiation. Nothing complex goes on in that method.

- Typically we want to do this if we have more than one option when instantiating object
  and a simple logic is used to choose correct class.


Implementation Considerations
-----------------------------

- Simple factory can be just a method in existing class. Adding a separate class
  however allows other parts of your code to use simple factory more easily.

- Simple factory itself doesn't need any state tracking, so it's best to keep this
  as a static method.


Design Considerations
---------------------

- Simple factory will in turn may use other design patterns like builder to construct
  objects.

- In case you want to specialize your simple factory in sub classes, you need factory
  method design pattern instead.


Examples
--------

- The java.text.NumberFormat class has a getInstance method, which is an example of
  simple factory. (rt.jar)


Pitfalls
--------

- The criteria used by simple factory to decide which object to instantiate can
  get more convoluted/complex over time. If you find yourself in such situation
  then use factory method design pattern.


Summary
-------

- Simple factory encapsulates away the object instantiation in a separate method.

- We can pass an argument to this method to indicate product type and/or additional
  arguments to help create objects.
