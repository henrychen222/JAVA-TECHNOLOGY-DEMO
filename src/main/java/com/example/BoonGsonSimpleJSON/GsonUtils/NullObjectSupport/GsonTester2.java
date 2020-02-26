/**
 * 2.26 morning
 * https://www.tutorialspoint.com/gson/gson_null_support.htm
 */
package com.example.BoonGsonSimpleJSON.GsonUtils.NullObjectSupport;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonTester2 {
    public static void main(String args[]) {

        GsonBuilder builder = new GsonBuilder();
        builder.serializeNulls();
        builder.setPrettyPrinting();
        Gson gson = builder.create();

        Student student = new Student();
        student.setRollNo(1);
        String jsonString = gson.toJson(student);

        System.out.println(jsonString);
        student = gson.fromJson(jsonString, Student.class);
        System.out.println(student);
    }
}