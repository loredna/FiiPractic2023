package com.test.generics;

import com.test.intefaces.Action;
import com.test.intefaces.Website;

public class GenericPrinter<T extends Website> {

    private final T value;

    public GenericPrinter(T value) {
        this.value = value;
    }

    public void print() {


        System.out.println(" Value is " + value);
    }
}
