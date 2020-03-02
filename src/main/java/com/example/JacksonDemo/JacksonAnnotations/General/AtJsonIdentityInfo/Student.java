/**
 * 3.1 evening
 * https://www.tutorialspoint.com/jackson_annotations/jackson_annotations_jsonidentityinfo.htm
 */
package com.example.JacksonDemo.JacksonAnnotations.General.AtJsonIdentityInfo;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

// used when objects have parent child relationship
// used to indicate that object identity will be used during serialization/de-serialization
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
class Student {
    public int id;
    public int rollNo;
    public String name;
    public List<Book> books;

    Student(int id, int rollNo, String name) {
        this.id = id;
        this.rollNo = rollNo;
        this.name = name;
        this.books = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        books.add(book);
    }
}