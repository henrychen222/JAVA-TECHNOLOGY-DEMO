/**
 * 3.2 morning
 * https://www.tutorialspoint.com/guice/guice_linked_binding.htm
 */
package com.example.GuiceDemo.Bindings.LinkedBinding;

class SpellCheckerImpl implements SpellChecker {
    @Override

    public void checkSpelling() {
        System.out.println("Inside checkSpelling.");
    }
}