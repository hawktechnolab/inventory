/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inventory.ejb.session.stateless;

import javax.ejb.Stateless;

/**
 *
 * @author Nisheeth Shah
 */
@Stateless
public class NewSessionBean implements NewSessionBeanLocal {

    @Override
    public String sayHello() {
        return "Hello There!";
    }

}
