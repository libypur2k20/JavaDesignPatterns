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