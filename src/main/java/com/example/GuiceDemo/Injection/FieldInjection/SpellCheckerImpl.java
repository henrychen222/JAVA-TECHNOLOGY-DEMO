/**
 * 3.4 morning
 * 
 * https://www.tutorialspoint.com/guice/guice_field_injection.htm
 */
package com.example.GuiceDemo.Injection.FieldInjection;

import com.google.inject.Inject;
import com.google.inject.name.Named;

class SpellCheckerImpl implements SpellChecker {

    // Field Injection
    @Inject
    @Named("JDBC")
    private String dbUrl;

    public SpellCheckerImpl() {
    }

    @Override
    public void checkSpelling() {
        System.out.println("Inside checkSpelling.");
        System.out.println(dbUrl);
    }
}