/**
 * 2.27 morning on road
 * https://www.tutorialspoint.com/jackson_annotations/jackson_annotations_jsongetter.htm
 */

package com.example.JacksonDemo.JacksonAnnotations.Serialization.AtJsonGetter;

import java.io.IOException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonTester {
    public static void main(String args[]) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            Student student = new Student("Mark", 1);
            String jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(student);
            System.out.println(jsonString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}