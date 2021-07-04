package com.ashu;

public class A {
    private static final A aObj = new A();
    private A(){
        System.out.println("A class Object");
    }

    public static A getA(){
        return aObj;
    }
    /*public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }*/

    public void show(){
        System.out.println("A class show method");
        //b.show();
    }
}
