package com.mongo.reactive.book.app.controller;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
public record CreateBookRequest( @NotBlank String title,
                                 @NotBlank String author,
                                 @Positive Integer year) {
}
