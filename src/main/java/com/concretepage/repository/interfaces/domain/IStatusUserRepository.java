/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.concretepage.repository.interfaces.domain;

import com.concretepage.dto.domain.StatusUserDto;
import com.concretepage.dto.domain.TypeUserDto;
import com.concretepage.framework.repository.IBaseRepository;

import java.util.List;

/**
 * @author fcortez
 */

public interface IStatusUserRepository extends IBaseRepository {
    /**
     * @return
     */
    public List<StatusUserDto> findAll();

    /**
     * @return
     */
    public StatusUserDto findByKey(int id);

    /**
     * @param dto
     */
    public void update(StatusUserDto dto);

    /**
     * @param dto
     */
    public void insert(StatusUserDto dto);

    /**
     * @param id
     */
    public void delete(int id);

}

