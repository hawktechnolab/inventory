/*
 * Copyright (C) 2015 Nisheeth Shah
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
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
