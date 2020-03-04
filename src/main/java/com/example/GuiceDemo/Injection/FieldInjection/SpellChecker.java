/**
 * 3.4 morning
 * 
 * https://www.tutorialspoint.com/guice/guice_field_injection.htm
 */
package com.example.GuiceDemo.Injection.FieldInjection;

import com.google.inject.ImplementedBy;

@ImplementedBy(SpellCheckerImpl.class)
interface SpellChecker {
    public void checkSpelling();
}