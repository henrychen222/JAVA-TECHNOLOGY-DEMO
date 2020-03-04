/**
 * 3.4 morning on road
 * https://www.tutorialspoint.com/guice/guice_method_injection.htm
 */
package com.example.GuiceDemo.Injection.MethodInjection;

import com.google.inject.Inject;
import com.google.inject.name.Named;

class SpellCheckerImpl implements SpellChecker {
    private String dbUrl;

    public SpellCheckerImpl() {
    }

    // Method Injection
    @Inject
    public void setDbUrl(@Named("JDBC") String dbUrl) {
        this.dbUrl = dbUrl;
    }

    @Override
    public void checkSpelling() {
        System.out.println("Inside checkSpelling.");
        System.out.println(dbUrl);
    }
}