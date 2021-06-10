package com.company;

public class Hero {
    private int health;
    private int damage;
    private int superSkill;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hero(int health, int damage, int superSkill, String name) {
        this.health = health;
        this.damage = damage;
        this.superSkill = superSkill;
        this.name = name;
    }

    public Hero(int health, int damage, int superSkill) {
        this.health = health;
        this.damage = damage;
        this.superSkill = superSkill;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getSuperSkill() {
        return superSkill;
    }

    public void setSuperSkill(int superSkill) {
        this.superSkill = superSkill;
    }
}
