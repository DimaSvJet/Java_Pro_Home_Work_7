package com.example.java_pro_homework_7.Pet;

public class Cat extends Animals {

    public Cat(String name, String color, String breed) {
        super(name, color, breed);
        limitDistanceSwim = 0;
        limitDistanceRun = 200;

        totalCat();


    }

    static public int totalCat;
    static public int totalCat() {
        totalCat++;
        return totalCat;
    }

    public void swim(int distance){
        setGetDistanceSwim(0);
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
        if (distanceSwim > limitDistanceSwim) {
            this.distanceSwim = limitDistanceSwim;
        } else {this.distanceSwim = distanceSwim;}
        System.out.println(name + ", не плаває! Коти не плавають!");
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
