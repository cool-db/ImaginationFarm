package imaginationfarm.spirit.item.cloths;

abstract public class ClothBuilder {

    protected Cloth cloth;

    abstract public void buildUpperPart();

    abstract public void buildLowerPart();

    abstract public void buildShoes();

    public String lookAtMirror() {
        return " put on " + cloth.getTheUpperPart() + ", " + cloth.getTheLowerPart() + " and " + cloth.getShoes() + ".";
    }

    public Cloth getCloth() {
        return cloth;
    }

    public void pickOutfits() {
        cloth = new Cloth();
    }
}
