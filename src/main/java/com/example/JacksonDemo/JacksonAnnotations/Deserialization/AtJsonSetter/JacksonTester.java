/**
 * 2.29 evening
 * https://www.tutorialspoint.com/jackson_annotations/jackson_annotations_jsonsetter.htm
 */
package com.example.JacksonDemo.JacksonAnnotations.Deserialization.AtJsonSetter;

import java.io.IOException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonTester {
    public static void main(String args[]) {
        ObjectMapper mapper = new ObjectMapper();
        String jsonString = "{\"rollNo\":1,\"name\":\"Marks\"}";

        try {
            Student student = mapper.readerFor(Student.class).readValue(jsonString);
            System.out.println(student.name);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}