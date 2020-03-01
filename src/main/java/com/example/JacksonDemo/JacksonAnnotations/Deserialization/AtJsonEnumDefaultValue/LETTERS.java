/**
 * 2.29 evening
 * https://www.tutorialspoint.com/jackson_annotations/jackson_annotations_jsonenumdefaultvalue.htm
 */
package com.example.JacksonDemo.JacksonAnnotations.Deserialization.AtJsonEnumDefaultValue;

import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;

enum LETTERS {
    A, B, @JsonEnumDefaultValue // deserialize an unknown enum value using a default value
    UNKNOWN
}