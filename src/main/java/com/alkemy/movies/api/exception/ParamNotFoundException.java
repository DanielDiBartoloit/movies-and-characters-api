package com.alkemy.movies.api.exception;

public class ParamNotFoundException extends RuntimeException {
    public ParamNotFoundException(String error) {
        super(error);
    }
}
