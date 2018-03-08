/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.concretepage.repository.repository.domain;

import com.concretepage.dto.domain.TypeUserDto;
import com.concretepage.framework.repository.BaseRepository;
import com.concretepage.repository.interfaces.domain.ITypeUserRepository;
import java.util.HashMap;
import java.util.List;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author fcortez
 */
@EnableAutoConfiguration
@Repository
@Transactional
public class TypeUserRepository extends BaseRepository implements ITypeUserRepository{

    /**
     * 
     * @return 
     */
    @Override
    public List<TypeUserDto> findAll(){
        return (List<TypeUserDto>) executeList(TypeUserDto.class,"PRC_GET_TYPE_USER");
    }
    
    public void update(TypeUserDto dto){    
        HashMap<String,Object> param = new HashMap<>();
        param.put("ID", dto.getId());
        param.put("NAME", dto.getName());
        param.put("DESCRIPTION", dto.getDescription());
        execute("PRC_SET_TYPE_USER");        
    }
    
}
