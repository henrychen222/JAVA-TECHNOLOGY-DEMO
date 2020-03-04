/**
 * 3.4 morning
 * 
 * https://www.tutorialspoint.com/guice/guice_on_demand_injection.htm
 */
package com.example.GuiceDemo.Injection.OnDemandInjection;

class SpellCheckerImpl implements SpellChecker {
    public SpellCheckerImpl() {
    }

    @Override
    public void checkSpelling() {
        System.out.println("Inside checkSpelling.");
    }
}