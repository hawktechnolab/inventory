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

import com.hawk.inventory.ejb.local.BrandEntityFacadeLocal;
import com.hawk.core.ejb.entity.session.AbstractFacade;
import com.hawk.inventory.ejb.remote.BrandEntityFacadeRemote;
import com.hawk.inventory.entity.BrandEntity;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Nisheeth Shah
 */
@Stateless
public class BrandEntityFacade extends AbstractFacade<BrandEntity> implements BrandEntityFacadeLocal, BrandEntityFacadeRemote {

    @PersistenceContext(unitName = "inventory_PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BrandEntityFacade() {
        super(BrandEntity.class);
    }

}
