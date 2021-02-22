package com.lab1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class Giraffe implements Animal{

    @Override
    public String name() {
        return "Giraffe";
    }

    @Override
    public String food() {

        return "Food: herbivore";
    }

    @Override
    public String weight() {

        return "Weighs: 800 kg";
    }

    @Override
    public String move() {

        return "Movement: walking";
    }

    @Override
    public String speed() {

        return "Speed: 60 km/h";
    }

    @Override
    public String sound() {

        return "Sound: hum";
    }

    @Override
    public String lifespan() {

        return "Lifespan: 25 years";
    }
}
