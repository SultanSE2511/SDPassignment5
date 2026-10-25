public class MeleeSwordStrategy implements CombatStrategy {
    private final String swordType;

    public MeleeSwordStrategy(String swordType) {
        this.swordType = swordType;
    }

    @Override
    public void executeAttack(String targetEntity, int targetDistance) {
        if (targetDistance > 3) {
            System.out.println("[Melee] " + targetEntity + " is too far (" + targetDistance + " blocks). Closing in with " + swordType + "!");
        }
        System.out.println("[Melee] Striking " + targetEntity + " with " + swordType + " for critical melee damage!");
    }

    @Override
    public String getStrategyName() {
        return "Melee Sword Combat (" + swordType + ")";
    }
}