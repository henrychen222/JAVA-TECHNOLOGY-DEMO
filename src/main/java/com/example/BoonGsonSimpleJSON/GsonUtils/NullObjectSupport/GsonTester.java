/**
 * 2.26 morning
 * https://www.tutorialspoint.com/gson/gson_null_support.htm
 */
package com.example.BoonGsonSimpleJSON.GsonUtils.NullObjectSupport;

import com.google.gson.Gson;

public class GsonTester {
    public static void main(String args[]) {

        Gson gson = new Gson();

        Student student = new Student();
        student.setRollNo(1);
        String jsonString = gson.toJson(student);

        System.out.println(jsonString);
        student = gson.fromJson(jsonString, Student.class);
        System.out.println(student);
    }
}