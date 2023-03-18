package com.example.java_pro_homework_7.Pet;

public class Cat extends Animal {

    public static int catsCounter;


    public Cat(String name, String color, String breed) {
        super(name, color, breed);
        limitDistanceSwim = 0;
        limitDistanceRun = 200;
        catsCounter++;
        getCatsCounter();

    }


    public static int getCatsCounter() {

        return catsCounter;
    }

    public void swim(int distance) {
        setDistanceSwim(limitDistanceSwim);
    }

    @Override
    protected void setDistanceSwim(int distanceSwim) {
        if (distanceSwim < limitDistanceSwim) {
            this.distanceSwim = limitDistanceSwim;
        } else {
            this.distanceSwim = distanceSwim;
        }
        System.out.println(name + ", не плаває! Коти не плавають!");
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
