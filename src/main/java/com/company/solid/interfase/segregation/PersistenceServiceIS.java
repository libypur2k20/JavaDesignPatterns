package com.company.solid.interfase.segregation;

import java.util.List;

public interface PersistenceServiceIS<T> {

    void save(T entity);

    void delete(T entity);

    T findById(Long id);

}
