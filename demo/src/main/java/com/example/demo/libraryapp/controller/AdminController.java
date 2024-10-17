
package com.example.demo.libraryapp.controller;

import com.example.demo.libraryapp.model.Book;
import com.example.demo.libraryapp.service.BeanRetrievalService;
import com.example.demo.libraryapp.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/admin")
public class AdminController {

    private final BeanRetrievalService beanRetrievalService;

    @Autowired
    public AdminController(BeanRetrievalService beanRetrievalService) {
        this.beanRetrievalService = beanRetrievalService;
    }

    @PostMapping("/books")
    public void addBook(@RequestBody Book book) {
        LibraryService libraryService = beanRetrievalService.getBean(LibraryService.class);
        libraryService.addBook(book);
    }

    @GetMapping("/books/{isbn}")
    public Book getBook(@PathVariable String isbn) {
        LibraryService libraryService = beanRetrievalService.getBean(LibraryService.class);
        return libraryService.getBook(isbn);
    }
}