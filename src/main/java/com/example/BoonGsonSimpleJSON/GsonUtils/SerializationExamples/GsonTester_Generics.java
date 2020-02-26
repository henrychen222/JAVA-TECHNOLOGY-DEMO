/**
 * 2.26 afternoon
 * https://www.tutorialspoint.com/gson/gson_serialization_examples.htm
 */
package com.example.BoonGsonSimpleJSON.GsonUtils.SerializationExamples;

import java.lang.reflect.Type;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class GsonTester_Generics {
    public static void main(String args[]) {

        // create a shape class of type circle.
        Shape<Circle> shape = new Shape<Circle>();

        // Create a Circle object
        Circle circle = new Circle(5.0);

        // assign circle to shape
        shape.setShape(circle);
        Gson gson = new Gson();

        // Define a Type shapeType of type circle.
        Type shapeType = new TypeToken<Shape<Circle>>() {
        }.getType();

        // Serialize the json as ShapeType
        String jsonString = gson.toJson(shape, shapeType);
        System.out.println(jsonString);
        Shape shape1 = gson.fromJson(jsonString, Shape.class);

        System.out.println(shape1.get().getClass());
        System.out.println(shape1.get().toString());
        System.out.println(shape1.getArea());
        Shape shape2 = gson.fromJson(jsonString, shapeType);
        System.out.println(shape2.get().getClass());
        System.out.println(shape2.get().toString());
        System.out.println(shape2.getArea());
    }
}