/**
 * 3.4 morning on road
 * https://www.tutorialspoint.com/guice/guice_constructor_injection.htm
 */
package com.example.GuiceDemo.Injection.ConstructorInjection;

class SpellCheckerImpl implements SpellChecker {
    @Override

    public void checkSpelling() {
        System.out.println("Inside checkSpelling.");
    }
}