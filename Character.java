public abstract class Character {

    protected String name;
    protected int health;
    protected int strength;
    protected int durability;

    public Character(String name, int health, int strength, int durability) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.durability = durability;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getStrength() {
        return strength;
    }

    public int getDurability() {
        return durability;
    }

    public abstract void info();
}