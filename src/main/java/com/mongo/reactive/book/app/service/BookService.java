package com.mongo.reactive.book.app.service;

import com.mongo.reactive.book.app.model.Book;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface BookService {
    Flux<Book> getBooks();

    Mono<Book> validateAndGetBookById(String id);

    Mono<Book> saveBook(Book book);

    Mono<Void> deleteBook(Book book);
}
