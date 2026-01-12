package com.jad;

import java.util.List;

public class Foo {
    private Bar bar;
    private List<Baz> bazs;
    private Qux qux;

    public Foo(Bar bar) {
        this.bar = bar;
        this.qux = new Qux();
    }

    public void addBaz(Baz baz){
        this.bazs.add(baz);
    }


    public void addGrault(){

    }

}
