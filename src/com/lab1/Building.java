package com.lab1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Building {
    String name;
    //constructor
    Building(String n){
        name = n;
    }

    //the array with animals from the current building
    ArrayList<Animal> animals = new ArrayList<Animal>();

    public void addAnimal(Animal a) {
        this.animals.add(a);
    }

    public void removeAnimal(Animal a) {
        this.animals.remove(a);
    }

    public void infoAnimal(Animal a) {
        try {
            PrintWriter file = new PrintWriter(new FileOutputStream(("zoo.txt"),true));
            file.println(a.name());
            file.println(a.food());
            file.println(a.weight());
            file.println(a.move());
            file.println(a.speed());
            file.println(a.sound());
            file.println(a.lifespan());
            file.println("--------------------------");
            file.close();
        } catch (IOException e) {
            System.out.println("File error");
        }
    }

    public void infoAnimal() {
        try {
            PrintWriter file = new PrintWriter(new FileOutputStream(("zoo.txt"),true));
            file.println("**************************" + this.name + "**************************");
            file.println("This building contains " + animals.size() + " animals: ");
            file.println("--------------------------");
            file.close();
        } catch (IOException e) {
            System.out.println("File error");
        }
        for (Animal a : animals) {
            infoAnimal(a);
        }
    }
}
