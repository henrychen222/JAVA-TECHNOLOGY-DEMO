/**
 * 2.29 evening
 * https://www.tutorialspoint.com/jackson_annotations/jackson_annotations_jsonignoretype.htm
 */
package com.example.JacksonDemo.JacksonAnnotations.PropertyInclusion.AtJsonIgnoreType;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreType;

class Student {
    public int id;
    @JsonIgnore
    public String systemId;
    public int rollNo;
    public Name nameObj;

    Student(int id, int rollNo, String systemId, String name) {
        this.id = id;
        this.systemId = systemId;
        this.rollNo = rollNo;
        nameObj = new Name(name);
    }

    @JsonIgnoreType // used at mark a property of special type to be ignored
    class Name {
        public String name;

        Name(String name) {
            this.name = name;
        }
    }
}
