/**
 * 3.1 evening
 * https://www.tutorialspoint.com/jackson_annotations/jackson_annotations_jsonunwrapped.htm
 */
package com.example.JacksonDemo.JacksonAnnotations.General.AtJsonUnwrapped;

import com.fasterxml.jackson.annotation.JsonUnwrapped;

class Student {
    public int id;

    @JsonUnwrapped // unwrap values of objects during serialization or de-serialization
    public Name name;

    Student(int id, Name name) {
        this.id = id;
        this.name = name;
    }

    static class Name {
        public String first;
        public String last;
    }
}