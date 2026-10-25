public class Main {
    public static void main(String[] args) {

        CombatStrategy diamondSword = new MeleeSwordStrategy("Diamond Sword");
        CombatStrategy flameBow = new RangedBowStrategy(true);
        CombatStrategy harmPotion = new StealthSplashPotionStrategy("Harming II");


        MinecraftPlayer steve = new MinecraftPlayer("Steve", diamondSword);


        steve.attack("Zombie", 2);


        steve.setCombatStrategy(flameBow);
        steve.attack("Skeleton", 15);


        steve.setCombatStrategy(harmPotion);
        steve.attack("Wither", 5);
    }
}