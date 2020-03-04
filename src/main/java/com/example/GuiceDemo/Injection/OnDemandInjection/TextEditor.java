/**
 * 3.4 morning
 * 
 * https://www.tutorialspoint.com/guice/guice_on_demand_injection.htm
 */
package com.example.GuiceDemo.Injection.OnDemandInjection;

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
}