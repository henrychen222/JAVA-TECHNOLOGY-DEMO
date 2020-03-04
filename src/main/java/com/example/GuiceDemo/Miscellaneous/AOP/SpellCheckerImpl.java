/**
 * 3.4 morning
 * 
 * https://www.tutorialspoint.com/guice/guice_aop.htm
 */
package com.example.GuiceDemo.Miscellaneous.AOP;

class SpellCheckerImpl implements SpellChecker {
    
    @Override
    @CallTracker
    public void checkSpelling() {
        System.out.println("Inside checkSpelling.");
    }
}