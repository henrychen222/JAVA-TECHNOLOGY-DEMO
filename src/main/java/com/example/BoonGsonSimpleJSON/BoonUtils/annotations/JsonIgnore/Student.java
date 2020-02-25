/**
 * 2.24 evening
 * https://www.tutorialspoint.com/boon/boon_jsonignore.htm
 */
package com.example.BoonGsonSimpleJSON.BoonUtils.annotations.JsonIgnore;

import org.boon.json.annotations.JsonIgnore;

public class Student {
    public int id;

    @JsonIgnore  // mark a property or list of properties to be ignored
    public String systemId;

    public int rollNo;

    public String name;

    Student(int id, int rollNo, String systemId, String name) {
        this.id = id;
        this.systemId = systemId;
        this.rollNo = rollNo;
        this.name = name;
    }
}
