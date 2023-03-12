package com.example.java_pro_homework_7;

import com.example.java_pro_homework_7.Pet.Animals;
import com.example.java_pro_homework_7.Pet.Cat;
import com.example.java_pro_homework_7.Pet.Dog;

public class Main {
    public static void main(String[] args) {

        Animals vasya = new Cat("Vasya", "black", "Sybir");
        Animals jorik = new Cat("Jorik", "wight", "british");
        Animals barsik = new Dog("Barsik", "orange", "Shiba-inu");
        Animals lord = new Dog("Lord", "wight", "Dog");
        jorik.setGetDistanceSwim(10);
        lord.setDistanceRun(10000);
        jorik.setDistanceRun(500);


        System.out.println(vasya);
        System.out.println(jorik);

        System.out.println(lord);

        System.out.println("Total Cats: "+Cat.totalCat);
        System.out.println("Total Dogs: "+Dog.totalDog);
        System.out.println("Total Animals: "+(Cat.totalCat+Dog.totalDog));



    }

}

