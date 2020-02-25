/**
 * 2.24 evening
 * https://www.tutorialspoint.com/boon/boon_jsoninclude.htm
 */
package com.example.BoonGsonSimpleJSON.BoonUtils.annotations.JsonInclude;

import org.boon.json.JsonFactory;
import org.boon.json.ObjectMapper;

public class AtJsonInclude {
    public static void main(String args[]) {
        ObjectMapper mapper = JsonFactory.createUseAnnotations(true);

        Student student = new Student(1, null);

        String jsonString = mapper.writeValueAsString(student);
        System.out.println(jsonString);
    }
}
