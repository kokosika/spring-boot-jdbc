/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.concretepage.entity.model.common;

import com.concretepage.entity.model.domain.TypeUser;
import com.concretepage.framework.entity.BaseEntity;
import javax.persistence.*;

/**
 *
 * @author fcortez
 */
@Entity
public class User extends BaseEntity{
    private String userName;
    private String password;
    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private TypeUser typeUser;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public TypeUser getTypeUser() {
        return typeUser;
    }

    public void setTypeUser(TypeUser typeUser) {
        this.typeUser = typeUser;
    }
    
    
}
