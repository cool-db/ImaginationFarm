package imaginationfarm.abst.cloth;

public class Cloth {
    private String theUpperPart, theLowerPart, shoes;

    public void setTheUpperPart(String upperPart) {
        this.theUpperPart = upperPart;
    }

    public void setTheLowerPart(String lowerPart) {
        this.theLowerPart = lowerPart;
    }

    public void setShoes(String shoes) {
        this.shoes = shoes;
    }

    public String getShoes() {
        return shoes;
    }

    public String getTheLowerPart() {
        return theLowerPart;
    }

    public String getTheUpperPart() {
        return theUpperPart;
    }
}
