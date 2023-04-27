package com.upao.service;

import com.upao.domain.Book;

import java.util.List;

public interface BookService {

    Book createBook(Book book);
    List<Book> getAllBooks();
}
