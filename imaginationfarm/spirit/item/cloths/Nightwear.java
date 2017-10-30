package imaginationfarm.spirit.item.cloths;


public class Nightwear extends ClothBuilder {

    @Override
    public void buildShoes() {
        cloth.setShoes("Slippers");
    }

    @Override
    public void buildUpperPart() {
        cloth.setTheUpperPart("Pyjama Jacket");
    }

    @Override
    public void buildLowerPart() {
        cloth.setTheLowerPart("Pyjama Trousers");
    }
}
