/**
 * 3.1 evening
 * https://www.tutorialspoint.com/jackson_annotations/jackson_annotations_jsonfilter.htm
 */
package com.example.JacksonDemo.JacksonAnnotations.General.AtJsonFilter;

import java.io.IOException;
import java.text.ParseException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

public class JacksonTester {
    public static void main(String args[]) throws IOException, ParseException {
        ObjectMapper mapper = new ObjectMapper();
        Student student = new Student(1, 13, "Mark");

        FilterProvider filters = new SimpleFilterProvider().addFilter("nameFilter",
                SimpleBeanPropertyFilter.filterOutAllExcept("name"));

        String jsonString = mapper.writer(filters).withDefaultPrettyPrinter().writeValueAsString(student);
        System.out.println(jsonString);
    }
}