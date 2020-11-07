package com.company;
public class Tiger extends Cat implements Printable {
    private double tiger;

    public Tiger(String animal) {
        super(animal);
        this.tiger = tiger;
    }

    @Override
    public void print() {
        System.out.println("\uD83D\uDC2F");
        System.out.println("рррр");
    }
}
