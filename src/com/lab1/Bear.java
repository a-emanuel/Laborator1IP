package com.lab1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class Bear implements Animal {

    @Override
    public String name() {
        return "Bear";
    }

    @Override
    public String food() {

        return "Food: omnivore";
    }

    @Override
    public String weight() {

        return "Weighs: 80 – 600 kg";
    }

    @Override
    public String move() {

        return "Movement: lumbers";
    }

    @Override
    public String speed() {

        return "Speed: 40 km/h";
    }

    @Override
    public String sound() {

        return "Sound: growls";
    }

    @Override
    public String lifespan() {

        return "Lifespan: 20 years";
    }
}
