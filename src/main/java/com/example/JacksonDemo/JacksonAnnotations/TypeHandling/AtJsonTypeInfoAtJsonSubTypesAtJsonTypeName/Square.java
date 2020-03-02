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

//  set type names to be used for annotated class
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