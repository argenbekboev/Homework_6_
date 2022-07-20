package com.company;

public class Main {

    public static void main(String[] args) {

        Boss boss = new Boss(500,100,10);
        boss.weapons.setWeapons("Firearms");
        boss.weapons.setWeaponsName(": Grenade Launcher: ");
        System.out.println(boss.info());

        Skeleton skeleton = new Skeleton(350,60,30);
        skeleton.weapons.setWeapons("Machine-1");
        skeleton.weapons.setWeaponsName(": AK-47: ");
        System.out.println(skeleton.info());

        Skeleton skeleton2 = new Skeleton(350, 75,45);
        skeleton2.weapons.setWeapons("Machine-2");
        skeleton2.weapons.setWeaponsName(": RPK-74: ");
        System.out.println(skeleton2.info());

    }
}



