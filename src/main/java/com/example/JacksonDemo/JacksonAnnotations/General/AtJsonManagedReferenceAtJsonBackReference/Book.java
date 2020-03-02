/**
 * 3.1 evening
 * https://www.tutorialspoint.com/jackson_annotations/jackson_annotations_jsonmanagedreference.htm
 * https://www.tutorialspoint.com/jackson_annotations/jackson_annotations_jsonbackreference.htm
 */
package com.example.JacksonDemo.JacksonAnnotations.General.AtJsonManagedReferenceAtJsonBackReference;

import com.fasterxml.jackson.annotation.JsonManagedReference;

class Book {
    public int id;
    public String name;

    Book(int id, String name, Student owner) {
        this.id = id;
        this.name = name;
        this.owner = owner;
    }

    @JsonManagedReference
    public Student owner;
}