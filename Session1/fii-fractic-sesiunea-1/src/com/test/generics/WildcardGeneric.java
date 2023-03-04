package com.test.generics;

public class WildcardGeneric<T> {

    private final T[] list;

    public WildcardGeneric(T[] list) {
        this.list = list;
    }

    public void greaterThan(WildcardGeneric<?> otherGeneric) {
        System.out.println(otherGeneric.getList().length);
    }

    public T[] getList() {
        return this.list;
    }
}
