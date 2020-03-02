/**
 * 3.1 evening
 * https://www.tutorialspoint.com/jackson_annotations/jackson_annotations_jsonunwrapped.htm
 */
package com.example.JacksonDemo.JacksonAnnotations.General.AtJsonUnwrapped;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonTester {
    public static void main(String args[]) throws IOException, ParseException {
        ObjectMapper mapper = new ObjectMapper();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date date = simpleDateFormat.parse("20-12-1984");
        Student.Name name = new Student.Name();
        name.first = "Jane";
        name.last = "Doe";
        Student student = new Student(1, name);
        String jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(student);
        System.out.println(jsonString);
    }
}