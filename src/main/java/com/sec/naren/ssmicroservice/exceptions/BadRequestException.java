package com.sec.naren.ssmicroservice.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.util.Collections;
import java.util.List;

@Data
@Setter
@Getter
public class BadRequestException extends RuntimeException {

    private HttpStatus status;
    private String message;
    private List<String> errors;

    public BadRequestException(HttpStatus status, String message, String error) {
        super();
        this.status = status;
        this.message = message;
        errors = Collections.singletonList(error);
    }

    public BadRequestException(){
        super();
    }

    public BadRequestException(String message) {
        super();
        this.status = status;
    }

}