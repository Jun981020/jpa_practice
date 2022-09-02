package com.example.book_api.repostory;

import com.example.book_api.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class BookRepositoryTest {
    @Autowired
    private BookRepository bookRepository;

    @Test
    public void prePersistTest(){
        Book book = new Book();
        book.setName("book1");
        book.setAuthor("jun");
        bookRepository.save(book);
        System.out.println(bookRepository.findAll());
    }

    @Test
    public void test(){
        Book book1  = new Book();
        book1.setName("준형자서전");
        book1.setAuthor("준형");
        bookRepository.save(book1);
        System.out.println(bookRepository.findAll());
    }
    @Test
    public void baseTest(){
        Book book = new Book();
        book.setName("준형이");
        book.setAuthor("준형이책");
        bookRepository.save(book);
        System.out.println(bookRepository.findAll());
    }

}