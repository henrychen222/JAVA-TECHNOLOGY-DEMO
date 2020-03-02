/**
 * 2.29 evening
 * https://www.tutorialspoint.com/jackson_annotations/jackson_annotations_jsontypeinfo.htm
 * 
 * 3.1 evening
 * https://www.tutorialspoint.com/jackson_annotations/jackson_annotations_jsonsubtypes.htm
 * https://www.tutorialspoint.com/jackson_annotations/jackson_annotations_jsontypename.htm
 */
package com.example.JacksonDemo.JacksonAnnotations.TypeHandling.AtJsonTypeInfoAtJsonSubTypesAtJsonTypeName;

import java.io.IOException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonTester {
    public static void main(String args[]) throws IOException {
        Shape shape = new Circle("CustomCircle", 1);
        String result = new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(shape);
        System.out.println(result);
        String json = "{\"name\":\"CustomCircle\",\"radius\":1.0, \"type\":\"circle\"}";
        Circle circle = new ObjectMapper().readerFor(Shape.class).readValue(json);
        System.out.println(circle.name);
    }
}