/**
 * 2.26 evening on road
 * https://www.tutorialspoint.com/jackson_annotations/jackson_annotations_jsonanygetter.htm
 */

package com.example.JacksonDemo.JacksonAnnotations.Serialization.AtJsonAnyGetter;

import java.io.IOException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonTester {
    public static void main(String args[]) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            Student student = new Student();
            student.add("Name", "Mark");
            student.add("RollNo", "1");
            String jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(student);
            System.out.println(jsonString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}