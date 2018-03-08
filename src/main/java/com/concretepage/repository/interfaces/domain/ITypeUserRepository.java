/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.concretepage.repository.interfaces.domain;

import com.concretepage.dto.domain.TypeUserDto;
import com.concretepage.framework.repository.IBaseRepository;
import java.util.List;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author fcortez
 */

public interface ITypeUserRepository extends IBaseRepository {
    /**
     * 
     * @return 
     */
    public List<TypeUserDto> findAll();
}
