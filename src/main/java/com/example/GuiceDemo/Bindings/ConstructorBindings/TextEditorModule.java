/**
 * 3.2 morning
 * https://www.tutorialspoint.com/guice/guice_constructor_bindings.htm
 */
package com.example.GuiceDemo.Bindings.ConstructorBindings;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

class TextEditorModule extends AbstractModule {

    @Override
    protected void configure() {
        try {
            // Constructor Bindings: create bindings with specific constructor of an object
            bind(SpellChecker.class).toConstructor(SpellCheckerImpl.class.getConstructor(String.class));
        } catch (NoSuchMethodException | SecurityException e) {
            System.out.println("Required constructor missing");
        }
        bind(String.class).annotatedWith(Names.named("JDBC")).toInstance("jdbc:mysql://localhost:5326/emp");
    }
}