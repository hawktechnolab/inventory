/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hawk.util.ejb;

import com.hawk.core.entity.EntityRemote;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author Nisheeth Shah
 */
public class LookupUtil {

    public static EntityRemote lookupRemote(String ejb, String remoteInterface) {
        try {
            Context c = new InitialContext();
            return (EntityRemote) c.lookup("java:global/inventory-ear/inventory-ejb-1.0-SNAPSHOT/" + ejb + "!" + remoteInterface);
        } catch (NamingException ne) {
            return null;
        }
    }
}
