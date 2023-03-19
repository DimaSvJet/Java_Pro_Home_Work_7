package com.example.java_pro_homework_7.Pet;

public class Dog extends Animal {

    private static int dogCounter;

    public Dog(String name, String color, String breed) {
        super(name, color, breed);
        limitDistanceSwim = 10;
        limitDistanceRun = 500;
        dogCounter++;
    }

     public static int getDogCounter() {

        return dogCounter;
    }

    @Override
    public void swim(int distanceSwim) {
        if (distanceSwim <= limitDistanceSwim) {
            super.swim(distanceSwim);
        } else {
            System.out.println("Нажаль, " + name + " здатен пропливти лише " + limitDistanceSwim + " м");
        }

    }

    @Override
    public void run(int distanceRun) {
        if (distanceRun <= limitDistanceRun) {
            super.swim(distanceRun);
        } else {
            System.out.println("Нажаль, " + name + " здатен пробігти лише " + limitDistanceRun + " м");
        }
    }
}
