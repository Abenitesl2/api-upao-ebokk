package com.upao.controller;

import com.upao.domain.Book;
import com.upao.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private  final BookService bookService;


    public BookController(BookService bookService){
        this.bookService = bookService;

    }
    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks(){
        return new ResponseEntity<List<Book>>(bookService.getAllBooks(),HttpStatus.OK);
        
        //Optional: return ResponseEntity.ok(bookService.getAllBooks())

    }

    @PostMapping
    public ResponseEntity<Book> addBook(@RequestBody Book book){

        return new ResponseEntity<Book>(bookService.createBook(book),HttpStatus.CREATED);


    }


}
