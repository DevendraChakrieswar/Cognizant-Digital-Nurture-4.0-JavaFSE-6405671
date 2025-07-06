package com.Exercises.library.service;

import com.Exercises.library.repository.BookRepository;

import java.util.List;

public class BookService {
    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayBooks() {
        List<String> books = bookRepository.getAllbooks();
        System.out.println("Books in library");
        for(String book: books) {
            System.out.println("- " + book);
        }
    }

}
