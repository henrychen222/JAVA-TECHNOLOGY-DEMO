/**
 * 3.2 morning
 * https://www.tutorialspoint.com/guice/guice_inbuilt_bindings.htm
 */
package com.example.GuiceDemo.Bindings.InbuiltBindings;

import java.util.logging.Logger;

import com.google.inject.Inject;

class TextEditor {
    private Logger logger;

    /**
     * Guice provides inbuilt binding for java.util.logging.Logger class Logger's
     * name is automatically set to the name of the class into which the Logger is
     * injected
     */
    @Inject
    public TextEditor(Logger logger) {
        this.logger = logger;
    }

    public void makeSpellCheck() {
        logger.info("In TextEditor.makeSpellCheck() method");
    }
}