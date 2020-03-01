/**
 * 2.29 evening
 * https://www.tutorialspoint.com/jackson_annotations/jackson_annotations_jsoninclude.htm
 */
package com.example.JacksonDemo.JacksonAnnotations.PropertyInclusion.AtJsonInclude;

import com.fasterxml.jackson.annotation.JsonInclude;

// used at exclude properties having null/empty or default values.
@JsonInclude(JsonInclude.Include.NON_NULL)
class Student {
    public int id;
    public String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}