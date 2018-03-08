/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.concretepage.framework.service;

import com.concretepage.framework.dto.GenericResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 *
 * @author fcortez
 */
public class BaseResponseService {
    /**
     * @param response
     * @return
     */
    private GenericResponse responseOk(GenericResponse response) {
        if (response.title == null)
            response.title = "Exito";
        if (response.data == null)
            response.data = "Operacion realizada con exito";
        response.http = HttpStatus.OK;
        return response;
    }

    /**
     * @param response
     * @return
     */
    private GenericResponse responseError(GenericResponse response) {
        if (response.title == null)
            response.title = "Error";
        if (response.data == null)
            response.data = "Hubo un error al realizar la operacion";
        response.http = HttpStatus.BAD_REQUEST;
        return response;
    }

    /**
     * @param response
     * @return
     */
    private GenericResponse responseWarning(GenericResponse response) {
        if (response.title == null)
            response.title = "Advertencia";
        if (response.data == null)
            response.data = "Existen advertencias en la operacion";
        response.http = HttpStatus.CONFLICT;
        return response;
    }

    /**
     * @param title
     * @return
     */
    public ResponseEntity<GenericResponse> ok(String title) {
        GenericResponse response = new GenericResponse();
        response.title = title;
        return new ResponseEntity<>(responseOk(response), responseOk(response).http);
    }

    /**
     * @param title
     * @param data
     * @return
     */
    public ResponseEntity<GenericResponse> ok(String title, Object data) {
        GenericResponse response = new GenericResponse();
        response.title = title;
        response.data = data;
        return new ResponseEntity<>(responseOk(response), responseOk(response).http);
    }

    /**
     * @param data
     * @return
     */
    public ResponseEntity<GenericResponse> ok(Object data) {
        GenericResponse response = new GenericResponse();
        response.data = data;
        return new ResponseEntity<>(responseOk(response), responseOk(response).http);
    }

    /**
     * @return
     */
    public ResponseEntity<GenericResponse> ok() {
        GenericResponse response = new GenericResponse();
        return new ResponseEntity<>(responseOk(response), responseOk(response).http);
    }

    /**
     * @param title
     * @param data
     * @return
     */
    public ResponseEntity<GenericResponse> error(String title, Object data) {
        GenericResponse response = new GenericResponse();
        response.title = title;
        response.data = data;
        return new ResponseEntity<>(responseError(response), responseError(response).http);
    }

    /**
     * @param title
     * @return
     */
    public ResponseEntity<GenericResponse> error(String title) {
        GenericResponse response = new GenericResponse();
        response.title = title;
        return new ResponseEntity<>(responseError(response), responseError(response).http);
    }

    /**
     * @param data
     * @return
     */
    public ResponseEntity<GenericResponse> error(Object data) {
        GenericResponse response = new GenericResponse();
        response.data = data;
        return new ResponseEntity<>(responseError(response), responseError(response).http);
    }

    /**
     * @return
     */
    public ResponseEntity<GenericResponse> error() {
        GenericResponse response = new GenericResponse();
        return new ResponseEntity<>(responseError(response), responseError(response).http);
    }

    /**
     * @param title
     * @param data
     * @return
     */
    public ResponseEntity<GenericResponse> warning(String title, Object data) {
        GenericResponse response = new GenericResponse();
        response.title = title;
        response.data = data;
        return new ResponseEntity<>(responseWarning(response), responseWarning(response).http);
    }

    /**
     * @param title
     * @return
     */
    public ResponseEntity<GenericResponse> warning(String title) {
        GenericResponse response = new GenericResponse();
        response.title = title;
        return new ResponseEntity<>(responseWarning(response), responseWarning(response).http);
    }

    /**
     * @param data
     * @return
     */
    public ResponseEntity<GenericResponse> warning(Object data) {
        GenericResponse response = new GenericResponse();
        response.data = data;
        return new ResponseEntity<>(responseWarning(response), responseWarning(response).http);
    }

    /**
     * @return
     */
    public ResponseEntity<GenericResponse> warning() {
        GenericResponse response = new GenericResponse();
        return new ResponseEntity<>(responseWarning(response), responseWarning(response).http);
    }

    /**
     * @param title
     * @param data
     * @param http
     * @return
     */
    public ResponseEntity<GenericResponse> customResponse(String title, Object data, HttpStatus http) {
        GenericResponse response = new GenericResponse();
        response.title = title;
        response.data = data;
        response.http = http;
        return new ResponseEntity<>(response, response.http);
    }

    /**
     * @param ex
     * @return
     */
    public ResponseEntity<GenericResponse> customException(Exception ex) {
        GenericResponse response = new GenericResponse();
        response.title = "Error inesperado";
        response.data = ex.getMessage();
        response.http = HttpStatus.BAD_REQUEST;
        response.trace = ex.getStackTrace();
        return new ResponseEntity<>(response, response.http);

    }

}
