public interface CombatStrategy {
    void executeAttack(String targetEntity, int targetDistance);
    String getStrategyName();
}
