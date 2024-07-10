package com.mongo.reactive.book.app.mapper;

import com.mongo.reactive.book.app.controller.BookResponse;
import com.mongo.reactive.book.app.controller.CreateBookRequest;
import com.mongo.reactive.book.app.controller.UpdateBookRequest;
import com.mongo.reactive.book.app.model.Book;
import org.springframework.stereotype.Service;

@Service
public class BookMapperImpl implements BookMapper {

    @Override
    public Book toBook(CreateBookRequest createBookRequest) {
        if (createBookRequest == null) {
            return null;
        }
        Book book = new Book();
        book.setTitle(createBookRequest.title());
        book.setAuthor(createBookRequest.author());
        book.setYear(createBookRequest.year());
        return book;
    }

    @Override
    public void updateBookFromUpdateBookRequest(UpdateBookRequest updateBookRequest, Book book) {
        if (updateBookRequest == null) {
            return;
        }
        if (updateBookRequest.title() != null) {
            book.setTitle(updateBookRequest.title());
        }
        if (updateBookRequest.author() != null) {
            book.setAuthor(updateBookRequest.author());
        }
        if (updateBookRequest.year() != null) {
            book.setYear(updateBookRequest.year());
        }
    }

    @Override
    public BookResponse toBookResponse(Book book) {
        if (book == null) {
            return null;
        }
        return new BookResponse(book.getId(), book.getTitle(), book.getAuthor(), book.getYear());
    }
}