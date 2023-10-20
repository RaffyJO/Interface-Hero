public class Main {
    public static void main(String[] args) {

        Hero hero = new Hero("John Doe", 100, 50, 20);
        Monster monster = new Monster("Slime", 150, 20, 10);

        System.out.println("Stat awal:");
        hero.info();
        monster.info();

        // Hero menyerang monster
        hero.attack(monster);

        // Monster menyerang hero
        monster.attack(hero);

        // Hero menyembuhkan Hero
        hero.heal(hero);

        System.out.println("Health hero: " + hero.getHealth());
        System.out.println("Health monster: " + monster.getHealth());
    }
}
