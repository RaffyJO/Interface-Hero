public class Monster extends Character implements IAttacker, IDefender {

    public Monster(String name, int health, int strength, int durability) {
        super(name, health, strength, durability);
    }

    @Override
    public void attack(Character target) {
        target.health -= strength;
    }

    @Override
    public void takeLessDamage(int damage) {
        health -= damage / 2;
    }

}