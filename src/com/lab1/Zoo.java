package com.lab1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Zoo {

    public static void main(String[] args) {
        ArrayList<Building> buildings = new ArrayList<Building>();
        //create 3 buildings
        Building buildingA = new Building("Building A");
        Building buildingB = new Building("Building B");
        Building buildingC = new Building("Building C");

        buildings.add(buildingA);
        buildings.add(buildingB);
        buildings.add(buildingC);

        //create animals
        Bear b1 = new Bear(), b2 = new Bear(), b3 = new Bear(), b4 = new Bear();
        Penguin p1 = new Penguin(), p2 = new Penguin(), p3 = new Penguin(), p4 = new Penguin();
        Giraffe g1 = new Giraffe(), g2 = new Giraffe(), g3 = new Giraffe();

        //add animals to building A
        buildings.get(0).addAnimal(b1);
        buildings.get(0).addAnimal(p1);
        buildings.get(0).addAnimal(g1);

        //add animals to building B
        buildings.get(1).addAnimal(b2);
        buildings.get(1).addAnimal(b3);
        buildings.get(1).addAnimal(p2);
        buildings.get(1).addAnimal(p3);

        //add animals to building C
        buildings.get(2).addAnimal(b4);
        buildings.get(2).addAnimal(p4);
        buildings.get(2).addAnimal(g2);
        buildings.get(2).addAnimal(g3);

        //display the info for every animal from every building
        emptyFile();
        for (Building b : buildings) {
            b.infoAnimal();
        }

        //remove a penguin from building B and print the result
        buildings.get(1).removeAnimal(p3);
        buildings.get(1).infoAnimal();
    }

    public static void emptyFile() {
        //empty the file of the previous runs data
        try {
            PrintWriter file = new PrintWriter(new FileOutputStream(("zoo.txt")));
            file.close();
        } catch (IOException e) {
            System.out.println("File error");
        }
    }
}
