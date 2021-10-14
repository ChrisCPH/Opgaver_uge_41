package com.company;

import java.util.ArrayList;
import java.util.Calendar;

public class Dog {
    private Owner owner;
    private ArrayList<String> offSpring;
    boolean isHungry = true;

    public String feedDog() {
        if (isHungry == true) {
            isHungry = false;
            return "Dog has now eaten";
        }
        return "Dog is not hungry";
    }

    public Dog(ArrayList<String> offSpring, boolean isHungry) {
        this.offSpring = offSpring;
        this.isHungry = isHungry;
    }

    public ArrayList<String> getOffSpring() {
        return offSpring;
    }

    public void setOffSpring(ArrayList<String> offSpring) {
        this.offSpring = offSpring;
    }
}


