/**
 * 3.4 morning
 * 
 * https://www.tutorialspoint.com/guice/guice_field_injection.htm
 */
package com.example.GuiceDemo.Injection.FieldInjection;

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