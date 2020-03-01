/**
 * 2.27 morning
 * https://www.tutorialspoint.com/jackson_annotations/jackson_annotations_jsonserialize.htm
 */
package com.example.JacksonDemo.JacksonAnnotations.Serialization.AtJsonSerialize;

import java.util.Date;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

class Student {
    private String name;
    private int rollNo;

    @JsonSerialize(using = CustomDateSerializer.class) // specify custom serializer to marshall the json object
    private Date dateOfBirth;

    public Student(String name, int rollNo, Date dob) {
        this.name = name;
        this.rollNo = rollNo;
        this.dateOfBirth = dob;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }
}