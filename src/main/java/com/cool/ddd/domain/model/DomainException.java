package com.cool.ddd.domain.model;

class DomainException extends RuntimeException {
    DomainException(final String message) {
        super(message);
    }
}
