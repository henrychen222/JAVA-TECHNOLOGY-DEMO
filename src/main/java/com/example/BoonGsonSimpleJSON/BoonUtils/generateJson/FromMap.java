/**
 * 2.24 evening
 * https://www.tutorialspoint.com/boon/boon_from_map.htm
 */
package com.example.BoonGsonSimpleJSON.BoonUtils.generateJson;

import org.boon.json.JsonFactory;
import org.boon.json.ObjectMapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FromMap {
    public static void main(String args[]) {
        ObjectMapper mapper = JsonFactory.create();

        Map<String, String> student = new HashMap<>();
        student.put("Name", "Mahesh");
        student.put("RollNo", "21");

        Map<String, String> student1 = new HashMap<>();
        student1.put("Name", "Suresh");
        student1.put("RollNo", "22");

        List<Map<String, String>> studentList = new ArrayList<>();
        studentList.add(student);
        studentList.add(student1);

        Map<String, List> studentMap = new HashMap<>();
        studentMap.put("students", studentList);

        String jsonString = mapper.writeValueAsString(studentMap);
        System.out.println(jsonString);
    }
}
