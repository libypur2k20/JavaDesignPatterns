package com.company.structural.patterns.bridge;

// This is the abstraction.
// It represents a First In First Out collection.
public interface FifoCollection<T> {

    // Adds element to collection.
    void offer(T element);

    // Removes and return the first element from collection
    T poll();
}
