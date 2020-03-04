/**
 * 3.4 morning
 * 
 * https://www.tutorialspoint.com/guice/guice_aop.htm
 */
package com.example.GuiceDemo.Miscellaneous.AOP;

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