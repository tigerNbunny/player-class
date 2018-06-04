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
public class Enemy {

    private int health;
    private final int attack;
    private final EnemyType Etype;

    Enemy(int health, int attack, EnemyType Etype) {
        this.health = health;
        this.attack = attack;
        this.Etype = type;
    }

    public int getHealth() {
        return health;
    }

    public void takeDamage(int damage) {
        health -= damage;
    }

    public int getAttack() {
        return attack;
    }

    public int getDropChance() {
        return Etype.getDropChance();
    }

    public EnemyType getType() {
        return Etype;
    }

    public boolean hasHealth() {
        return health > 0;
    }
  private static Enemy spawn() {
        EnemyType[] enemies = EnemyType.values();
        EnemyType Etype = enemies[rand.nextInt(enemies.length)];
        return new Enemy(type.generateHealth(), type.getAttack(), type);
    }

    public String fetchName() {
        return Etype.toString();
    }
}
