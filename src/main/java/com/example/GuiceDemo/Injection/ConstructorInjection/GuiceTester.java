/**
 * 3.4 morning on road
 * https://www.tutorialspoint.com/guice/guice_constructor_injection.htm
 */
package com.example.GuiceDemo.Injection.ConstructorInjection;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class GuiceTester {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new TextEditorModule());
        TextEditor editor = injector.getInstance(TextEditor.class);
        editor.makeSpellCheck();
    }
}