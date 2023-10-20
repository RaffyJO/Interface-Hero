public class Hero extends Character implements IAttacker, ISupporter {

    public Hero(String name, int health, int strength, int durability) {
        super(name, health, strength, durability);
    }

    @Override
    public void attack(Character target) {
        if (target instanceof Monster) {
            ((Monster) target).takeLessDamage(strength);
        }
        target.health -= strength;
        target.info();
    }

    @Override
    public void heal(Character target) {
        System.out.println("Player heal " + target.name);
        if (target.health < 100 && target.health > 0) {
            target.health += strength;
            if (target.health >= 100) {
                target.health = 100;
            }
        }
        target.info();
    }

    @Override
    public void info() {
        System.out.println("=== Player Stat ===");
        System.out.println("Name        : " + this.name);
        System.out.println("Health      : " + this.health);
        System.out.println("Strength    : " + this.strength);
        System.out.println("Durability  : " + this.durability);
        System.out.println();
    }
}