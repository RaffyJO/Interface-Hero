public class Main {
    public static void main(String[] args) {

        Hero hero = new Hero("John Doe", 100, 50, 20);
        Monster monster = new Monster("Slime", 50, 20, 10);

        // Hero menyerang monster
        hero.attack(monster);

        // Monster menyerang hero
        monster.attack(hero);

        // Hero menyembuhkan monster
        hero.heal(monster);

        // Monster menerima damage dari hero
        monster.takeLessDamage(10);

        System.out.println("Health hero: " + hero.getHealth());
        System.out.println("Health monster: " + monster.getHealth());
    }
}
