/**
 * 3.2 morning
 * https://www.tutorialspoint.com/guice/guice_provider_class.htm
 */
package com.example.GuiceDemo.Bindings.ProviderClass;

import com.google.inject.Inject;

class TextEditor {
    private SpellChecker spellChecker;

    @Inject
    public TextEditor(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    public void makeSpellCheck() {
        spellChecker.checkSpelling();
    }
}