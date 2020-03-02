/**
 * 3.1 evening
 * https://www.tutorialspoint.com/jackson_annotations/jackson_annotations_disable.htm
 */
package com.example.JacksonDemo.JacksonAnnotations.Miscellaneous.Disable;

import com.fasterxml.jackson.annotation.JsonIgnoreType;

@JsonIgnoreType
class Name {
    public String name;

    Name(String name) {
        this.name = name;
    }
}