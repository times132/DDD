package com.times132.ddd.common.application;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class CommonResponse<T> extends ResponseEntity<Object> {
    public CommonResponse(T body, HttpStatus status) {
        super(body, status);
    }
}
