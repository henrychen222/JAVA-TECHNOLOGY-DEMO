/**
 * 3.1 evening
 * https://www.tutorialspoint.com/jackson_annotations/jackson_annotations_disable.htm
 */
package com.example.JacksonDemo.JacksonAnnotations.Miscellaneous.Disable;

import java.io.IOException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonTester {
    public static void main(String args[]) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            Student student = new Student(1, 11, "1ab", "Mark");
            String jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(student);
            System.out.println(jsonString);

            ObjectMapper mapper1 = new ObjectMapper();

            // disable jackson annotations
            mapper1.disable(MapperFeature.USE_ANNOTATIONS);
            jsonString = mapper1.writerWithDefaultPrettyPrinter().writeValueAsString(student);
            System.out.println(jsonString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}