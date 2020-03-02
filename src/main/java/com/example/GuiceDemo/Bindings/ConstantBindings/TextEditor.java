/**
 * 3.2 morning
 * https://www.tutorialspoint.com/guice/guice_constant_bindings.htm
 */
package com.example.GuiceDemo.Bindings.ConstantBindings;

import com.google.inject.Inject;
import com.google.inject.name.Named;

class TextEditor {
    private String dbUrl;

    @Inject
    public TextEditor(@Named("JDBC") String dbUrl) {
        this.dbUrl = dbUrl;
    }

    public void makeConnection() {
        System.out.println(dbUrl);
    }
}