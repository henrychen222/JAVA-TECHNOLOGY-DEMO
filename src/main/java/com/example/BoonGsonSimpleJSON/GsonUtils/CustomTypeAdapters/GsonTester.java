/**
 * 2.26 morning
 * https://www.tutorialspoint.com/gson/gson_custom_adapters.htm
 */
package com.example.BoonGsonSimpleJSON.GsonUtils.CustomTypeAdapters;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonTester {
    public static void main(String args[]) {

        GsonBuilder builder = new GsonBuilder();
        builder.registerTypeAdapter(Student.class, new StudentAdapter());
        builder.setPrettyPrinting();
        Gson gson = builder.create();

        String jsonString = "{\"name\":\"Mahesh\", \"rollNo\":1}";
        Student student = gson.fromJson(jsonString, Student.class);
        System.out.println(student);

        jsonString = gson.toJson(student);
        System.out.println(jsonString);
    }
}