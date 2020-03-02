/**
 * 3.2 morning
 * https://www.tutorialspoint.com/guice/guice_first_application.htm
 */
package com.example.GuiceDemo.FirstApplication;

import com.google.inject.AbstractModule;

//Binding Module
class TextEditorModule extends AbstractModule {
    @Override

    protected void configure() {
        bind(SpellChecker.class).to(SpellCheckerImpl.class);
    }
}