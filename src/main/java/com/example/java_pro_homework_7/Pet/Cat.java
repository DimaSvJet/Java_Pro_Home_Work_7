package com.example.java_pro_homework_7.Pet;

public class Cat extends Animal {

    private static int catsCounter;


    public Cat(String name, String color, String breed) {
        super(name, color, breed);
        this.setLimitDistanceRun(200);
        catsCounter++;
    }

    public static int getCatsCounter() {

        return catsCounter;
    }


    public void swim(int distance) {
        System.out.println(getName() + ", не плаває! Коти не плавають!");
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
