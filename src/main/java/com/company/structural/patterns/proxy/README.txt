STRUCTURAL PATTERNS - PROXY


What is a Proxy?
----------------

- We need to provide a placeholder or surrogate to another object.

- Proxy acts on behalf of the object and is used for lots of reasons.
  Some of the main reasons are:
    * Protection Proxy: Control access to original object's operations.
    * Remote proxy: Provides a local representation of a remote object.
    * Virtual proxy: Delays construction of original object until absolutely necessary.

- Client is unaware of existence of proxy. Proxy performs its work transparently.

- Lazy loading of collections by hibernate, APO based method level security,
  RMI/Web service stubs are examples of real life proxy usage.


Implement a Proxy
-----------------

- We start by implementing proxy
    * Proxy must implement same interface as the real subject.
    * We can either create actual object later when required or ask for one in constructor.
    * In method implementations of proxy we implement proxy's functionality delegating to
      real object.

- How to provide client with proxies instance is decided by application. We can provide a
  factory or compose client code with proxies instance.

- What we are implementing above is also called static proxy (we are statically defining a
  class and what happens in their methods). Java also provides "dynamic proxies" (all you
  need is an interface, and you can create proxies while app is running).