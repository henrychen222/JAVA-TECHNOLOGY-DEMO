/**
 * 3.1 evening
 * https://www.tutorialspoint.com/jackson_annotations/jackson_annotations_jsonview.htm
 */
package com.example.JacksonDemo.JacksonAnnotations.General.AtJsonView;

import com.fasterxml.jackson.annotation.JsonView;

class Student {
    @JsonView(Views.Public.class) // control values to be serialized or not
    public int id;

    @JsonView(Views.Public.class)
    public String name;

    @JsonView(Views.Internal.class)
    public int age;

    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}