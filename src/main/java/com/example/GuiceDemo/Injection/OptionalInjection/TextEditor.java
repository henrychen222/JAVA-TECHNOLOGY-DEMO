/**
 * 3.4 morning
 * 
 * https://www.tutorialspoint.com/guice/guice_optional_injection.htm
 */
package com.example.GuiceDemo.Injection.OptionalInjection;

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