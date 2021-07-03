package com.company;

public class Xiaomi extends Smartphone implements Printtable {
    private int snapdragon;


    public Xiaomi(String name,int snapdragon) {
        super(name);
        this.snapdragon = snapdragon;

    }

    @Override
    public void print() {
        super.print();
        System.out.println("Snapdragon: " + snapdragon );
    }
}
