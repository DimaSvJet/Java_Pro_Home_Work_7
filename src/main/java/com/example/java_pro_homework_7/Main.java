package com.example.java_pro_homework_7;

import com.example.java_pro_homework_7.Pet.Animal;
import com.example.java_pro_homework_7.Pet.Cat;
import com.example.java_pro_homework_7.Pet.Dog;

public class Main {
    public static void main(String[] args) {

        Animal vasya = new Cat("Vasya", "black", "Sybir");
        Animal jorik = new Cat("Jorik", "wight", "british");
        Animal barsik = new Dog("Barsik", "orange", "Shiba-inu");
        Animal lord = new Dog("Lord", "wight", "Dog");
        Animal sharik = new Dog("Sharik","black", "lockal");
        System.out.println(vasya);
        System.out.println(jorik);
        System.out.println(barsik);
        System.out.println(lord);


        jorik.swim(10);
        lord.run(10000);
        jorik.run(500);
        lord.swim(1000);






        System.out.println("Total Cats: "+Cat.getCatsCounter());
        System.out.println("Total Dogs: "+Dog.getDogCounter());
        System.out.println("Total Animals: "+(Cat.getCatsCounter()+Dog.getDogCounter()));



    }

}

