/**
 * 2.29 evening
 * https://www.tutorialspoint.com/jackson_annotations/jackson_annotations_jsoncreator.htm
 */
package com.example.JacksonDemo.JacksonAnnotations.Deserialization.AtJsonCreator;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

class Student {
    public String name;
    public int rollNo;

    @JsonCreator // fine tune the constructor or factory method used in deserialization
    public Student(@JsonProperty("theName") String name, @JsonProperty("id") int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
}