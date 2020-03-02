/**
 * 3.2 morning
 * https://www.tutorialspoint.com/guice/guice_injectable_constructors.htm
 */
package com.example.GuiceDemo.Bindings.JustInTimeBindings.InjectableConstructors;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

class TextEditorModule extends AbstractModule {
    @Override

    protected void configure() {
        bind(SpellChecker.class).to(SpellCheckerImpl.class);
        bind(String.class).annotatedWith(Names.named("JDBC")).toInstance("jdbc:mysql://localhost:5326/emp");
    }
}