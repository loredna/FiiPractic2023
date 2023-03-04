package com.test.intefaces;

public interface Action {

    default String getName() {
        return "Action";
    }
}
