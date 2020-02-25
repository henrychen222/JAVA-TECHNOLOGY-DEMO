/**
 * 2.24 evening
 * https://www.tutorialspoint.com/boon/boon_long_date.htm
 */
package com.example.BoonGsonSimpleJSON.model;

import java.util.Date;

public class Student2 {
    public String name;
    public int age;
    public Date dateOfBirth;

    public Student2(String name, int age, Date dateOfBirth) {
        this.name = name;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
    }
}
