/**
 * 2.27 morning on road
 * https://www.tutorialspoint.com/jackson_annotations/jackson_annotations_jsonpropertyorder.htm
 */
package com.example.JacksonDemo.JacksonAnnotations.Serialization.AtJsonPropertyOrder;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

// allows a specific order to be preserved while serializing a JSON object
@JsonPropertyOrder({ "rollNo", "name" })
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
}