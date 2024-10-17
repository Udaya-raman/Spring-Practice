
package com.example.demo.libraryapp.controller;

import com.example.demo.libraryapp.model.Book;
import com.example.demo.libraryapp.service.LibraryService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/books")
public class BookController {

    private final LibraryService libraryService;

    public BookController(LibraryService libraryService) {
        this.libraryService = libraryService;
    }

    @PostMapping
    public void addBook(@RequestBody Book book) {
        libraryService.addBook(book);
    }

    @GetMapping("/{isbn}")
    public Book getBook(@PathVariable String isbn) {
        return libraryService.getBook(isbn);
    }
}