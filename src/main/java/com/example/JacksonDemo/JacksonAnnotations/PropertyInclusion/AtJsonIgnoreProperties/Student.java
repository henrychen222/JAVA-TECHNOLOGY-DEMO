/**
 * 2.29 evening
 * https://www.tutorialspoint.com/jackson_annotations/jackson_annotations_jsonignoreproperties.htm
 */
package com.example.JacksonDemo.JacksonAnnotations.PropertyInclusion.AtJsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

// used at class level to mark a property or list of properties to be ignored
@JsonIgnoreProperties({ "id", "systemId" })
class Student {
    public int id;
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
