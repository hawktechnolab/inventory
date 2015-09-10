/*
 * Copyright (c) 2015 Hawk Technologies.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Hawk License
 * which accompanies this distribution.
 *
 * Contributors:
 *    Nisheeth Shah - initial API and implementation and/or initial documentation
 */
package com.hawk.util.ejb;

import com.hawk.core.entity.EntityRemote;
import com.hawk.log.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author Nisheeth Shah
 */
public class LookupUtil {

    private static final Logger log = new Logger(LookupUtil.class);

    public static EntityRemote lookupRemote(String ejb, String remoteInterface) {
        String ejb_jndi = "java:global/inventory-ear/inventory-ejb-1.0-SNAPSHOT/" + ejb + "!" + remoteInterface;
        try {
            Context c = new InitialContext();
            log.info("Looking up EJB remote : " + ejb + " # " + remoteInterface);
            log.debug("Looking up EJB remote jndi : " + ejb_jndi);
            Object remoteObject = c.lookup(ejb_jndi);
            log.info("EJB acquired : " + ejb + " # " + remoteInterface);
            return (EntityRemote) remoteObject;
        } catch (NamingException ne) {
            log.error(ne.getMessage(), ne);
            log.fatal("EJB lookup failed jndi : " + ejb_jndi + ".\n Returning null.");
            return null;
        }
    }
}
