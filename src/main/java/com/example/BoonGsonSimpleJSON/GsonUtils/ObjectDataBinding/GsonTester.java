/**
 * 2.26 afternoon
 * https://www.tutorialspoint.com/gson/gson_object_data_binding.htm
 */
package com.example.BoonGsonSimpleJSON.GsonUtils.ObjectDataBinding;

import com.example.BoonGsonSimpleJSON.GsonUtils.model.Student;
import com.google.gson.Gson;

public class GsonTester {
    public static void main(String args[]) {

        Gson gson = new Gson();
        Student student = new Student();
        student.setAge(10);
        student.setName("Mahesh");

        String jsonString = gson.toJson(student);
        System.out.println(jsonString);

        Student student1 = gson.fromJson(jsonString, Student.class);
        System.out.println(student1);
    }
}