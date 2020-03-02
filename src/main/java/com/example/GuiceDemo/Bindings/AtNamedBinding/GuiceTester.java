/**
 * 3.2 morning
 * https://www.tutorialspoint.com/guice/guice_named_binding.htm
 */
package com.example.GuiceDemo.Bindings.AtNamedBinding;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class GuiceTester {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new TextEditorModule());
        TextEditor editor = injector.getInstance(TextEditor.class);
        editor.makeSpellCheck();
    }
}