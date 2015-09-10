/*
 * Copyright (c) 2015 Hawk Technologies.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Hawk License
 * which accompanies this distribution.
 *
 * Contributors:
 *    Nisheeth Shah - initial API and implementation and/or initial documentation
 */
package com.hawk.core.entity;

import java.util.List;

/**
 *
 * @author Nisheeth Shah
 */
public interface EntityRemote<T> {

    void create(T entity);

    void edit(T entity);

    void remove(T entity);

    T find(Object id);

    List<T> findAll();

    List<T> findRange(int[] range);

    int count();
    
    List<T> findByColumn(String attributeName, Object value);
}
