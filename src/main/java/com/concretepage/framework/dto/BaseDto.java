/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.concretepage.framework.dto;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author fcortez
 */
public class BaseDto implements Serializable {
    
    private int id;
    private Date stateCreate;
    private Date stateLastUpdate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getStateCreate() {
        return stateCreate;
    }

    public void setStateCreate(Date stateCreate) {
        this.stateCreate = stateCreate;
    }

    public Date getStateLastUpdate() {
        return stateLastUpdate;
    }

    public void setStateLastUpdate(Date stateLastUpdate) {
        this.stateLastUpdate = stateLastUpdate;
    }
    
    
    
}
