import java.util.Objects;

public class MinecraftPlayer {
    private final String username;
    private CombatStrategy combatStrategy;

    public MinecraftPlayer(String username, CombatStrategy initialStrategy) {
        this.username = username;
        this.combatStrategy = Objects.requireNonNull(initialStrategy, "Strategy cannot be null");
    }

    public void setCombatStrategy(CombatStrategy newStrategy) {
        System.out.println("\n[Player] " + username + " switched strategy to: " + newStrategy.getStrategyName());
        this.combatStrategy = Objects.requireNonNull(newStrategy, "Strategy cannot be null");
    }

    public void attack(String targetEntity, int distance) {
        System.out.println(">>> " + username + " engages " + targetEntity + " at " + distance + " blocks.");
        combatStrategy.executeAttack(targetEntity, distance);
    }
}