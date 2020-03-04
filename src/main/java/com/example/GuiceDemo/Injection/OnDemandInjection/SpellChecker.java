/**
 * 3.4 morning
 * 
 * https://www.tutorialspoint.com/guice/guice_on_demand_injection.htm
 */
package com.example.GuiceDemo.Injection.OnDemandInjection;

import com.google.inject.ImplementedBy;

@ImplementedBy(SpellCheckerImpl.class)
interface SpellChecker {
    public void checkSpelling();
}