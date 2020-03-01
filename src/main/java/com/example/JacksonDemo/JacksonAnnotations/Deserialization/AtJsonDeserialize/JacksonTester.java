/**
 * 2.29 evening
 * https://www.tutorialspoint.com/jackson_annotations/jackson_annotations_jsondeserialize.htm
 */
package com.example.JacksonDemo.JacksonAnnotations.Deserialization.AtJsonDeserialize;

import java.io.IOException;
import java.text.ParseException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonTester {
    public static void main(String args[]) throws ParseException {
        ObjectMapper mapper = new ObjectMapper();
        String jsonString = "{\"name\":\"Mark\",\"dateOfBirth\":\"20-12-1984\"}";
        try {
            Student student = mapper.readerFor(Student.class).readValue(jsonString);
            System.out.println(student.dateOfBirth);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}