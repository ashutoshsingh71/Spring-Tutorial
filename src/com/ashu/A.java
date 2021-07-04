package com.ashu;

public class A implements Printable{
    //private static final A aObj = new A();
     A(){
        System.out.println("A class Object");
    }

    /*public static A getA(){
        return aObj;
    }*/
    /*public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }*/

    @Override
    public void print() {
        System.out.println("A class object Print method");
    }

    public void show(){
        System.out.println("A class show method");
        //b.show();
    }
}
