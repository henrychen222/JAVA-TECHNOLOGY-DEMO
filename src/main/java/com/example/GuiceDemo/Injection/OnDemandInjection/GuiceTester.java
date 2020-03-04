/**
 * 3.4 morning
 * 
 * https://www.tutorialspoint.com/guice/guice_on_demand_injection.htm
 */
package com.example.GuiceDemo.Injection.OnDemandInjection;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class GuiceTester {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new TextEditorModule());
        SpellChecker spellChecker = new SpellCheckerImpl();
        injector.injectMembers(spellChecker); // On-Demand Injection, initialize Method and field injections

        TextEditor editor = injector.getInstance(TextEditor.class);
        editor.makeSpellCheck();
    }
}