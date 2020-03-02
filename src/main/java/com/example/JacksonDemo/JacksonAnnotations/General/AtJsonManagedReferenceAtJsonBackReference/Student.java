/**
 * 3.1 evening
 * https://www.tutorialspoint.com/jackson_annotations/jackson_annotations_jsonmanagedreference.htm
 * https://www.tutorialspoint.com/jackson_annotations/jackson_annotations_jsonbackreference.htm
 */
package com.example.JacksonDemo.JacksonAnnotations.General.AtJsonManagedReferenceAtJsonBackReference;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

class Student {
    public int rollNo;
    public String name;

    @JsonBackReference
    public List<Book> books;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
        this.books = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        books.add(book);
    }
}