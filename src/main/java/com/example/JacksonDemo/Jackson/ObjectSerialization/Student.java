/**
 * 3.2 morning on road
 * https://www.tutorialspoint.com/jackson/jackson_object_serialization.htm
 */
package com.example.JacksonDemo.Jackson.ObjectSerialization;

class Student {
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