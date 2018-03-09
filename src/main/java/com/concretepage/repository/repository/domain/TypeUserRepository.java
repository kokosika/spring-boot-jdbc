/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.concretepage.repository.repository.domain;

import com.concretepage.dto.domain.TypeUserDto;
import com.concretepage.framework.repository.BaseRepository;
import com.concretepage.repository.interfaces.domain.ITypeUserRepository;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;

/**
 * @author fcortez
 */
@EnableAutoConfiguration
@Repository
@Transactional
public class TypeUserRepository extends BaseRepository implements ITypeUserRepository {

    /**
     * @return
     */
    @Override
    public List<TypeUserDto> findAll() {
        return (List<TypeUserDto>) executeList(TypeUserDto.class, "PKG_TYPE_USER", "PRC_GET_TYPE_USER");
    }

    /**
     * @return
     */
    @Override
    public TypeUserDto findByKey(int id) {
        HashMap<String, Object> param = new HashMap<>();
        param.put("ID_", id);
        return (TypeUserDto) executeList(TypeUserDto.class, "PKG_TYPE_USER", "PRC_GET_FIND_BY_KEY", param).get(0);
    }

    /**
     * @param dto
     */
    @Override
    public void update(TypeUserDto dto) {
        HashMap<String, Object> param = new HashMap<>();
        param.put("ID_", dto.getId());
        param.put("NAME_", dto.getName());
        param.put("DESCRIPTION_", dto.getDescription());
        execute("PKG_TYPE_USER", "PRC_SET_TYPE_USER", param);
    }

    /**
     * @param dto
     */
    @Override
    public void insert(TypeUserDto dto) {
        HashMap<String, Object> param = new HashMap<>();
        param.put("NAME_", dto.getName());
        param.put("DESCRIPTION_", dto.getDescription());
        execute("PKG_TYPE_USER", "PRC_INS_TYPE_USER", param);
    }

    /**
     * @param id
     */
    @Override
    public void delete(int id) {
        HashMap<String, Object> param = new HashMap<>();
        param.put("ID_", id);
        execute("PKG_TYPE_USER", "PRC_DEL_TYPE_USER", param);
    }


}
