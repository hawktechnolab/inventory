/*
 * Copyright (c) 2015 Hawk Technologies.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Hawk License
 * which accompanies this distribution.
 *
 * Contributors:
 *    Nisheeth Shah - initial API and implementation and/or initial documentation
 */
package com.hawk.inventory.ejb.local;

import com.hawk.core.entity.EntityLocal;
import com.hawk.inventory.entity.BrandEntity;
import javax.ejb.Local;

/**
 *
 * @author Nisheeth Shah
 */
@Local
public interface BrandEntityFacadeLocal extends EntityLocal<BrandEntity> {
}
