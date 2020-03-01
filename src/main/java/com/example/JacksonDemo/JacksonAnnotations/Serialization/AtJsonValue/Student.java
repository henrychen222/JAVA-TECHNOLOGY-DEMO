/**
 * 2.27 morning
 * https://www.tutorialspoint.com/jackson_annotations/jackson_annotations_jsonvalue.htm
 */
package com.example.JacksonDemo.JacksonAnnotations.Serialization.AtJsonValue;

import com.fasterxml.jackson.annotation.JsonValue;

class Student {
    private String name;
    private int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    @JsonValue // serialize an entire object using its single method
    public String toString() {
        return "{ name : " + name + " }";
    }
}