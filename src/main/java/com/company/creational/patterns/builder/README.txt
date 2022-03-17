BUILDER PATTERN

What problem solves?

- Class constructor requires a lot of information.
- Objects of the class should be immutable (state or
  properties cannot be changed once the object is created).
- Objects that need other objects or "parts" to construct them.


What is a Builder?

- We have a complex process to construct an object involving
  multiple steps, then builder design pattern can help us.

- In builder we remove the logic related to object construction and
  from "client" code / abstract it in separate classes.


Implementation Considerations
-----------------------------

- You can easily create an immutable class by implementing builder as an inner static class.
  Yu'll find this type of implementation used quite frequently even if immutability is not a
  main concern.


Design Considerations
---------------------

- The director role is rarely implemented as separate class, typically the consumer of the
  object instance of the client handles that role.

- Abstract builder is also not required if "product" itself is not part of any inheritance
  hierarchy. You can directly create concrete builder.

- If you are running onto a "too many constructor arguments" problem, then it's a good
  indication that builder pattern 'may' help.


Examples
--------

- java.lang.StringBuilder
- java.util.Calendar.Builder


Pitfalls
--------

- A little bit complex for new comers mainly because of 'method chaining'
  where builder methods return builder object itself.

- Possibility of partially initialized object; User code can set only a few or none
  of properties using withXXX methods and call build().
  If required properties are missing, build method should provide suitable defaults
  or throw exception.


  Summary
  -------

  - Think of builder pattern when you have a complex constructor or an object is built
    in multiple steps.