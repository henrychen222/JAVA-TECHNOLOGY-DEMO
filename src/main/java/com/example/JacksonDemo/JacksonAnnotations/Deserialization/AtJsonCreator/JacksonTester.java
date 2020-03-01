/**
 * 2.29 evening
 * https://www.tutorialspoint.com/jackson_annotations/jackson_annotations_jsoncreator.htm
 */
package com.example.JacksonDemo.JacksonAnnotations.Deserialization.AtJsonCreator;

import java.io.IOException;
import java.text.ParseException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonTester {
    public static void main(String args[]) throws ParseException {
        String json = "{\"id\":1,\"theName\":\"Mark\"}";
        ObjectMapper mapper = new ObjectMapper();
        try {
            Student student = mapper.readerFor(Student.class).readValue(json);
            System.out.println(student.rollNo + ", " + student.name);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}