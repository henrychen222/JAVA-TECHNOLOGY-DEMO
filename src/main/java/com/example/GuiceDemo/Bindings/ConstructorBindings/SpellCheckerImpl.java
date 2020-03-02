/**
 * 3.2 morning
 * https://www.tutorialspoint.com/guice/guice_constructor_bindings.htm
 */
package com.example.GuiceDemo.Bindings.ConstructorBindings;

import com.google.inject.name.Named;

class SpellCheckerImpl implements SpellChecker {
    private String dbUrl;

    public SpellCheckerImpl() {
    }

    public SpellCheckerImpl(@Named("JDBC") String dbUrl) {
        this.dbUrl = dbUrl;
    }

    @Override
    public void checkSpelling() {
        System.out.println("Inside checkSpelling.");
        System.out.println(dbUrl);
    }
}