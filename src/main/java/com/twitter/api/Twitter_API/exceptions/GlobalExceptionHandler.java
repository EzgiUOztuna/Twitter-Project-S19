/*
package com.twitter.api.Twitter_API.exceptions;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import java.time.LocalDateTime;

@ControllerAdvice
public class GlobalExceptionHandler {
    private static final Logger log = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler
    public ResponseEntity<ExceptionResponse> handleException(ApiException apiException){
        log.error("apiexception occurred", apiException);
        ExceptionResponse errorResponse = new ExceptionResponse(apiException.getMessage(),
                apiException.getHttpStatus().value(),
                LocalDateTime.now());
        return new ResponseEntity<>(errorResponse, apiException.getHttpStatus());
    }


    @ExceptionHandler
    public ResponseEntity<ExceptionResponse> handleException(Exception exception){
        log.error("apiexception occurred",exception);
        ExceptionResponse errorResponse = new ExceptionResponse(exception.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR.value(), LocalDateTime.now());
        return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}


*/