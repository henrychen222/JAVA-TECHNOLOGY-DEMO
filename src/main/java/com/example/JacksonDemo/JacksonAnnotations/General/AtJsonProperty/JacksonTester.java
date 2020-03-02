/**
 * 3.1 evening
 * https://www.tutorialspoint.com/jackson_annotations/jackson_annotations_jsonproperty.htm
 */
package com.example.JacksonDemo.JacksonAnnotations.General.AtJsonProperty;

import java.io.IOException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonTester {
    public static void main(String args[]) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String json = "{\"id\" : 1}";
        Student student = mapper.readerFor(Student.class).readValue(json);
        System.out.println(student.getTheId());
    }
}