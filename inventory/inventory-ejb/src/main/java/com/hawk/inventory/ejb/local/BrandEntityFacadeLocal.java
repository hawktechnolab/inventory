/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hawk.inventory.ejb.local;

import com.hawk.core.entity.EntityRemote;
import com.hawk.inventory.entity.BrandEntity;
import javax.ejb.Local;

/**
 *
 * @author Nisheeth Shah
 */
@Local
public interface BrandEntityFacadeLocal extends EntityRemote<BrandEntity> {
}