package com.test.generics;

public class IntegerPrinter {

    private final Integer value;

    public IntegerPrinter(Integer value) {
        this.value = value;
    }

    public void print() {
        System.out.println(" Value is " + value);
    }
}
