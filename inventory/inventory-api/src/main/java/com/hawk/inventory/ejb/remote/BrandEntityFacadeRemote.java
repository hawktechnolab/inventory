/*
 * Copyright (c) 2015 Hawk Technologies.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Hawk License
 * which accompanies this distribution.
 *
 * Contributors:
 *    Nisheeth Shah - initial API and implementation and/or initial documentation
 */
package com.hawk.inventory.ejb.remote;

import com.hawk.core.entity.EntityRemote;
import com.hawk.inventory.entity.BrandEntity;

/**
 *
 * @author Nisheeth Shah
 */
@javax.ejb.Remote
public interface BrandEntityFacadeRemote extends EntityRemote<BrandEntity> {
}
