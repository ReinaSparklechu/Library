package com.beans;

import com.model.Book;
import lombok.Data;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

@Data
public class Compartment {
    private String compartmentType;
    private Set<Book> books;
    public Compartment(String compartmentType){
        this.compartmentType = compartmentType;
        books = new TreeSet<>(Comparator.comparingInt(Book::hashCode));
    }
}
