package com.classexcersice4.classexcersice4.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.classexcersice4.classexcersice4.model.Book;

@RestController
public class BookController {
    @GetMapping("/format")
    public Book getFormat()
    {
        Date d=new Date();
        Book b=new Book("The Great Solider","Karthika",d);
        return b;
    }
}
