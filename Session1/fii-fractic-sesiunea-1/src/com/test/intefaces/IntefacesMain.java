package com.test.intefaces;

import java.util.List;

public class IntefacesMain {
    public static void main(String[] args) {
        Website website = new Facebook();
        website.getName();
        System.out.println(website.getName());
    }

    public static <T> void doSomething(List<T> param) {

    }
}
