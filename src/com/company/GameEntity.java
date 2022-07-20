package com.company;

public class GameEntity {

    public int getType() {
        return Health;
    }

    public void setType(int type) {
        this.Health = type;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
    public int getBullet() {
        return bullet;
    }

    public void setBullet(int bullet) {
        this.bullet = bullet;
    }


    public GameEntity(int type, int damage, int bullet) {
        this.Health = type;
        this.damage = damage;
        this.bullet = bullet;
    }

    private int Health;


    private int damage;


    private int bullet;

}