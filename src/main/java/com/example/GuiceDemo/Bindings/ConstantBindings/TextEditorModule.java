/**
 * 3.2 morning
 * https://www.tutorialspoint.com/guice/guice_constant_bindings.htm
 */
package com.example.GuiceDemo.Bindings.ConstantBindings;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

class TextEditorModule extends AbstractModule {

    @Override
    protected void configure() {
        // toInstance() for Constant Bindings
        bind(String.class).annotatedWith(Names.named("JDBC")).toInstance("jdbc:mysql://localhost:5326/emp");
    }
}