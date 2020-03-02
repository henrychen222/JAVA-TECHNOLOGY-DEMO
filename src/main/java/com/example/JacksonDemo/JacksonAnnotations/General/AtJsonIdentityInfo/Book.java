/**
 * 3.1 evening
 * https://www.tutorialspoint.com/jackson_annotations/jackson_annotations_jsonidentityinfo.htm
 */
package com.example.JacksonDemo.JacksonAnnotations.General.AtJsonIdentityInfo;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

// used when objects have parent child relationship
// used to indicate that object identity will be used during serialization/de-serialization
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
class Book {
    public int id;
    public String name;

    Book(int id, String name, Student owner) {
        this.id = id;
        this.name = name;
        this.owner = owner;
    }

    public Student owner;
}