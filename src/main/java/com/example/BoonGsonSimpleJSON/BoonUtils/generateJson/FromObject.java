/**
 * 2.24 evening
 * https://www.tutorialspoint.com/boon/boon_from_object.htm
 */
package com.example.BoonGsonSimpleJSON.BoonUtils.generateJson;

import com.example.BoonGsonSimpleJSON.model.Student;
import org.boon.json.JsonFactory;
import org.boon.json.ObjectMapper;

public class FromObject {

    public static void main(String args[]) {
        ObjectMapper mapper = JsonFactory.create();
        Student student = new Student("Mahesh", 21);

        String jsonString = mapper.writeValueAsString(student);

        System.out.println(jsonString);
    }
}
