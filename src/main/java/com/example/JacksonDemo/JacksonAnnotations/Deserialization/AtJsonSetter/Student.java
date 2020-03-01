/**
 * 2.29 evening
 * https://www.tutorialspoint.com/jackson_annotations/jackson_annotations_jsonsetter.htm
 */
package com.example.JacksonDemo.JacksonAnnotations.Deserialization.AtJsonSetter;

import com.fasterxml.jackson.annotation.JsonSetter;

class Student {
    public int rollNo;
    public String name;

    @JsonSetter("name") // allows a specific method to be marked as setter method
    public void setTheName(String name) {
        this.name = name;
    }
}