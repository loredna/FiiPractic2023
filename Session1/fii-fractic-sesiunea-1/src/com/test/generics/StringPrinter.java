package com.test.generics;

public class StringPrinter {

    private final String value;

    public StringPrinter(String value) {
        this.value = value;
    }

    public void printValue() {
        System.out.println(" Value is " + value);
    }
}
