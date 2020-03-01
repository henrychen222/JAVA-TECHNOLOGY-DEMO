/**
 * 2.29 evening
 * https://www.tutorialspoint.com/jackson_annotations/jackson_annotations_jsonautodetect.htm
 */
package com.example.JacksonDemo.JacksonAnnotations.PropertyInclusion.AtJsonAutoDetect;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

// include properties which are not accessible otherwise
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
class Student {
    private int id;
    private String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}