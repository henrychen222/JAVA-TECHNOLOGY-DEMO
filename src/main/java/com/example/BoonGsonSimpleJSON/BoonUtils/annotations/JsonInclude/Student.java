/**
 * 2.24 evening
 * https://www.tutorialspoint.com/boon/boon_jsoninclude.htm
 */
package com.example.BoonGsonSimpleJSON.BoonUtils.annotations.JsonInclude;

import org.boon.json.annotations.JsonInclude;

public class Student {
    public int id;

    @JsonInclude // include properties having null/empty or default values
    public String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
