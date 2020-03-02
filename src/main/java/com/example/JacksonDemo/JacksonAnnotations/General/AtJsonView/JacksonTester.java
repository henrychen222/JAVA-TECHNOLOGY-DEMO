/**
 * 3.1 evening
 * https://www.tutorialspoint.com/jackson_annotations/jackson_annotations_jsonview.htm
 */
package com.example.JacksonDemo.JacksonAnnotations.General.AtJsonView;

import java.io.IOException;
import java.text.ParseException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonTester {
    public static void main(String args[]) throws IOException, ParseException {
        ObjectMapper mapper = new ObjectMapper();
        Student student = new Student(1, "Mark", 12);
        String jsonString = mapper.writerWithDefaultPrettyPrinter().withView(Views.Public.class)
                .writeValueAsString(student);
        System.out.println(jsonString);
    }
}