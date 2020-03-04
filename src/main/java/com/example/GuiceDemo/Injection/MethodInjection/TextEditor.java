/**
 * 3.4 morning on road
 * https://www.tutorialspoint.com/guice/guice_method_injection.htm
 */
package com.example.GuiceDemo.Injection.MethodInjection;

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