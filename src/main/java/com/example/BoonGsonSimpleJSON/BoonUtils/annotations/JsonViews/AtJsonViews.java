/**
 * 2.24 evening
 * https://www.tutorialspoint.com/boon/boon_jsonviews.htm
 */
package com.example.BoonGsonSimpleJSON.BoonUtils.annotations.JsonViews;

import org.boon.json.JsonSerializer;
import org.boon.json.JsonSerializerFactory;

public class AtJsonViews {
    public static void main(String args[]) {
        JsonSerializer serializerPublic = new JsonSerializerFactory()
                .useAnnotations()
                .setView("public")
                .create();

        JsonSerializer serializerInternal = new JsonSerializerFactory()
                .useAnnotations()
                .setView("internal")
                .create();

        Student student = new Student(1, "Mark", 20);

        String jsonString = serializerPublic.serialize(student).toString();
        System.out.println(jsonString);

        jsonString = serializerInternal.serialize(student).toString();
        System.out.println(jsonString);
    }
}
