package com.company;

import java.util.ArrayList;

public class DogKennel {
    public static void main(String[] args) {
        ArrayList<String> offSpring = new ArrayList<String>();
        //TODO:
        // lav en ny hund
        Dog myDog = new Dog("woodie", true);
        // sæt en ejer
        myDog.setOwner("Henning");
        // TODO: tilføj to hvalpe når hundeklassen er klar til hvalpe
        myDog.setOffSpring("woodiesnoopie");
        myDog.setOffSpring("woodiesfido");

        // print alle hvalpe
        ArrayList<String> myOff = myDog.getOffSpring();
        for (String myD: myOff) {
            System.out.println(myD);
        }

        // print ejeren
        System.out.println("min hund er ejet af " + myDog.getOwner());
        // TODO: fodr hunden når hundeklassen er modificeret så den kan fodres
        String resString = myDog.feedDog();
        System.out.println(resString);
    }

}