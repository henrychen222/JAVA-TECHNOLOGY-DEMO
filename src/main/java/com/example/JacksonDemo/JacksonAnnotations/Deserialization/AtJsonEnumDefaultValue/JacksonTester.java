/**
 * 2.29 evening
 * https://www.tutorialspoint.com/jackson_annotations/jackson_annotations_jsonenumdefaultvalue.htm
 */
package com.example.JacksonDemo.JacksonAnnotations.Deserialization.AtJsonEnumDefaultValue;

import java.io.IOException;
import java.text.ParseException;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonTester {
    public static void main(String args[]) throws ParseException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE);
        String jsonString = "\"abc\"";
        try {
            LETTERS value = mapper.readValue(jsonString, LETTERS.class);
            System.out.println(value);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}