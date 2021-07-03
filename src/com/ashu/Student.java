package com.ashu;

public class Student {
    int id;
    String name;
    Address address;

    public Student(int id){
        this.id = id;
    }
    public Student(String name){
        this.name = name;
    }

    public Student(Address address) {
        this.address = address;
    }

    public Student(int id, String name,Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayInfo(){
        System.out.println("id: " + this.id + "," + "name: " + this.name);
        System.out.println("Address: " + this.address);
    }
}
