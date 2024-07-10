package com.mongo.reactive.book.app.exception;

public class BookNotFoundException extends RuntimeException {

    public BookNotFoundException(String id) {
        super("Book with id %s not found.".formatted(id));
    }
}
