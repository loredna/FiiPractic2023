package com.spring.qualifiers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FooService {

    @Autowired
    Formatter formatter;

    public void format() {
        System.out.println(formatter.format());
    }
}
