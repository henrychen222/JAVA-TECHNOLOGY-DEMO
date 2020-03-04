/**
 * 3.4 morning
 * 
 * https://www.tutorialspoint.com/guice/guice_scopes.htm
 */
package com.example.GuiceDemo.Miscellaneous.Scopes;

import com.google.inject.Singleton;

@Singleton  // Scopes
class SpellCheckerImpl implements SpellChecker {
    double id;

    public SpellCheckerImpl() {
        id = Math.random();
    }

    @Override
    public void checkSpelling() {
        System.out.println("Inside checkSpelling.");
    }

    @Override
    public double getId() {
        return id;
    }
}