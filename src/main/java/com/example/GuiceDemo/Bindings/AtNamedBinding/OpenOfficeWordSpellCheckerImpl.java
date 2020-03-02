/**
 * 3.2 morning
 * https://www.tutorialspoint.com/guice/guice_named_binding.htm
 */
package com.example.GuiceDemo.Bindings.AtNamedBinding;

class OpenOfficeWordSpellCheckerImpl extends SpellCheckerImpl {

    @Override
    public void checkSpelling() {
        System.out.println("Inside OpenOfficeWordSpellCheckerImpl.checkSpelling.");
    }
}