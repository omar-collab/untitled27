package com.company;

public class Wolf extends Dog implements Printable {
    private String wolf;

    public Wolf(String animal) {
        super(animal);
        this.wolf = wolf;
    }

    @Override
    public void print() {
        System.out.println("\uD83D\uDC3A");
        System.out.println("Ау");
    }
}
