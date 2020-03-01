/**
 * 2.26 evening on road
 * https://www.tutorialspoint.com/jackson_annotations/jackson_annotations_jsonanygetter.htm
 */
package com.example.JacksonDemo.JacksonAnnotations.Serialization.AtJsonAnyGetter;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;

class Student {
    private Map<String, String> properties;

    public Student() {
        properties = new HashMap<>();
    }

    // allows a getter method to return Map which is then used to serialize the
    // additional properties of JSON in the similar fashion as other properties
    @JsonAnyGetter
    public Map<String, String> getProperties() {
        return properties;
    }

    public void add(String property, String value) {
        properties.put(property, value);
    }
}