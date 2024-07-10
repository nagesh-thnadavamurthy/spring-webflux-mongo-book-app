package com.mongo.reactive.book.app.controller;
import java.io.Serializable;
public record BookResponse(String id, String title, String author, Integer year) implements Serializable{
}
