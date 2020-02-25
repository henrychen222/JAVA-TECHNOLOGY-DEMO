/**
 * 2.24 evening
 * https://www.tutorialspoint.com/boon/boon_string_date.htm
 */
package com.example.BoonGsonSimpleJSON.BoonUtils.dateHandling;

import com.example.BoonGsonSimpleJSON.model.Student2;
import org.boon.json.JsonFactory;
import org.boon.json.ObjectMapper;

public class StringToDate {
    public static void main(String args[]) {
        ObjectMapper mapper = JsonFactory.create();
        String jsonString = "{\"name\":\"Mahesh\", \"age\":21, \"dateOfBirth\":\"1998-08-11T11:31:00.034Z\" }";

        //mapper converts String to date automatically
        Student2 student = mapper.readValue(jsonString, Student2.class);
        System.out.println(student.dateOfBirth);

        //by default mapper converts date to long
        jsonString = mapper.writeValueAsString(student);
        System.out.println(jsonString);
    }
}
