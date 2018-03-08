/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.concretepage.framework.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.logging.Logger;
import javax.persistence.*;

/**
 *
 * @author fcortez
 */
@MappedSuperclass
public class BaseEntity implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Temporal(TemporalType.DATE)
    private Date stateCreate;
    @Temporal(TemporalType.DATE)
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
