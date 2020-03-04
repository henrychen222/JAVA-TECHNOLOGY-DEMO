/**
 * 3.4 morning
 * 
 * https://www.tutorialspoint.com/guice/guice_scopes.htm
 */
package com.example.GuiceDemo.Miscellaneous.Scopes;

import com.google.inject.Inject;

class TextEditor {
    private SpellChecker spellChecker;

    @Inject
    public void setSpellChecker(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    public TextEditor() {
    }

    public void makeSpellCheck() {
        spellChecker.checkSpelling();
    }

    public double getSpellCheckerId() {
        return spellChecker.getId();
    }
}