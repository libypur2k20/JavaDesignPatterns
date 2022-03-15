INTERFACE SEGREGATION PRINCIPLE

Clients should not have to depend on interfaces that they don't use.
Clients should not have to depend on methods that are defined on interfaces
that they don't use.

Interface Pollution:

- Large Interfaces.
- Unrelated Methods.

Signs of Interface pollution:

- Classes have empty method implementations.
- Method implementations throw UnsupportedOperationException (or similar).
- Method implementations return null or default/dummy values
