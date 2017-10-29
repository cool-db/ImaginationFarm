package imaginationfarm.spirit.plant;

public class Wheat implements Crop {
    private String strain;
    private double surviveRate;
    private int height;

    public Wheat(String strain){
        this.strain = strain;
    }

    public void setSurviveRate(double surviveRate) {
        this.surviveRate = surviveRate;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void plant() {
        System.out.println("Wheat: Plant() [Strain : " + strain + ", Survive Rate : " + surviveRate +", Height :" + height);
    }
}