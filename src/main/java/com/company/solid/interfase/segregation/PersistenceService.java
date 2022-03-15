package com.company.solid.interfase.segregation;

import java.util.List;

public interface PersistenceService<T> {

    void save(T entity);

    void delete(T entity);

    T findById(Long id);

    List<T> findByName(String name);

}
