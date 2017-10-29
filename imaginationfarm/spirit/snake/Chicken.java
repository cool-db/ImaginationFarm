package SnakeConfessing;

public class Chicken {
    private Chicken() {System.out.println("Chicken appears.");}
    private static Chicken chicken = new Chicken();
    private boolean healthy = true;

    public void setHealthy(boolean healthy) {
        if(healthy) {
            System.out.println("Chicken turns healthy");
        } else {
            System.out.println("Chicken hurts because of the fight in the farm.");
        }
        this.healthy = healthy;
    }
    public boolean getHealthy() {
        return this.healthy;
    }
    public static Chicken getInstance() {return chicken;}
}
