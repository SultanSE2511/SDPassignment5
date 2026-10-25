public class StealthSplashPotionStrategy implements CombatStrategy {
    private final String potionType;

    public StealthSplashPotionStrategy(String potionType) {
        this.potionType = potionType;
    }

    @Override
    public void executeAttack(String targetEntity, int targetDistance) {
        System.out.println("[Stealth] Sneaking up to " + targetEntity + " silently...");
        System.out.println("[Stealth] Threw Splash Potion of " + potionType + " causing area of effect damage!");
    }

    @Override
    public String getStrategyName() {
        return "Stealth Splash Potion Combat (" + potionType + ")";
    }
}
