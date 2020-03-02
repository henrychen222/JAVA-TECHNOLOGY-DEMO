/**
 * 3.2 morning
 * https://www.tutorialspoint.com/guice/guice_provides_annotation.htm
 */
package com.example.GuiceDemo.Bindings.AtProvidesAnnotation;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;

class TextEditorModule extends AbstractModule {
    @Override
    protected void configure() {
    }

    // create bindings with complex objects using @provides
    @Provides
    public SpellChecker provideSpellChecker() {
        String dbUrl = "jdbc:mysql://localhost:5326/emp";
        String user = "user";
        int timeout = 100;

        SpellChecker SpellChecker = new SpellCheckerImpl(dbUrl, user, timeout);
        return SpellChecker;
    }
}