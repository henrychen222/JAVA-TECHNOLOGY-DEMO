/**
 * 3.2 morning
 * https://www.tutorialspoint.com/guice/guice_provider_class.htm
 */
package com.example.GuiceDemo.Bindings.ProviderClass;

import com.google.inject.Provider;

// As @provides method becomes more complex, this method can be moved to separate classes using Provider interface
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