/**
 * 3.4 morning
 * 
 * https://www.tutorialspoint.com/guice/guice_optional_injection.htm
 */
package com.example.GuiceDemo.Injection.OptionalInjection;

import com.google.inject.Inject;
import com.google.inject.name.Named;

class SpellCheckerImpl implements SpellChecker {
    private String dbUrl = "jdbc:mysql://localhost:5326/emp";

    public SpellCheckerImpl() {
    }

    // Optional Injection
    @Inject(optional = true)
    public void setDbUrl(@Named("JDBC") String dbUrl) {
        this.dbUrl = dbUrl;
    }

    @Override
    public void checkSpelling() {
        System.out.println("Inside checkSpelling.");
        System.out.println(dbUrl);
    }
}