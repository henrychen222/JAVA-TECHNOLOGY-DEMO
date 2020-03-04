/**
 * 3.4 morning on road
 * https://www.tutorialspoint.com/guice/guice_method_injection.htm
 */
package com.example.GuiceDemo.Injection.MethodInjection;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

class TextEditorModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(String.class).annotatedWith(Names.named("JDBC")).toInstance("jdbc:mysql://localhost:5326/emp");
    }
}