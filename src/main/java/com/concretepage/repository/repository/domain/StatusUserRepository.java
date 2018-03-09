/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.concretepage.repository.repository.domain;

import com.concretepage.dto.domain.StatusUserDto;
import com.concretepage.framework.repository.BaseRepository;
import com.concretepage.repository.interfaces.domain.IStatusUserRepository;
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
public class StatusUserRepository extends BaseRepository implements IStatusUserRepository {

    /**
     * @return
     */
    @Override
    public List<StatusUserDto> findAll() {
        return (List<StatusUserDto>) executeList(StatusUserDto.class, "PKG_STATUS_USER", "PRC_GET_STATE_USER");
    }

    /**
     * @return
     */
    @Override
    public StatusUserDto findByKey(int id) {
        HashMap<String, Object> param = new HashMap<>();
        param.put("ID_", id);
        return (StatusUserDto) executeList(StatusUserDto.class, "PKG_STATUS_USER", "PRC_GET_FIND_BY_KEY", param).get(0);
    }

    /**
     * @param dto
     */
    @Override
    public void update(StatusUserDto dto) {
        HashMap<String, Object> param = new HashMap<>();
        param.put("ID_", dto.getId());
        param.put("NAME_", dto.getName());
        param.put("DESCRIPTION_", dto.getDescription());
        execute("PKG_STATUS_USER", "PRC_SET_STATUS_USER", param);
    }

    /**
     * @param dto
     */
    @Override
    public void insert(StatusUserDto dto) {
        HashMap<String, Object> param = new HashMap<>();
        param.put("NAME_", dto.getName());
        param.put("DESCRIPTION_", dto.getDescription());
        execute("PKG_STATUS_USER", "PRC_INS_STATUS_USER", param);
    }

    /**
     * @param id
     */
    @Override
    public void delete(int id) {
        HashMap<String, Object> param = new HashMap<>();
        param.put("ID_", id);
        execute("PKG_STATUS_USER", "PRC_DEL_STATUS_USER", param);
    }
}
