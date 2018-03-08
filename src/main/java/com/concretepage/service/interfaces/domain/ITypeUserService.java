/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.concretepage.service.interfaces.domain;

import com.concretepage.dto.domain.TypeUserDto;
import com.concretepage.framework.dto.GenericResponse;
import com.concretepage.framework.service.IBaseService;
import java.util.List;
import org.springframework.http.ResponseEntity;

/**
 *
 * @author fcortez
 */
public interface ITypeUserService extends IBaseService{
    /**
     * 
     * @return 
     */
    public ResponseEntity<GenericResponse> findAll();
}
