package com.mongo.reactive.book.app.repository;

import com.mongo.reactive.book.app.model.Book;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface BookRepository extends ReactiveMongoRepository<Book, String> {
}
