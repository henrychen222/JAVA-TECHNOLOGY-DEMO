/**
 * 3.2 morning
 * 
 * https://www.tutorialspoint.com/guice/guice_providedby.htm
 */
package com.example.GuiceDemo.Bindings.JustInTimeBindings.AtProvidedBy;

import com.google.inject.Provider;

class SpellCheckerProvider implements Provider<SpellChecker> {
    @Override

    public SpellChecker get() {
        String dbUrl = "jdbc:mysql://localhost:5326/emp";
        String user = "user";
        int timeout = 100;

        SpellChecker SpellChecker = new SpellCheckerImpl(dbUrl, user, timeout);
        return SpellChecker;
    }
}