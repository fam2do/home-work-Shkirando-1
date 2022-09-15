package com.company;

public class Warrior {
    protected String name;
    protected int damage;
    protected int hp;
    public Warrior(){
        name = "";
        damage =0;
        hp = 0;
    }
    public Warrior(String name, int damage, int hp){
        this.name = name;
        this.damage = damage;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
    public boolean isAlive(){return  hp > 0;}
    public void takeHit(Warrior war2){
        this.setHp(this.getHp() - war2.getDamage());

    }

}
