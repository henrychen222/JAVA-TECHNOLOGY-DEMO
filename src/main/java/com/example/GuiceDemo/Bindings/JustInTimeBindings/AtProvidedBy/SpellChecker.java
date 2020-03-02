/**
 * 3.2 morning
 * 
 * https://www.tutorialspoint.com/guice/guice_providedby.htm
 */
package com.example.GuiceDemo.Bindings.JustInTimeBindings.AtProvidedBy;

import com.google.inject.ProvidedBy;

// tells the guice about the provider of implementation class, No binding is required in Binding Module
@ProvidedBy(SpellCheckerProvider.class)
interface SpellChecker {
    public void checkSpelling();
}
