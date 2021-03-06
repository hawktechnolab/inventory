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

import java.io.Serializable;

/**
 *
 * @author Nisheeth Shah
 */
public interface BaseEntity extends Serializable, Cloneable {

    /**
     * Getter method for id of entity.
     *
     * @return
     */
    Long getId();

    /**
     * Setter method for id for entity.
     *
     * @param id
     */
    void setId(Long id);
}
