/**
 * 3.4 morning
 * 
 * https://www.tutorialspoint.com/guice/guice_optional_injection.htm
 */
package com.example.GuiceDemo.Injection.OptionalInjection;

import com.google.inject.ImplementedBy;

@ImplementedBy(SpellCheckerImpl.class)
interface SpellChecker {
    public void checkSpelling();
}