/**
 * 3.2 morning on road
 * https://www.tutorialspoint.com/jackson/jackson_first_application.htm
 * https://www.tutorialspoint.com/jackson/jackson_objectmapper.htm
 */
package com.example.JacksonDemo.Jackson.FirstApplicationObjectMapperClass;

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