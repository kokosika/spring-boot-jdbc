/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.concretepage.framework.dto;

import java.io.Serializable;
import org.springframework.http.HttpStatus;

/**
 *
 * @author fcortez
 */
public class GenericResponse implements Serializable{
    
    public String title;
    public Object data;
    public HttpStatus http;
    public Object trace;
    
}
