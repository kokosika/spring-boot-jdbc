/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.concretepage.framework.entity;

import javax.persistence.*;

/**
 *
 * @author fcortez
 */
@MappedSuperclass
public class BaseDomainEntity extends BaseEntity{
    
    @Column(length = 50,nullable = false)
    private String name;
    @Column(length = 100)
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
