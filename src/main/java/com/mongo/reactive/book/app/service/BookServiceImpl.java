package com.mongo.reactive.book.app.service;

import com.mongo.reactive.book.app.exception.BookNotFoundException;
import com.mongo.reactive.book.app.model.Book;
import com.mongo.reactive.book.app.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    @Override
    public Flux<Book> getBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Mono<Book> validateAndGetBookById(String id) {
        return bookRepository.findById(id)
                .switchIfEmpty(Mono.error(new BookNotFoundException(id)));
    }

    @Override
    public Mono<Book> saveBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Mono<Void> deleteBook(Book book) {
        return bookRepository.delete(book);
    }
}
