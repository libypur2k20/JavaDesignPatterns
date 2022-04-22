package com.company.behavioral.patterns.iterator;

// Iterator interface allowing to iterate over
// values of an aggregate.
public interface Iterator<T> {

    T next();

    boolean hasNext();

}
