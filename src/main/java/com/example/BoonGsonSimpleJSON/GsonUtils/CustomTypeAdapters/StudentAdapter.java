package com.example.BoonGsonSimpleJSON.GsonUtils.CustomTypeAdapters;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

class StudentAdapter extends TypeAdapter<Student> {
    @Override
    public Student read(JsonReader reader) throws IOException {
        Student student = new Student();
        reader.beginObject();
        String fieldname = null;

        while (reader.hasNext()) {
            JsonToken token = reader.peek();

            if (token.equals(JsonToken.NAME)) {
                // get the current token
                fieldname = reader.nextName();
            }

            if ("name".equals(fieldname)) {
                // move to next token
                token = reader.peek();
                student.setName(reader.nextString());
            }

            if ("rollNo".equals(fieldname)) {
                // move to next token
                token = reader.peek();
                student.setRollNo(reader.nextInt());
            }
        }
        reader.endObject();
        return student;
    }

    @Override
    public void write(JsonWriter writer, Student student) throws IOException {
        writer.beginObject();
        writer.name("name");
        writer.value(student.getName());
        writer.name("rollNo");
        writer.value(student.getRollNo());
        writer.endObject();
    }
}