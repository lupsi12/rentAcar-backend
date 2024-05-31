package com.example.rentAcar.core.utilities.exceptions;

import org.hibernate.mapping.Table;

public class BusinessException extends RuntimeException {
    public BusinessException(String message) {
        super(message);
    }
}
