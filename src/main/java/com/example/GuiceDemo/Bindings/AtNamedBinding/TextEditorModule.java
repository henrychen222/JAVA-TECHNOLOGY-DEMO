/**
 * 3.2 morning
 * https://www.tutorialspoint.com/guice/guice_named_binding.htm
 */
package com.example.GuiceDemo.Bindings.AtNamedBinding;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

class TextEditorModule extends AbstractModule {

    @Override
    protected void configure() {
        // Mapping using named annotation
        bind(SpellChecker.class).annotatedWith(Names.named("OpenOffice")).to(OpenOfficeWordSpellCheckerImpl.class);
    }
}