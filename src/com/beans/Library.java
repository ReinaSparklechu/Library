package com.beans;

import com.model.Book;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Library {
    Map<String, Compartment> compartments;

    public void addBook(Book b){
        if(compartments.containsKey(b.getCategory())) compartments.get(b.getCategory()).getBooks().add(b);
    }
}
