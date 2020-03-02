/**
 * 3.1 evening
 * https://www.tutorialspoint.com/jackson_annotations/jackson_annotations_jsonmanagedreference.htm
 * https://www.tutorialspoint.com/jackson_annotations/jackson_annotations_jsonbackreference.htm
 */
package com.example.JacksonDemo.JacksonAnnotations.General.AtJsonManagedReferenceAtJsonBackReference;

import java.io.IOException;
import java.text.ParseException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonTester {
    public static void main(String args[]) throws IOException, ParseException {
        ObjectMapper mapper = new ObjectMapper();
        Student student = new Student(1, "Mark");
        Book book1 = new Book(1, "Learn HTML", student);
        Book book2 = new Book(1, "Learn JAVA", student);

        student.addBook(book1);
        student.addBook(book2);

        String jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(book1);
        System.out.println(jsonString);
    }
}