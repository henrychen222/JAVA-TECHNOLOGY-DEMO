/**
 * 2.24 evening
 * https://www.tutorialspoint.com/boon/boon_jsonproperty.htm
 */
package com.example.BoonGsonSimpleJSON.BoonUtils.annotations.JsonProperty;

import org.boon.json.JsonFactory;
import org.boon.json.ObjectMapper;

public class AtJsonProperty {
    public static void main(String args[]) {
        ObjectMapper mapper = JsonFactory.create();
        Student student = new Student(1);

        String jsonString = mapper.writeValueAsString(student);
        System.out.println(jsonString);
    }
}
