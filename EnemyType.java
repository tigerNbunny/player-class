/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package item;

/**
 *
 * @author Minmin
 */
public enum EnemyType {

    KOBOLD(50, 100, 25, 50),
    KOBOLD_WARRIOR(70, 150, 30, 55),
    KOBOLD_ARCHER(90, 200, 40, 60),
    KOBOLD_OVERSEER(150, 250, 50, 75);

    private int base;
    private int variation;
    private int attack;
    private int dropChance;

    EnemyType(int base, int variation, int attack, int dropChance) {
        this.base = base;
        this.variation = variation;
        this.attack = attack;
        this.dropChance = dropChance;
    }

    public int generateHealth() {
        return rand.nextInt(variation) + base;
    }

    public int getAttack() {
        return attack;
    }

    public int getDropChance() {
        return dropChance;
    }

    public String toString() {
        return name().toLowerCase().replace('_', ' ');
    }

}