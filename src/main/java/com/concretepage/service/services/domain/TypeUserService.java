/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.concretepage.service.services.domain;

import com.concretepage.dto.domain.TypeUserDto;
import com.concretepage.framework.dto.GenericResponse;
import com.concretepage.framework.service.BaseService;
import com.concretepage.repository.interfaces.domain.ITypeUserRepository;
import com.concretepage.service.interfaces.domain.ITypeUserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

/**
 *
 * @author fcortez
 */
@Service
public class TypeUserService extends BaseService implements ITypeUserService{
    
    @Autowired
    private ITypeUserRepository repo;
    /**
     * 
     * @return 
     */
    @Override
    public ResponseEntity<GenericResponse> findAll(){
        try {
            return ok("ok", this.repo.findAll());
        } catch (Exception e) {
            return customException(e);
        }
    }
    
}
