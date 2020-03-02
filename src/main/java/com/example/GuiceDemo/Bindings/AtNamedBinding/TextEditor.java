/**
 * 3.2 morning
 * https://www.tutorialspoint.com/guice/guice_named_binding.htm
 */
package com.example.GuiceDemo.Bindings.AtNamedBinding;

import com.google.inject.Inject;
import com.google.inject.name.Named;

class TextEditor {
    private SpellChecker spellChecker;

    // Inject using @Named annotation
    @Inject
    public TextEditor(@Named("OpenOffice") SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    public void makeSpellCheck() {
        spellChecker.checkSpelling();
    }
}