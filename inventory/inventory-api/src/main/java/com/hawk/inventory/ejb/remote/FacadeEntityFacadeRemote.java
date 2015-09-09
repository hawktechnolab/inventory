/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hawk.inventory.ejb.remote;

import com.hawk.core.entity.EntityRemote;
import com.hawk.inventory.entity.FacadeEntity;
import javax.ejb.Remote;

/**
 *
 * @author Nisheeth Shah
 */
@Remote
public interface FacadeEntityFacadeRemote extends EntityRemote<FacadeEntity> {
}
