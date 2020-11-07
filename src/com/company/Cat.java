package com.company;

public class Cat extends Animal implements Printable {
    private String cat;

    public Cat(String animal) {
        super(animal);
        this.cat = cat;
    }

    @Override
    public void print() {
        System.out.println("\uD83D\uDC08");
        System.out.println("Мяу");

    }
}