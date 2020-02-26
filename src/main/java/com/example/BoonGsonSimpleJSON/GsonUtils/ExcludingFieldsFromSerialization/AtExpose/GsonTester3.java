/**
 * 2.26 morning
 * https://www.tutorialspoint.com/gson/gson_excluded_serialization.htm
 */
package com.example.BoonGsonSimpleJSON.GsonUtils.ExcludingFieldsFromSerialization.AtExpose;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonTester3 {
    public static void main(String args[]) {

        GsonBuilder builder = new GsonBuilder();
        builder.excludeFieldsWithoutExposeAnnotation();
        Gson gson = builder.create();

        Student student = new Student();
        student.setRollNo(1);
        student.setName("Mahesh Kumar");
        student.setVerified(true);
        student.setId(1);

        Student.className = "VI"; // change

        String jsonString = gson.toJson(student);
        System.out.println(jsonString);
    }
}