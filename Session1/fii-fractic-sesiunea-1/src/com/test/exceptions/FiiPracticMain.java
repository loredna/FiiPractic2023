package com.test.exceptions;

public class FiiPracticMain {

    public static void main(String[] args) {
        String name = null;
        try {
            throw new MyCustomExceptions();
        } catch (NullPointerException e) {
            System.out.println(" Exceptie NPE");
        } catch (Exception e) {
            System.out.println("Exception ");
        }
        System.out.println("Ana are mere");
    }
}
