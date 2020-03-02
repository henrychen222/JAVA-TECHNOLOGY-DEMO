/**
 * 3.2 morning
 * https://www.tutorialspoint.com/guice/guice_binding_annotations.htm
 */
package com.example.GuiceDemo.Bindings.BindingAnnotations;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import com.google.inject.BindingAnnotation;

import static java.lang.annotation.RetentionPolicy.RUNTIME;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;

/**
 * Create a binding annotation
 * 
 * @BindingAnnotation − Marks annotation as binding annotation.
 * @Target − Marks applicability of annotation.
 * @Retention − Marks availability of annotation as runtime.
 */
@BindingAnnotation
@Target({ FIELD, PARAMETER, METHOD })
@Retention(RUNTIME)
@interface WinWord {
}