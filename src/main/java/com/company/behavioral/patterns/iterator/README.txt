BEHAVIORAL DESIGN PATTERNS - ITERATOR


What is Iterator?
-----------------

- Iterator allows a way to access elements/children of an aggregate object in sequence
  while hiding the actual interal data structure used.

- In Java language, iterators are integral part of collection frameworks, and the are
  implementations of this design pattern.

- Iterators are stateful, meaning an iterator object remembers its position while iterating.

- Iterators can become out of sync if the underlying collection is changed while a code is
  using iterator.


Implement Iterators
-------------------

- We start by defining Iterator interface.
    * Iterator has methods to check whether there is an element available in sequence, and
      to get that element.

- We then implement  the Iterator in a class. This is typically an inner class in our concrete
  aggregate. Making it an inner class makes it easy to access internal data structures.

- Concrete iterator needs to maintain state ot tell its position in collection of aggregate.
  If the inner collection changes, it can throw an exception to indicate invalid state.


Implementation Considerations
-----------------------------

- Detecting change to underlying data structure while some code is using an iterator is
  important to notify the client, because then our iterator may not work correctly.

- Having our iterator implementation as inner class makes it easy to access internal collection
  of aggregate objects.


Design Considerations
---------------------

- Always prefer iterator interface, so you can change the implementation without affecting client.

- Iterators have many applications where a collection is not directly used, but we still want to
  give sequential access to information, for example, reading lines from file or network resource.


Example
-------

- The iterator classes in Java's collection framework are great examples of iterator.
  The concrete iterators are typically inner classes in each collection class implementing
  'java.util.Iterator' interface.

- The 'java.util.Scanner' class is also an example of Iterator pattern.
  This class supports InputStream as well and allows iterating over a stream.
  e.g.
  Scanner sc = new Scanner(System.in);
  int i = sc.nextInt();

- The 'java.xml.stream.XMLEventReader' class is also an iterator.
  This class turns the XML into a stream of event objects.


Pitfalls
--------

- Access to index during iteration is not readily available like we have in a for loop.

- Making modifications to the collection while someone is using an iterator often makes
  that iterator instance invalid as its state may not be valid.


Summary
-------

- When we want to iterate or give sequential access to elements of aggregate object we can
  use iterator design pattern.

- Iterator needs access to internal data structure of aggregator to provide its functionality.
  This usually means it's quite common to have iterator implemented as inner class.

- Iterator allows the client code to check whether there is an element available to consume
  and give next available element.

- We can also provide reverse, or bidirectional (forward + backward) iterator depending on
  underlying data structure.