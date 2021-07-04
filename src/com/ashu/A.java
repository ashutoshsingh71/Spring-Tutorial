package com.ashu;

public class A {
    B b;
    A(){
        System.out.println("A class Object");
    }

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }

    public void show(){
        System.out.println("A class show method");
        b.show();
    }
}
