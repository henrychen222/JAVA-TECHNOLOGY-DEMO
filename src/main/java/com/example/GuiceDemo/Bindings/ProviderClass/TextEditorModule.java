/**
 * 3.2 morning
 * https://www.tutorialspoint.com/guice/guice_provider_class.htm
 */
package com.example.GuiceDemo.Bindings.ProviderClass;

import com.google.inject.AbstractModule;

class TextEditorModule extends AbstractModule {

    @Override
    protected void configure() {
        // map the provider to type
        bind(SpellChecker.class).toProvider(SpellCheckerProvider.class);
    }
}