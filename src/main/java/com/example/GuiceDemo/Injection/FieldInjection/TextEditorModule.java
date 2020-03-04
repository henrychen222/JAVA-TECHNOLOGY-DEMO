/**
 * 3.4 morning
 * 
 * https://www.tutorialspoint.com/guice/guice_field_injection.htm
 */
package com.example.GuiceDemo.Injection.FieldInjection;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

class TextEditorModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(String.class).annotatedWith(Names.named("JDBC")).toInstance("jdbc:mysql://localhost:5326/emp");
    }
}