/**
 * 2.29 evening
 * https://www.tutorialspoint.com/jackson_annotations/jackson_annotations_jsonignore.htm
 */
package com.example.JacksonDemo.JacksonAnnotations.PropertyInclusion.AtJsonIgnore;

import com.fasterxml.jackson.annotation.JsonIgnore;

class Student {
    public int id;

    @JsonIgnore // used at field level to mark a property or list of properties to be ignored
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
