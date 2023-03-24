package com.example.java_pro_homework_7.Pet;

public abstract class Animal {

    static int animalCounter;
    private int distanceRun;
    private int distanceSwim;
    private String name;
    private String color;
    private String breed;
    private int limitDistanceRun;
    private int limitDistanceSwim;


    public Animal(String name, String color, String breed) {
        this.name = name;
        this.color = color;
        this.breed = breed;
        this.animalCounter++;
        this.limitDistanceSwim = 0;
        this.limitDistanceRun = 0;

    }

    public void setLimitDistanceRun(int limitDistanceRun) {
        this.limitDistanceRun = limitDistanceRun;
    }

    public int getDistanceRun() {
        return distanceRun;
    }

    protected void setDistanceRun(int distanceRun) {
        this.distanceRun = distanceRun;
    }

    public int getDistanceSwim() {
        return distanceSwim;
    }

    protected void setDistanceSwim(int distanceSwim) {
        this.distanceSwim = distanceSwim;
    }

    public static void setAnimalCounter(int animalCounter) {
        Animal.animalCounter = animalCounter;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }


    public void setLimitDistanceSwim(int limitDistanceSwim) {
        this.limitDistanceSwim = limitDistanceSwim;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getBreed() {
        return breed;
    }

    public int getLimitDistanceRun() {
        return limitDistanceRun;
    }

    public int getLimitDistanceSwim() {
        return limitDistanceSwim;
    }

    public static int getAnimalCounter() {
        return animalCounter;
    }

    public void swim(int distanceSwim) {
        System.out.println(name + ", проплив дистанцію " + distanceSwim + " м.");
    }

    public void run(int distanceRun) {
        System.out.println(name + ", пробіг дистанцію " + distanceRun + " м.");

    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", breed='" + breed + '\'' +
                ", distanceRun=" + distanceRun +
                ", distanceSwim=" + distanceSwim +
                ", limitDistanceRun=" + limitDistanceRun +
                ", limitDistanceSwim=" + limitDistanceSwim +
                ", animalCounter=" + animalCounter +
                '}';
    }
}
