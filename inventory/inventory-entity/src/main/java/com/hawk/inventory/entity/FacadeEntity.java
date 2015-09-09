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
package com.hawk.inventory.entity;

import com.hawk.core.entity.BaseEntity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Nisheeth Shah
 */
@Entity
public class FacadeEntity implements BaseEntity {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String entity;

    private String remoteInterface;

    private String ejb;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getEntity() {
        return entity;
    }

    public void setEntity(String entity) {
        this.entity = entity;
    }

    public String getRemoteInterface() {
        return remoteInterface;
    }

    public void setRemoteInterface(String remoteInterface) {
        this.remoteInterface = remoteInterface;
    }

    public String getEjb() {
        return ejb;
    }

    public void setEjb(String ejb) {
        this.ejb = ejb;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof FacadeEntity)) {
            return false;
        }
        FacadeEntity other = (FacadeEntity) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "FacadeEntity{" + "id=" + id + ", entity=" + entity + ", remoteInterface=" + remoteInterface + ", ejb=" + ejb + '}';
    }

}