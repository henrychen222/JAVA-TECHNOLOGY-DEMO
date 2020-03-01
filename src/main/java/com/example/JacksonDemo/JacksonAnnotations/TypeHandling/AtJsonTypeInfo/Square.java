/**
 * 2.29 evening
 * https://www.tutorialspoint.com/jackson_annotations/jackson_annotations_jsontypeinfo.htm
 */
package com.example.JacksonDemo.JacksonAnnotations.TypeHandling.AtJsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("square")
class Square extends Shape {
    public double length;

    Square() {
        this(null, 0.0);
    }

    Square(String name, double length) {
        super(name);
        this.length = length;
    }
}