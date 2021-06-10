package com.company;

public class Magic_door {

    public Hero[] heroes() {

        Hero hero = new Hero(100, 50, 70,"Gerakl");
        Hero hero1 = new Hero(80, 60, 50, "Ahiles");
        Hero hero2 = new Hero(90, 50, 20, "Paseidon");
        Hero hero3 = new Hero(85, 100, 10, "Akula");

        Hero[] array = {hero, hero1, hero2, hero3};

        return array;
    }

}
