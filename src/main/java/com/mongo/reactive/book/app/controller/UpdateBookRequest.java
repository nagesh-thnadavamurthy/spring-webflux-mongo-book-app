package com.mongo.reactive.book.app.controller;

public record UpdateBookRequest(String title, String author, Integer year   ) {
}
