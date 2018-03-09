/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.concretepage.repository.interfaces.domain;

import com.concretepage.dto.domain.TypeUserDto;
import com.concretepage.framework.repository.IBaseRepository;

import java.util.List;

/**
 * @author fcortez
 */

public interface ITypeUserRepository extends IBaseRepository {
    /**
     * @return
     */
    public List<TypeUserDto> findAll();

    /**
     * @return
     */
    public TypeUserDto findByKey(int id);

    /**
     * @param dto
     */
    public void update(TypeUserDto dto);

    /**
     * @param dto
     */
    public void insert(TypeUserDto dto);

    /**
     * @param id
     */
    public void delete(int id);

}

