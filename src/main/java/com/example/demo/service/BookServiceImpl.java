package com.example.demo.service;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepositoryImpl;
import java.util.List;

public class BookServiceImpl implements BookService {

    private final BookRepositoryImpl bookRepository;

    public BookServiceImpl(BookRepositoryImpl bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Book save(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }
}
