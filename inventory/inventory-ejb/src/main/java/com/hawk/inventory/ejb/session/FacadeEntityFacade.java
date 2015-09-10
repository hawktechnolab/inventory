/*
 * Copyright (c) 2015 Hawk Technologies.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Hawk License
 * which accompanies this distribution.
 *
 * Contributors:
 *    Nisheeth Shah - initial API and implementation and/or initial documentation
 */
package com.hawk.inventory.ejb.session;

import com.hawk.core.ejb.entity.session.AbstractFacade;
import com.hawk.inventory.ejb.local.FacadeEntityFacadeLocal;
import com.hawk.inventory.ejb.remote.FacadeEntityFacadeRemote;
import com.hawk.inventory.entity.FacadeEntity;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Nisheeth Shah
 */
@Stateless
public class FacadeEntityFacade extends AbstractFacade<FacadeEntity> implements FacadeEntityFacadeLocal, FacadeEntityFacadeRemote {

    @PersistenceContext(unitName = "inventory_PU")
    private EntityManager em;

    public FacadeEntityFacade() {
        super(FacadeEntity.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

}
