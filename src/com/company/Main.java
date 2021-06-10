package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {


        Magic_door door = new Magic_door();


        for (int i = 0; i < door.heroes().length; i++) {

            System.out.println(door.heroes()[i].getDamage()+ " " + door.heroes()[i].getName());

        }

        


    }
}
