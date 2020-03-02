/**
 * 3.1 evening
 * https://www.tutorialspoint.com/jackson_annotations/jackson_annotations_jsonformat.htm
 */
package com.example.JacksonDemo.JacksonAnnotations.General.AtJsonFormat;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

class Student {
    public int id;

    // specify format while serialization or de-serialization. It is mostly used
    // with Date fields.
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    public Date birthDate;

    Student(int id, Date birthDate) {
        this.id = id;
        this.birthDate = birthDate;
    }
}
