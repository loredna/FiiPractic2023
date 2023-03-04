package com.test.exceptions;

public class ExceptionService {
    public void doNothing(boolean throwException) throws MyCustomExceptions {
        System.out.println("Ok, I'm doing nothing!");
        if(throwException) {
            throw new MyCustomExceptions();
        }
    }
}
