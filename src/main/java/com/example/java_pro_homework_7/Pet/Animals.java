package com.example.java_pro_homework_7.Pet;

import com.example.java_pro_homework_7.Main;

public class Animals {

    String name;
    String color;
    String breed;

    protected int distanceRun;
    protected int distanceSwim;
    int limitDistanceRun;
    int limitDistanceSwim;
    private int amountAnimal;

    public Animals(String name, String color, String breed) {
        this.name = name;
        this.color = color;
        this.breed = breed;
        this.limitDistanceRun = 500;
        this.limitDistanceSwim = 10;
        this.distanceRun = 0;
        this.distanceSwim = 0;
        this.amountAnimal = getAmountAnimal()+1;


    }


    public int getDistanceRun() {
        return distanceRun;
    }

    public void setDistanceRun(int distanceRun) {
        if (distanceRun > limitDistanceRun) {
            this.distanceRun = limitDistanceRun;
            System.out.println(name + ", пробіг дистанцію "+limitDistanceRun+" м.");}
        else {
            this.distanceRun = distanceRun;
            System.out.println(name + ", пробіг дистанцію " + distanceRun + " м.");
        }
    }

    public int getGetDistanceSwim() {
        return distanceSwim;
    }

    public void setGetDistanceSwim(int distanceSwim) {
        if (distanceSwim > limitDistanceSwim) {
            this.distanceSwim = limitDistanceSwim;
        } else {this.distanceSwim = distanceSwim;}
        System.out.println(name + ", проплив дистанцію "+distanceSwim+" м.");
    }

    public int getAmountAnimal() {
        return amountAnimal;
    }

    public void setAmountAnimal(int amountAnimal) {
        this.amountAnimal = amountAnimal;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", breed='" + breed + '\'' +
                ", distanceRun=" + distanceRun +
                ", distanceSwim=" + distanceSwim +
                ", limitDistanceRun=" + limitDistanceRun +
                ", limitDistanceSwim=" + limitDistanceSwim +
                ", amountAnimal=" + amountAnimal +
                '}';
    }
}
