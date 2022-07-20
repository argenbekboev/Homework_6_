package com.company;

public class Boss extends GameEntity {

    Weapons weapons = new Weapons();

    public Boss(int health, int damage, int bullet) {
        super(health, damage, bullet);

    }

    public Weapons getWeaponType() {
        return weapons;
    }

    public void setWeaponType(Weapons weaponType) {
        this.weapons = weaponType;
    }

    public String info (){
        return  getType() + getDamage() + getBullet() + weapons.getWeaponsName() + getWeaponType() ;
    }
}