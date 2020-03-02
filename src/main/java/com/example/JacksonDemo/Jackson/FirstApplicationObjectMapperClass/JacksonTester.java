/**
 * 3.2 morning on road
 * https://www.tutorialspoint.com/jackson/jackson_first_application.htm
 * https://www.tutorialspoint.com/jackson/jackson_objectmapper.htm
 */
package com.example.JacksonDemo.Jackson.FirstApplicationObjectMapperClass;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonTester {
    public static void main(String args[]) {

        ObjectMapper mapper = new ObjectMapper();
        String jsonString = "{\"name\":\"Mahesh\", \"age\":21}";

        // map json to student
        try {

            // DeSerialize JSON to Object/model
            Student student = mapper.readValue(jsonString, Student.class);
            System.out.println(student);

            // Serialize Object/model to JSON
            jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(student);
            System.out.println(jsonString);
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}