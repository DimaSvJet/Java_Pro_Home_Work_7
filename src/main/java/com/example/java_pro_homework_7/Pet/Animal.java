package com.example.java_pro_homework_7.Pet;

public abstract class Animal {

    String name;
    String color;
    String breed;
    int limitDistanceRun;
    int limitDistanceSwim;
    protected int distanceRun;
    protected int distanceSwim;
    private int animalCounter;

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

            System.out.println(name + ", пробіг дистанцію " + distanceRun + " м.");
        }

    public int getDistanceSwim() {
        return distanceSwim;
    }

    protected void setDistanceSwim(int distanceSwim) {
        System.out.println(name + ", проплив дистанцію "+distanceSwim+" м.");
    }

    public int getAnimalCounter() {
        return animalCounter;
    }

    public void setAnimalCounter(int animalCounter) {
        this.animalCounter = animalCounter;
    }

    public void swim (int distanceSwim) {

        setDistanceSwim(distanceSwim);
    }

    public void run (int distanceRun){
        setDistanceRun(distanceRun);
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
