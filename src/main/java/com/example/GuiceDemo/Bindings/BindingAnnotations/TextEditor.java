/**
 * 3.2 morning
 * https://www.tutorialspoint.com/guice/guice_binding_annotations.htm
 */
package com.example.GuiceDemo.Bindings.BindingAnnotations;

import com.google.inject.Inject;

class TextEditor {
    private SpellChecker spellChecker;

    // Inject using binding annotation
    @Inject
    public TextEditor(@WinWord SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    public void makeSpellCheck() {
        spellChecker.checkSpelling();
    }
}