/**
 * 2.26 morning
 * https://www.tutorialspoint.com/gson/gson_first_application.htm
 */
package com.example.BoonGsonSimpleJSON.GsonUtils.model;

public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student [ name: " + name + ", age: " + age + " ]";
    }
}