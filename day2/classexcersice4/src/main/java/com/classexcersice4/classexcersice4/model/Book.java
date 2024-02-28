package com.classexcersice4.classexcersice4.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Book {
    private String title;
    private String author;

    @JsonFormat(pattern = "yyyy/dd/MM",timezone = "UTC")
    private Date publicationDate;

    public Book(String title, String author, Date publicationDate) {
        this.title = title;
        this.author = author;
        this.publicationDate = publicationDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

}
