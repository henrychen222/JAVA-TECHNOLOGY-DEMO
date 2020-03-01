/**
 * 2.27 morning on road
 * https://www.tutorialspoint.com/jackson_annotations/jackson_annotations_jsongetter.htm
 */
package com.example.JacksonDemo.JacksonAnnotations.Serialization.AtJsonGetter;

import com.fasterxml.jackson.annotation.JsonGetter;

class Student {
    private String name;
    private int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    @JsonGetter // allows a specific method to be marked as getter method
    public String getStudentName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }
}