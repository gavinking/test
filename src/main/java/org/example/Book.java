package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
class Book {

    @Id
    String isbn;

    String title;


    Book() {}
    Book(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }
}