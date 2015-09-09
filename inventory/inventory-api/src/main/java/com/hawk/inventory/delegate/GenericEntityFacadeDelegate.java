/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hawk.inventory.delegate;

import com.hawk.core.entity.BaseEntity;
import com.hawk.core.entity.EntityRemote;
import com.hawk.inventory.ejb.remote.FacadeEntityFacadeRemote;
import com.hawk.inventory.entity.FacadeEntity;
import com.hawk.util.ejb.LookupUtil;
import java.util.List;

/**
 *
 * @author Nisheeth Shah
 */
public class GenericEntityFacadeDelegate<T> {

    private EntityRemote<T> entityRemote;
    private final Class<? extends BaseEntity> entityClass;
    private FacadeEntity facadeEntity;
    private FacadeEntityDelegate facadeDelegate;

    public GenericEntityFacadeDelegate(Class<? extends BaseEntity> entityClass) {
        this.entityClass = entityClass;
        initRemote();
    }

    private void initRemote() {
        facadeDelegate = new FacadeEntityDelegate();
        facadeEntity = facadeDelegate.findByColumn("entity", entityClass).get(0);
        entityRemote = LookupUtil.lookupRemote(facadeEntity.getEjb(), facadeEntity.getRemoteInterface());
    }

    public void create(T entity) {
        entityRemote.create(entity);
    }

    public void edit(T entity) {
        entityRemote.edit(entity);
    }

    public void remove(T entity) {
        entityRemote.remove(entity);
    }

    public T find(Object id) {
        return entityRemote.find(id);
    }

    public List<T> findAll() {
        return entityRemote.findAll();
    }

    public List<T> findRange(int[] range) {
        return entityRemote.findRange(range);
    }

    public int count() {
        return entityRemote.count();
    }

    public List<T> findByColumn(String attributeName, Object value) {
        return entityRemote.findByColumn(attributeName, value);
    }

}
