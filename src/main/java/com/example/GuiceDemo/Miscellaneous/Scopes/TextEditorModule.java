/**
 * 3.4 morning
 * 
 * https://www.tutorialspoint.com/guice/guice_scopes.htm
 */
package com.example.GuiceDemo.Miscellaneous.Scopes;

import com.google.inject.AbstractModule;

class TextEditorModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(SpellChecker.class).to(SpellCheckerImpl.class);
    }
}