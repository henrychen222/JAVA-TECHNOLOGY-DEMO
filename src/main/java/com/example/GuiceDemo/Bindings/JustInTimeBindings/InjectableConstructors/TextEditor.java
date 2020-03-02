/**
 * 3.2 morning
 * https://www.tutorialspoint.com/guice/guice_injectable_constructors.htm
 */
package com.example.GuiceDemo.Bindings.JustInTimeBindings.InjectableConstructors;

import com.google.inject.Inject;

class TextEditor {
    private SpellChecker spellChecker;

    // Injectable Constructors
    @Inject
    public TextEditor(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    public void makeSpellCheck() {
        spellChecker.checkSpelling();
    }
}