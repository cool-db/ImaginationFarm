public class BridgePatternDemo {
    public static void main(String[] args) {
        Animal duck = new Fowl(1, 500, new Duck());

        duck.breed();
    }
}

//Bridge Pattern