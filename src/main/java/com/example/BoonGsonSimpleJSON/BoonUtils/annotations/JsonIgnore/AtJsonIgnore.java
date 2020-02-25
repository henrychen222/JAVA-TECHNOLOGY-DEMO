/**
 * 2.24 evening
 * https://www.tutorialspoint.com/boon/boon_jsonignore.htm
 */
package com.example.BoonGsonSimpleJSON.BoonUtils.annotations.JsonIgnore;

import org.boon.json.JsonFactory;
import org.boon.json.ObjectMapper;

public class AtJsonIgnore {
    public static void main(String args[]) {
        ObjectMapper mapper = JsonFactory.create();

        // systemId was ignored
        Student student = new Student(1, 11, "1ab", "Mark");

        String jsonString = mapper.writeValueAsString(student);
        System.out.println(jsonString);
    }
}
