package com.jad;

import java.util.List;

public class Foo {
    private Bar bar;
    private List<Baz> bazs;

    public Foo(Bar bar) {
        this.bar = bar;
    }

    public void addBaz(Baz baz){
        this.bazs.add(baz);
    }


    public void addGrault(){

    }

}
