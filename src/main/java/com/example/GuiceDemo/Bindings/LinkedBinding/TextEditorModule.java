/**
 * 3.2 morning
 * https://www.tutorialspoint.com/guice/guice_linked_binding.htm
 */
package com.example.GuiceDemo.Bindings.LinkedBinding;

import com.google.inject.AbstractModule;

//Binding Module
class TextEditorModule extends AbstractModule {
   @Override

   protected void configure() {
      // Linked bindings
      bind(SpellChecker.class).to(SpellCheckerImpl.class); // Guice maps a type to its implementation
      bind(SpellCheckerImpl.class).to(WinWordSpellCheckerImpl.class); // mapped the concrete class to its subclass
   }
}