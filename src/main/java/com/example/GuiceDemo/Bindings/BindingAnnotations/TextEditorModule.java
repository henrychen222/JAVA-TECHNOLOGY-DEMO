/**
 * 3.2 morning
 * https://www.tutorialspoint.com/guice/guice_binding_annotations.htm
 */
package com.example.GuiceDemo.Bindings.BindingAnnotations;

import com.google.inject.AbstractModule;

class TextEditorModule extends AbstractModule {
    @Override

    protected void configure() {
        // Mapping using binding annotation
        bind(SpellChecker.class).annotatedWith(WinWord.class).to(WinWordSpellCheckerImpl.class);
    }
}