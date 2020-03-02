/**
 * 3.1 evening
 * https://www.tutorialspoint.com/jackson_annotations/jackson_annotations_custom.htm
 */
package com.example.JacksonDemo.JacksonAnnotations.Miscellaneous.Custom;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import com.fasterxml.jackson.annotation.JacksonAnnotationsInside;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@CustomAnnotation
class Student {
    public int id;
    public int rollNo;
    public String name;
    public String otherDetails;

    Student(int id, int rollNo, String name) {
        this.id = id;
        this.rollNo = rollNo;
        this.name = name;
    }
}

@Retention(RetentionPolicy.RUNTIME)
@JacksonAnnotationsInside
@JsonInclude(value = Include.NON_NULL)
@JsonPropertyOrder({ "rollNo", "id", "name" })
@interface CustomAnnotation {
}