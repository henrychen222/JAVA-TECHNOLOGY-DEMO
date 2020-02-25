/**
 * 2.24 evening
 * https://www.tutorialspoint.com/boon/boon_jsonproperty.htm
 */
package com.example.BoonGsonSimpleJSON.BoonUtils.annotations.JsonProperty;

import org.boon.json.annotations.JsonProperty;

public class Student {

    private int id;

    Student() {
    }

    Student(int id) {
        this.id = id;
    }

    @JsonProperty("id")  // mark non-standard getter/setter method to be used with respect to json property
    public int getTheId() {
        return id;
    }

    @JsonProperty("id")
    public void setTheId(int id) {
        this.id = id;
    }
}
