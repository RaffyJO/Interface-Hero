public class Hero extends Character implements IAttacker, ISupporter {

    public Hero(String name, int health, int strength, int durability) {
        super(name, health, strength, durability);
    }

    @Override
    public void attack(Character target) {
        target.health -= strength;
    }

    @Override
    public void heal(Character target) {
        target.health += strength;
    }

}