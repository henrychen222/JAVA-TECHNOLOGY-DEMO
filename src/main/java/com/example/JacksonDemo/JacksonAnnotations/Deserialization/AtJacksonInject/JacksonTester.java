/**
 * 2.29 evening
 * https://www.tutorialspoint.com/jackson_annotations/jackson_annotations_jacksoninject.htm
 */
package com.example.JacksonDemo.JacksonAnnotations.Deserialization.AtJacksonInject;

import java.io.IOException;
import java.text.ParseException;

import com.fasterxml.jackson.databind.InjectableValues;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonTester {
    public static void main(String args[]) throws ParseException {
        String json = "{\"name\":\"Mark\"}";
        InjectableValues injectableValues = new InjectableValues.Std().addValue(int.class, 1);

        ObjectMapper mapper = new ObjectMapper();
        try {
            Student student = mapper.reader(injectableValues).forType(Student.class).readValue(json);
            System.out.println(student.rollNo + ", " + student.name);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}