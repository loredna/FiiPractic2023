package com.test.intefaces;

public interface Website {

    Integer ID = 123;

    public abstract void notification();
    String getNotification(int index);

    default String getName() {
        return "Website";
    }
}
