package com.test.exceptions;

public class ExceptionsMain {
    public static void main(String[] args) {
        ExceptionService et = new ExceptionService();
        try {
            et.doNothing(true);
        } catch (MyCustomExceptions e) {
            System.out.println("Ups, we did it again! ");
        }
        System.out.println(" No exception thrown! ");

    }
}
