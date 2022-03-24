CREATIONAL PATTERNS - SINGLETON


What is a Singleton?
--------------------

- A singleton class has only one instance, accessible globally through a single point
  (via a method/field).

- Main problem this pattern solves is to ensure that only a single instance of this class exists.

- Any state you add in your singleton becomes part of "global state" of your application.
  Generally, having a large global state is an indication of a bad design or implementation.


Implement a Singleton
---------------------

- Controlling instance creation.
  * Class constructor(s) must not be accessible globally.
  * Subclassing/inheritance must not be allowed.

- Keeping track of instance.
  * Class itself is a good place to track the instance.

- Giving access to the singleton instance.
  * A public static method is good choice.
  * Can expose instance as final public static field, but it won't work
    for all singleton implementations.

- Two options for implementing a singleton
  * Early initialization - Eager Singleton
    + Create singleton as soon as class is loaded.
  * Lazy initialization - Lazy Singleton
    + Singleton is created when it is first required.


Implementation Considerations
-----------------------------

- Early/Eager initialization is the preferred and simplest way. Always try to use this approach first.

- The "classic" singleton pattern implementation uses double check locking and volatile field.

- Tha lazy initialization holder idiom provides best of both worlds. You don't deal with
  synchronization issues directly, and it's easy to implement.

- You can also implement singletons using enums. However, due to pre-conceptions about what an enum is,
  it may be a hard shell during code review, especially if singleton have mutable fields.

- If the simple solution works then use it!


Design Considerations
---------------------

- Singleton creation does not need any parameters. If you find yourself in need of support for
  construction arguments, you need a simple factory or factory method pattern instead.

- Make sure that your singletons are NOT carrying a lot of MUTABLE global state.


Example
-------

- The 'java.lang.Runtime' class in standard Java API is a singleton.


Pitfalls
--------

- Singleton pattern can "deceive" you about true dependencies! Since they are globally
  accessible, it's easy to miss dependencies.

- They are hard to unit test. You cannot easily mock the instance that is returned.

- Most common ways to implement singletons in Java is through static variables, and they
  are held by class loader and not by JVM, so they may not be truly Singleton in an OSGi
  or web application.

- A singleton carrying around a large "mutable" global state is a good indication of an
  abused Singleton Pattern.


Summary
-------

- Singleton pattern is used when you want to ensure that only one instance of a class
  exists in application.

- In Java, we achieve this by making constructor private. This also prevents inheritance
  , and also providing a public static method which returns the singleton instance.

- Implementation wise we have two broad choices:
  * In eager loading singleton, we create instance as soon as class is loaded by Classloader.
  * In lazy loading singleton, we defer creation until some code actually requests the instance.

- Always prefer the eager loading instance, unless creation cost is high and start-up time
  impact is noticeable.

- There are very few situations where a singleton is "really" a good choice.

- Application configuration values can be tracked in a singleton. Typically, these are read from
  file at start, and then referred to by other parts of the application.

- Logging frameworks also make use of singleton pattern.

- Spring framework treats all beans by default as singletons. In Spring, we don't have to make
  any changes to ensure single instance. Spring handles that for us.