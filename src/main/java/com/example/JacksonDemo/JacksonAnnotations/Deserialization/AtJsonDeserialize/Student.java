/**
 * 2.29 evening
 * https://www.tutorialspoint.com/jackson_annotations/jackson_annotations_jsondeserialize.htm
 */
package com.example.JacksonDemo.JacksonAnnotations.Deserialization.AtJsonDeserialize;

import java.util.Date;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

class Student {
    public String name;

    // specify custom deserializer to unmarshall the json object
    @JsonDeserialize(using = CustomDateDeserializer.class)
    public Date dateOfBirth;
}
