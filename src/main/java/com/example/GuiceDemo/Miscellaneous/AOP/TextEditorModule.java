/**
 * 3.4 morning
 * 
 * https://www.tutorialspoint.com/guice/guice_aop.htm
 */
package com.example.GuiceDemo.Miscellaneous.AOP;

import com.google.inject.AbstractModule;
import com.google.inject.matcher.Matchers;

class TextEditorModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(SpellChecker.class).to(SpellCheckerImpl.class);
        bindInterceptor(Matchers.any(), Matchers.annotatedWith(CallTracker.class), new CallTrackerService());
    }
}