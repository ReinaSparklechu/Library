package com.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    private String ISBN;
    private String title;
    private String category;
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;

        Book book = (Book) o;

        return getISBN().equals(book.getISBN());
    }

    @Override
    public int hashCode() {
        return getISBN().hashCode();
    }
}
