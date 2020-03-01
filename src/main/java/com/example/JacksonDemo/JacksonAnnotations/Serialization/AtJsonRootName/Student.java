/**
 * 2.27 morning
 * https://www.tutorialspoint.com/jackson_annotations/jackson_annotations_jsonrootname.htm
 */
package com.example.JacksonDemo.JacksonAnnotations.Serialization.AtJsonRootName;

import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "student") // specify a root node over JSON
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