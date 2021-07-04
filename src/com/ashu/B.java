package com.ashu;

public class B implements Printable {

    B(){
        System.out.println("B object");
    }
    public void show(){
        System.out.println("B class show");
    }

    @Override
    public void print() {
        System.out.println("B class print method");
    }
}
