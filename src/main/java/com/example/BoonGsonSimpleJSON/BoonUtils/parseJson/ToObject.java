/**
 * 022420 evening
 * https://www.tutorialspoint.com/boon/boon_to_object.htm
 */
package com.example.BoonGsonSimpleJSON.BoonUtils.parseJson;

import com.example.BoonGsonSimpleJSON.model.Student;
import org.boon.json.JsonFactory;
import org.boon.json.ObjectMapper;

public class ToObject {
    public static void main(String args[]) {
        ObjectMapper mapper = JsonFactory.create();
        String jsonString = "{\"name\":\"Mahesh\", \"age\":21}";

        Student student = mapper.readValue(jsonString, Student.class);

        System.out.println(student);
    }
}
