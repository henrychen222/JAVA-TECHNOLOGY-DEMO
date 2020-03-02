/**
 * 3.2 morning
 * https://www.tutorialspoint.com/guice/guice_binding_annotations.htm
 */
package com.example.GuiceDemo.Bindings.BindingAnnotations;

class SpellCheckerImpl implements SpellChecker {
    @Override

    public void checkSpelling() {
        System.out.println("Inside checkSpelling.");
    }
}