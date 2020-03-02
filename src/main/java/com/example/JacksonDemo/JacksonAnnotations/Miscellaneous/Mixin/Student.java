/**
 * 3.1 evening
 * https://www.tutorialspoint.com/jackson_annotations/jackson_annotations_mixin.htm
 */
package com.example.JacksonDemo.JacksonAnnotations.Miscellaneous.Mixin;

class Student {
    public int id;
    public String systemId;
    public int rollNo;
    public Name nameObj;

    Student(int id, int rollNo, String systemId, String name) {
        this.id = id;
        this.systemId = systemId;
        this.rollNo = rollNo;
        nameObj = new Name(name);
    }
}
