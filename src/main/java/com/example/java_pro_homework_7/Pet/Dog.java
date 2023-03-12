package com.example.java_pro_homework_7.Pet;

public class Dog extends Animals {

    public Dog(String name, String color, String breed) {
        super(name, color, breed);
        totalDog();


    }


    static public int totalDog;
    static public int totalDog() {
        totalDog++;
        return totalDog;
    }

    @Override
    public int getDistanceRun() {
        return super.getDistanceRun();
    }

    @Override
    public int getGetDistanceSwim() {
        return super.getGetDistanceSwim();
    }

    @Override
    public void setGetDistanceSwim(int distanceSwim) {
        super.setGetDistanceSwim(distanceSwim);
    }

    @Override
    public int getAmountAnimal() {
        return super.getAmountAnimal();
    }

    @Override
    public void setAmountAnimal(int amountAnimal) {
        super.setAmountAnimal(amountAnimal);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
