/**
 * 3.2 morning
 * https://www.tutorialspoint.com/guice/guice_first_application.htm
 */
package com.example.GuiceDemo.FirstApplication;

class SpellCheckerImpl implements SpellChecker {
    @Override

    public void checkSpelling() {
        System.out.println("Inside checkSpelling.");
    }
}