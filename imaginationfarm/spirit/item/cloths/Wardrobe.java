package imaginationfarm.spirit.item.cloths;

import imaginationfarm.abst.logger.Logger;

//单例模式衣柜，即builder中的director
public class Wardrobe {

    private Wardrobe() {
        Logger.i("Wardrobe opened.");
    }

    private static final Wardrobe wardrobe = new Wardrobe();

    protected ClothBuilder cBuilder;

    public void setcBuilder(ClothBuilder cBuilder) {
        this.cBuilder = cBuilder;
    }

    public Cloth getCloth() {
        return cBuilder.getCloth();
    }

    public String wear() {
        cBuilder.pickOutfits();
        cBuilder.buildLowerPart();
        cBuilder.buildShoes();
        cBuilder.buildUpperPart();
        return cBuilder.lookAtMirror();
    }

    public static Wardrobe getInstance() {
        return wardrobe;
    }
}
