/**
 * 2.29 evening
 * https://www.tutorialspoint.com/jackson_annotations/jackson_annotations_jacksoninject.htm
 */
package com.example.JacksonDemo.JacksonAnnotations.Deserialization.AtJacksonInject;

import com.fasterxml.jackson.annotation.JacksonInject;

class Student {
    public String name;

    // used when a property value is to be injected instead of being parsed from Json input
    @JacksonInject
    public int rollNo;
}