package com.company;

public class Skeleton extends Boss {

    private  int bullet;

    public int getBullet() {
        return bullet;
    }

    public void setBullet(int bullet) {
        this.bullet = bullet;
    }

    public Skeleton(int health, int damage, int bullet) {
        super(health, damage, bullet);
        this.bullet = bullet;
    }

    public String info (){
        return super.info() + " " + bullet;
    }
}