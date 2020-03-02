/**
 * 3.1 evening
 * https://www.tutorialspoint.com/jackson_annotations/jackson_annotations_jsonproperty.htm
 */
package com.example.JacksonDemo.JacksonAnnotations.General.AtJsonProperty;

import com.fasterxml.jackson.annotation.JsonProperty;

class Student {
    private int id;

    Student() {
    }

    Student(int id) {
        this.id = id;
    }

    @JsonProperty("id")
    public int getTheId() {
        return id;
    }

    @JsonProperty("id")
    public void setTheId(int id) {
        this.id = id;
    }
}