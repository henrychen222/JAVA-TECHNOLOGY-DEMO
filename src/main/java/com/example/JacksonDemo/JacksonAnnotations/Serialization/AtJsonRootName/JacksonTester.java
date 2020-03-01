/**
 * 2.27 morning
 * https://www.tutorialspoint.com/jackson_annotations/jackson_annotations_jsonrootname.htm
 */
package com.example.JacksonDemo.JacksonAnnotations.Serialization.AtJsonRootName;

import java.io.IOException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class JacksonTester {
    public static void main(String args[]) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            Student student = new Student("Mark", 1);
            mapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
            String jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(student);
            System.out.println(jsonString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}