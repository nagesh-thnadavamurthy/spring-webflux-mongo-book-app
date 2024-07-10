package com.mongo.reactive.book.app.mapper;

import com.mongo.reactive.book.app.controller.BookResponse;
import com.mongo.reactive.book.app.controller.CreateBookRequest;
import com.mongo.reactive.book.app.controller.UpdateBookRequest;
import com.mongo.reactive.book.app.model.Book;

public interface BookMapper {
    Book toBook(CreateBookRequest createBookRequest);

    void updateBookFromUpdateBookRequest(UpdateBookRequest updateBookRequest, Book book);

    BookResponse toBookResponse(Book book);
}
