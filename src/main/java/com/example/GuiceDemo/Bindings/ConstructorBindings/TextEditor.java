/**
 * 3.2 morning
 * https://www.tutorialspoint.com/guice/guice_constructor_bindings.htm
 */
package com.example.GuiceDemo.Bindings.ConstructorBindings;

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