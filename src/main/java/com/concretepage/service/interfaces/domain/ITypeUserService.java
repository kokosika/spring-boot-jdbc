/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.concretepage.service.interfaces.domain;

import com.concretepage.dto.domain.TypeUserDto;
import com.concretepage.framework.dto.GenericResponse;
import com.concretepage.framework.service.IBaseService;
import org.springframework.http.ResponseEntity;

/**
 * @author fcortez
 */
public interface ITypeUserService extends IBaseService {
    /**
     * @return
     */
    public ResponseEntity<GenericResponse> findAll();

    /**
     * @param id
     * @return
     */
    public ResponseEntity<GenericResponse> findByKey(int id);

    /**
     * @param dto
     * @return
     */
    public ResponseEntity<GenericResponse> update(TypeUserDto dto);

    /**
     * @param dto
     * @return
     */
    public ResponseEntity<GenericResponse> insert(TypeUserDto dto);

    /**
     * @param id
     * @return
     */
    public ResponseEntity<GenericResponse> delete(int id);
}
