package imaginationfarm.spirit.cloths;

import imaginationfarm.abst.cloth.ClothBuilder;

public class Bikini extends ClothBuilder {
    @Override
    public void buildLowerPart() {
        cloth.setTheLowerPart("Bikini Bottom");
    }

    @Override
    public void buildUpperPart() {
        cloth.setTheUpperPart("Bikini Top");
    }

    @Override
    public void buildShoes() {
        cloth.setShoes("Flip-Flops");
    }

}