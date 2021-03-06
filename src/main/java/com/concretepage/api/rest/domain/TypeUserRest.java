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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author fcortez
 */
@RestController
@RequestMapping(value = "api/rest/type-user")
public class TypeUserRest extends BaseApiRest {
    @Autowired
    private ITypeUserService service;

    @GetMapping
    public ResponseEntity<GenericResponse> findAll() {
        return this.service.findAll();
    }

    @GetMapping(value = "/find")
    public ResponseEntity<GenericResponse> findByKey(int id) {
        return this.service.findByKey(id);
    }

    @PutMapping
    public ResponseEntity<GenericResponse> update(TypeUserDto dto) {
        return this.service.update(dto);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<GenericResponse> insert(@RequestBody TypeUserDto dto) {
        return this.service.insert(dto);
    }
    @DeleteMapping
    public ResponseEntity<GenericResponse> delete(int id) {
        return this.service.delete(id);
    }

}
