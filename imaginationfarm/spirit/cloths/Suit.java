package imaginationfarm.spirit.cloths;


import imaginationfarm.abst.cloth.ClothBuilder;

public class Suit extends ClothBuilder {

    @Override
    public void buildLowerPart() {
        cloth.setTheLowerPart("Suit Pant");
    }

    @Override
    public void buildUpperPart() {
        cloth.setTheUpperPart("Shirt");
    }

    @Override
    public void buildShoes() {
        cloth.setShoes("Leather Shoes");
    }
}
