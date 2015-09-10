/*
 * Copyright (c) 2015 Hawk Technologies.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Hawk License
 * which accompanies this distribution.
 *
 * Contributors:
 *    Nisheeth Shah - initial API and implementation and/or initial documentation
 */
package com.hawk.inventory.delegate;

import com.hawk.inventory.ejb.remote.FacadeEntityFacadeRemote;
import com.hawk.inventory.entity.FacadeEntity;
import com.hawk.util.ejb.LookupUtil;
import java.util.List;

/**
 *
 * @author Nisheeth Shah
 */
public class FacadeEntityDelegate {

    private final FacadeEntityFacadeRemote entityFacadeRemote;

    public FacadeEntityDelegate() {
        entityFacadeRemote = (FacadeEntityFacadeRemote) LookupUtil.lookupRemote("FacadeEntityFacade", "com.hawk.inventory.ejb.remote.FacadeEntityFacadeRemote");
    }

    public void create(FacadeEntity entity) {
        entityFacadeRemote.create(entity);
    }

    public void edit(FacadeEntity entity) {
        entityFacadeRemote.edit(entity);
    }

    public void remove(FacadeEntity entity) {
        entityFacadeRemote.remove(entity);
    }

    public FacadeEntity find(Object id) {
        return entityFacadeRemote.find(id);
    }

    public List<FacadeEntity> findAll() {
        return entityFacadeRemote.findAll();
    }

    public List<FacadeEntity> findRange(int[] range) {
        return entityFacadeRemote.findRange(range);
    }

    public int count() {
        return entityFacadeRemote.count();
    }

    public List<FacadeEntity> findByColumn(String attributeName, Object value) {
        return entityFacadeRemote.findByColumn(attributeName, value);
    }

}
