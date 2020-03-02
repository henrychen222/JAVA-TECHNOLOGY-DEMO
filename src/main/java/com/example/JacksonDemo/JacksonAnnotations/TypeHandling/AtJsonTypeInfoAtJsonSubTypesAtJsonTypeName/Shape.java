/**
 * 2.29 evening
 * https://www.tutorialspoint.com/jackson_annotations/jackson_annotations_jsontypeinfo.htm
 * 
 * 3.1 evening
 * https://www.tutorialspoint.com/jackson_annotations/jackson_annotations_jsonsubtypes.htm
 * https://www.tutorialspoint.com/jackson_annotations/jackson_annotations_jsontypename.htm
 */
package com.example.JacksonDemo.JacksonAnnotations.TypeHandling.AtJsonTypeInfoAtJsonSubTypesAtJsonTypeName;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;

// indicate details of type information which is to be included in serialization and de-serialization
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = As.PROPERTY, property = "type")

// indicate subtypes of types annotated
@JsonSubTypes({ @JsonSubTypes.Type(value = Square.class, name = "square"),
        @JsonSubTypes.Type(value = Circle.class, name = "circle") })
class Shape {
    public String name;

    Shape(String name) {
        this.name = name;
    }
}