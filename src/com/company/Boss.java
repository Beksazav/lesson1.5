package com.company;

public class Boss {
    private int health;
    private int damage;
    private int deffenceType;

    public Boss(){

    }

    public Boss(int health, int damage, int deffenceType) {
        this.health = health;
        this.damage = damage;
        this.deffenceType = deffenceType;
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

    public int getDeffenceType() {
        return deffenceType;
    }

    public void setDeffenceType(int deffenceType) {
        this.deffenceType = deffenceType;
    }

    public void changeDeffenceType (int deffenceType){
        this.deffenceType = deffenceType;
    }
}
