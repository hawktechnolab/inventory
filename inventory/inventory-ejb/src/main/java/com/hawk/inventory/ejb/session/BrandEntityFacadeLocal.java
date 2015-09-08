/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hawk.inventory.ejb.session;

import com.hawk.inventory.entity.BrandEntity;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Nisheeth Shah
 */
@Local
public interface BrandEntityFacadeLocal {

    void create(BrandEntity brandEntity);

    void edit(BrandEntity brandEntity);

    void remove(BrandEntity brandEntity);

    BrandEntity find(Object id);

    List<BrandEntity> findAll();

    List<BrandEntity> findRange(int[] range);

    int count();
    
}
