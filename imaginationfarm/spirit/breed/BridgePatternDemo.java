public class BridgePatternDemo {
    //Bridge Pattern
    public static void main(String[] args) {
        Animal duck = new Fowl("Amy", "CTO", 1, 500, new Duck());

        duck.breed();
    }
}