/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.concretepage.api.rest.domain;

import com.concretepage.dto.domain.TypeUserDto;
import com.concretepage.framework.api.BaseApiRest;
import com.concretepage.framework.dto.GenericResponse;
import com.concretepage.service.interfaces.domain.ITypeUserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author fcortez
 */
@RestController
@RequestMapping(value = "api/rest/type-user")
public class TypeUserRest extends BaseApiRest{
    @Autowired
    private ITypeUserService service;
    
    @GetMapping
    public ResponseEntity<GenericResponse> findAll(){
        return this.service.findAll();
    }
    
}
