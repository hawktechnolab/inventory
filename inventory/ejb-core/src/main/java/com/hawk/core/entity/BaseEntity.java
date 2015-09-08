/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
