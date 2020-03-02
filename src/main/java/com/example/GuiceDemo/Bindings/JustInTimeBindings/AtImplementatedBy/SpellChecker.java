/**
 * 3.2 morning
 * https://www.tutorialspoint.com/guice/guice_implementatedby.htm
 */
package com.example.GuiceDemo.Bindings.JustInTimeBindings.AtImplementatedBy;

import com.google.inject.ImplementedBy;

// tells the guice about the implementation class, No binding is required in Binding Module
@ImplementedBy(SpellCheckerImpl.class)
interface SpellChecker {
    public void checkSpelling();
}
