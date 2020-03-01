/**
 * 2.27 morning on road
 * https://www.tutorialspoint.com/jackson_annotations/jackson_annotations_jsonrawvalue.htm
 */
package com.example.JacksonDemo.JacksonAnnotations.Serialization.AtJsonRawValue;

import com.fasterxml.jackson.annotation.JsonRawValue;

class Student {
    private String name;

    private int rollNo;

    // serialize a text without escaping or without any decoration
    @JsonRawValue
    private String json;

    public Student(String name, int rollNo, String json) {
        this.name = name;
        this.rollNo = rollNo;
        this.json = json;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getJson() {
        return json;
    }
}