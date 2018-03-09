/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.concretepage.service.interfaces.domain;

import com.concretepage.dto.domain.StatusUserDto;
import com.concretepage.framework.dto.GenericResponse;
import com.concretepage.framework.service.IBaseService;
import org.springframework.http.ResponseEntity;

/**
 * @author fcortez
 */
public interface IStatusUserService extends IBaseService {
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
    public ResponseEntity<GenericResponse> update(StatusUserDto dto);

    /**
     * @param dto
     * @return
     */
    public ResponseEntity<GenericResponse> insert(StatusUserDto dto);

    /**
     * @param id
     * @return
     */
    public ResponseEntity<GenericResponse> delete(int id);
}
