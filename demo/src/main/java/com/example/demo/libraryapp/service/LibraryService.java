package com.example.demo.libraryapp.service;
import com.example.demo.libraryapp.model.Book;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Service
public class LibraryService {
    private Map<String, Book> books = new HashMap<>();

    public void addBook(Book book) {
        books.put(book.getId(), book);
    }

    public Book getBook(String isbn) {
        return books.get(isbn);
    }
}