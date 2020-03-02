/**
 * 3.2 morning
 * https://www.tutorialspoint.com/guice/guice_implementatedby.htm
 */
package com.example.GuiceDemo.Bindings.JustInTimeBindings.AtImplementatedBy;

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