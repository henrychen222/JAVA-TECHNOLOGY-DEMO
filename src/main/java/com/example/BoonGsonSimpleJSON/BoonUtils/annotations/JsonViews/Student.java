/**
 * 2.24 evening
 * https://www.tutorialspoint.com/boon/boon_jsonviews.htm
 */
package com.example.BoonGsonSimpleJSON.BoonUtils.annotations.JsonViews;

import org.boon.json.annotations.JsonViews;

public class Student {
    public int id;

    public String name;

    // control values to be serialized or not
    @JsonViews(ignoreWithViews = {"public"}, includeWithViews = {"internal"})
    public int age;

    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

}
