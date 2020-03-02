/**
 * 3.1 evening
 * https://www.tutorialspoint.com/jackson_annotations/jackson_annotations_jsonfilter.htm
 */
package com.example.JacksonDemo.JacksonAnnotations.General.AtJsonFilter;

import com.fasterxml.jackson.annotation.JsonFilter;

// apply filter during serialization/de-serialization like which properties are to be used or not
@JsonFilter("nameFilter")
class Student {
    public int id;
    public int rollNo;
    public String name;

    Student(int id, int rollNo, String name) {
        this.id = id;
        this.rollNo = rollNo;
        this.name = name;
    }
}