/**
 * 3.4 morning on road
 * https://www.tutorialspoint.com/guice/guice_constructor_injection.htm
 */
package com.example.GuiceDemo.Injection.ConstructorInjection;

import com.google.inject.AbstractModule;

class TextEditorModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(SpellChecker.class).to(SpellCheckerImpl.class);
    }
}