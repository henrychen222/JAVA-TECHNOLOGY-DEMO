/**
 * 2.29 evening
 * https://www.tutorialspoint.com/jackson_annotations/jackson_annotations_jsonanysetter.htm
 */
package com.example.JacksonDemo.JacksonAnnotations.Deserialization.AtJsonAnySetter;

import java.io.IOException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonTester {
    public static void main(String args[]) {
        ObjectMapper mapper = new ObjectMapper();
        String jsonString = "{\"RollNo\" : \"1\",\"Name\" : \"Mark\"}";
        try {
            Student student = mapper.readerFor(Student.class).readValue(jsonString);
            System.out.println(student.getProperties().get("Name"));
            System.out.println(student.getProperties().get("RollNo"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}