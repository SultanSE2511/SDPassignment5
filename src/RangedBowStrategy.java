public class RangedBowStrategy implements CombatStrategy {
    private final boolean isEnchantedWithFlame;

    public RangedBowStrategy(boolean isEnchantedWithFlame) {
        this.isEnchantedWithFlame = isEnchantedWithFlame;
    }

    @Override
    public void executeAttack(String targetEntity, int targetDistance) {
        String arrowType = isEnchantedWithFlame ? "flaming arrow" : "standard arrow";
        System.out.println("[Ranged] Drawing bow from " + targetDistance + " blocks away...");
        System.out.println("[Ranged] Shot a " + arrowType + " at " + targetEntity + "!");
    }

    @Override
    public String getStrategyName() {
        return "Ranged Bow Combat" + (isEnchantedWithFlame ? " (Flame I)" : "");
    }
}
