/**
 * 2.29 evening
 * https://www.tutorialspoint.com/jackson_annotations/jackson_annotations_jsonanysetter.htm
 */
package com.example.JacksonDemo.JacksonAnnotations.Deserialization.AtJsonAnySetter;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnySetter;

class Student {
    private Map<String, String> properties;

    public Student() {
        properties = new HashMap<>();
    }

    public Map<String, String> getProperties() {
        return properties;
    }

    // allows a setter method to use Map which is then used to deserialize the
    // additional properties of JSON in the similar fashion as other properties
    @JsonAnySetter
    public void add(String property, String value) {
        properties.put(property, value);
    }
}