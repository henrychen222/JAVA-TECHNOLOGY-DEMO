/**
 * 2.26 morning
 * https://www.tutorialspoint.com/gson/gson_first_application.htm
 * https://www.tutorialspoint.com/gson/gson_class.htm
 */
package com.example.BoonGsonSimpleJSON.GsonUtils.FirstApplication_Class;

import com.example.BoonGsonSimpleJSON.GsonUtils.model.Student;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonTester {
    public static void main(String[] args) {
        String jsonString = "{\"name\":\"Mahesh\", \"age\":21}";

        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();

        Gson gson = builder.create();
        Student student = gson.fromJson(jsonString, Student.class);
        System.out.println(student);

        jsonString = gson.toJson(student);
        System.out.println(jsonString);
    }
}