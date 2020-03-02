/**
 * 3.1 evening
 * https://www.tutorialspoint.com/jackson_annotations/jackson_annotations_custom.htm
 */
package com.example.JacksonDemo.JacksonAnnotations.Miscellaneous.Custom;

import java.io.IOException;
import java.text.ParseException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonTester {
    public static void main(String args[]) throws IOException, ParseException {
        ObjectMapper mapper = new ObjectMapper();
        Student student = new Student(1, 13, "Mark");

        String jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(student);
        System.out.println(jsonString);
    }
}