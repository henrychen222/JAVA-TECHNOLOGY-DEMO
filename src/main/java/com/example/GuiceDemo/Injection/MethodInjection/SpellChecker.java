/**
 * 3.4 morning on road
 * https://www.tutorialspoint.com/guice/guice_method_injection.htm
 */
package com.example.GuiceDemo.Injection.MethodInjection;

import com.google.inject.ImplementedBy;

@ImplementedBy(SpellCheckerImpl.class)
interface SpellChecker {
    public void checkSpelling();
}