package com.Exercises.library.repository;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {
    public List<String>  getAllbooks() {
        List<String> books = new ArrayList<>();
        books.add("Clean Code");
        books.add("Effective Java");
        books.add("Spring in Action");
        return books;
    }
}
