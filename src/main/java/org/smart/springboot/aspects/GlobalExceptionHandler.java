package org.smart.springboot.aspects;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(IllegalStateException.class)
    public ResponseEntity<?> errorHandler(IllegalStateException stateException) {
        return ResponseEntity.badRequest().body(stateException.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> errorHandler(Exception stateException) {
        return ResponseEntity.badRequest().body(stateException.getMessage());
    }
}
