/**
 * 2.29 evening
 * https://www.tutorialspoint.com/jackson_annotations/jackson_annotations_jsontypeinfo.htm
 * 
 * 3.1 evening
 * https://www.tutorialspoint.com/jackson_annotations/jackson_annotations_jsonsubtypes.htm
 * https://www.tutorialspoint.com/jackson_annotations/jackson_annotations_jsontypename.htm
 */
package com.example.JacksonDemo.JacksonAnnotations.TypeHandling.AtJsonTypeInfoAtJsonSubTypesAtJsonTypeName;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("circle")
class Circle extends Shape {
    public double radius;

    Circle() {
        this(null, 0.0);
    }

    Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }
}