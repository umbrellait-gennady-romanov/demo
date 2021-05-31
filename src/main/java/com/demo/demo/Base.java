package com.demo.demo;

import org.springframework.beans.factory.annotation.Value;

public abstract class Base {

    @Value("${name}")
    String name;

    public abstract void printName();
}
