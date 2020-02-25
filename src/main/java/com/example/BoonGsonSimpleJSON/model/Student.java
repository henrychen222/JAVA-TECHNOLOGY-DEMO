/**
 * 022420 evening
 * https://www.tutorialspoint.com/boon/boon_to_object.htm
 * https://www.tutorialspoint.com/boon/boon_from_object.htm
 */
package com.example.BoonGsonSimpleJSON.model;

public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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
