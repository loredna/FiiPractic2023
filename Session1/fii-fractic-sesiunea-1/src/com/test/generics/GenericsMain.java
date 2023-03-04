package com.test.generics;

import com.test.intefaces.Facebook;
import com.test.intefaces.Website;

import java.util.List;

public class GenericsMain {
    public static void main(String[] args) {
        IntegerPrinter printer = new IntegerPrinter(123);
        printer.print();

        StringPrinter stringPrinter = new StringPrinter("ana");
        stringPrinter.printValue();
        /*
        GenericPrinter<Integer> integerGenericPrinter = new GenericPrinter<>(123);
        integerGenericPrinter.print();

        GenericPrinter<String> stringGenericPrinter = new GenericPrinter<>("ana");
        stringGenericPrinter.print();*/
        GenericPrinter<Facebook> x = new GenericPrinter<>(new Facebook());
        x.print();
        printParameter(List.of(new Facebook()));


        WildcardGeneric<String> firstWildcardObject = new WildcardGeneric<>(new String[]{"ads", "ads"});
        WildcardGeneric<Integer> secondWildcardObject = new WildcardGeneric<>(new Integer[]{1, 2, 3, 4});
        firstWildcardObject.greaterThan(secondWildcardObject);

        //wildcard se foloseste atunci cand vrem sa folosim un generic dar nu stim ce clasa va fi acel generic


    }

    public static <T, L> L printParameter(List<T> param) {
        System.out.println("we are here :D " + param.toString());
        //return param
    }
}
