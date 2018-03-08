/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.concretepage.framework.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author fcortez
 */
@Repository
@Transactional
@EnableAutoConfiguration
public class BaseRepository implements IBaseRepository{
    
    @Autowired
    protected JdbcTemplate jdbcTemplate;
    
    /**
     * 
     * @param pojo maping export
     * @param sp name sp
     * @return  list pojo class
     */
    public List<? extends Object> executeList( Class pojo , String sp ){
        SimpleJdbcCall call = new SimpleJdbcCall(this.jdbcTemplate)
                .withProcedureName(sp)
                .returningResultSet("data", new BeanPropertyRowMapper<>(pojo));
        Map m = call.execute(new HashMap<>(0));
        return (List<Object>) m.get("data");
    }
    
    /**
     * 
     * @param pojo maping export
     * @param sp name sp
     * @param param parameters
     * @return list pojo class
     */
    public List<? extends Object> executeList( Class pojo , String sp , HashMap<String, Object> param ){
        SimpleJdbcCall call = new SimpleJdbcCall(this.jdbcTemplate)
                .withProcedureName(sp)
                .returningResultSet("data", new BeanPropertyRowMapper<>(pojo)); 
        return (List<Object>) call.execute(param).get("data");
    }
    
    /**
     * 
     * @param sp 
     */
    public void execute(String sp){
        SimpleJdbcCall call = new SimpleJdbcCall(this.jdbcTemplate)
                .withProcedureName(sp);
        call.execute(new HashMap<>());
    }
    
    /**
     * 
     * @param sp 
     * @param param 
     */
    public void execute(String sp ,  HashMap<String, Object> param){
        SimpleJdbcCall call = new SimpleJdbcCall(this.jdbcTemplate)
                .withProcedureName(sp);
        call.execute(param);
    }
}
