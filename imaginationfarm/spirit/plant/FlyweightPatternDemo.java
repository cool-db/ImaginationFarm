public class FlyweightPatternDemo {
    //Flyweight Pattern
    private static final String strains[] = { "Spring", "Autumn" };
    public static void main(String[] args) {

        for(int i=0; i < 20; ++i) {
            Wheat wheat =
                    (Wheat) CropFactory.getWheat(getRandomStrain());
            circle.setSurviveRate(getRandomSurviveRate());
            circle.setHeight(getRandomHeight());
            circle.plant();
        }
    }
    private static String getRandomStrain() {
        return strains[(int)(Math.random() * 2)];
    }
    private static double getRandomSurviveRate() {
        return Math.random();
    }

    private static int getRandomHeight() {
        return (int)(Math.random() * 41)+60;
    }
}