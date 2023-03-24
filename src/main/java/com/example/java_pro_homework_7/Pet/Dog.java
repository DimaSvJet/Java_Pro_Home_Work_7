package com.example.java_pro_homework_7.Pet;

public class Dog extends Animal {

    private static int dogCounter;

    public Dog(String name, String color, String breed) {
        super(name, color, breed);
        this.setLimitDistanceSwim(10);
        this.setLimitDistanceRun(500);
        dogCounter++;
    }

    public static int getDogCounter() {

        return dogCounter;
    }

    @Override
    public void swim(int distanceSwim) {
        if (distanceSwim <= getLimitDistanceSwim()) {
            super.swim(distanceSwim);
        } else {
            System.out.println("Нажаль, " + getName() + " здатен пропливти лише " + getLimitDistanceSwim() + " м");
        }

    }

    @Override
    public void run(int distanceRun) {
        if (distanceRun <= getLimitDistanceRun()) {
            super.swim(distanceRun);
        } else {
            System.out.println("Нажаль, " + getName() + " здатен пробігти лише " + getLimitDistanceRun() + " м");
        }
    }
}
