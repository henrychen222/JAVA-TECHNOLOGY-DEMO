/**
 * 2.27 morning
 * https://www.tutorialspoint.com/jackson_annotations/jackson_annotations_jsonserialize.htm
 */
package com.example.JacksonDemo.JacksonAnnotations.Serialization.AtJsonSerialize;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonTester {
    public static void main(String args[]) throws ParseException {
        ObjectMapper mapper = new ObjectMapper();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        try {
            Student student = new Student("Mark", 1, dateFormat.parse("20-11-1984"));
            String jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(student);
            System.out.println(jsonString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}