public class Monster extends Character implements IAttacker, IDefender {

    public Monster(String name, int health, int strength, int durability) {
        super(name, health, strength, durability);
    }

    @Override
    public void attack(Character target) {
        System.out.println("Monster menyerang " + target.name);
        target.health -= strength;
        target.info();
    }

    @Override
    public void takeLessDamage(int damage) {
        health -= damage / 2;
        info();
    }

    @Override
    public void info() {
        System.out.println("=== Monster Stat ===");
        System.out.println("Name        : " + this.name);
        System.out.println("Health      : " + this.health);
        System.out.println("Strength    : " + this.strength);
        System.out.println("Durability  : " + this.durability);
        System.out.println();
    }
}