package com.example.java_pro_homework_7.Pet;

public abstract class Animal {

    static int animalCounter;
    String name;
    String color;
    String breed;
    int limitDistanceRun;
    int limitDistanceSwim;
    protected int distanceRun;
    protected int distanceSwim;

    public Animal(String name, String color, String breed) {
        this.name = name;
        this.color = color;
        this.breed = breed;
        this.animalCounter++;

    }


    public int getDistanceRun() {
        return distanceRun;
    }

    protected void setDistanceRun(int distanceRun) {
        }

    public int getDistanceSwim() {
        return distanceSwim;
    }

    protected void setDistanceSwim(int distanceSwim) {

    }

    static int getAnimalCounter() {
        return animalCounter;
    }

    public void swim (int distanceSwim) {
        System.out.println(name + ", проплив дистанцію "+distanceSwim+" м.");
    }

    public void run (int distanceRun){
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
