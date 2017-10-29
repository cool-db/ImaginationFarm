package ClothMatching;

public class Dress extends ClothBuilder {

    @Override
    public void buildShoes() {
        cloth.setShoes("High Heels");
    }

    @Override
    public void buildUpperPart() {
        cloth.setTheUpperPart("T-shirt");
    }

    @Override
    public void buildLowerPart() {
        cloth.setTheLowerPart("Skirts");
    }
}
