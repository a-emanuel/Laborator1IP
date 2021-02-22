package com.lab1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class Penguin implements Animal{

    @Override
    public String name() {
        return "Penguin";
    }

    @Override
    public String food() {

        return "Food: carnivore";
    }

    @Override
    public String weight() {

        return "Weighs: 1.5 – 23 kg";
    }

    @Override
    public String move() {

        return "Movement: tobogganing";
    }

    @Override
    public String speed() {

        return "Speed: 6 – 9 km/h";
    }

    @Override
    public String sound() {

        return "Sound: honk";
    }

    @Override
    public String lifespan() {

        return "Lifespan: 6-20 years";
    }
}
