/**
 * 3.1 evening
 * https://www.tutorialspoint.com/jackson_annotations/jackson_annotations_mixin.htm
 */
package com.example.JacksonDemo.JacksonAnnotations.Miscellaneous.Mixin;

import java.io.IOException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonTester {
    public static void main(String args[]) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            Student student = new Student(1, 11, "1ab", "Mark");
            String jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(student);
            System.out.println(jsonString);

            ObjectMapper mapper1 = new ObjectMapper();

            // Mixin Annotation is a way to associate annotations without modifying the
            // target class
            mapper1.addMixIn(Name.class, MixInForIgnoreType.class);
            jsonString = mapper1.writerWithDefaultPrettyPrinter().writeValueAsString(student);
            System.out.println(jsonString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}