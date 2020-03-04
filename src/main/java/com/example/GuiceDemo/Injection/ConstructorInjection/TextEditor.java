/**
 * 3.4 morning on road
 * https://www.tutorialspoint.com/guice/guice_constructor_injection.htm
 */
package com.example.GuiceDemo.Injection.ConstructorInjection;

import com.google.inject.Inject;

class TextEditor {
    private SpellChecker spellChecker;

    // Constructor Injection
    @Inject
    public TextEditor(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    public void makeSpellCheck() {
        spellChecker.checkSpelling();
    }
}