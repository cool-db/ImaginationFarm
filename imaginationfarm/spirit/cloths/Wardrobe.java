package imaginationfarm.spirit.cloths;

import imaginationfarm.abst.cloth.Cloth;
import imaginationfarm.abst.cloth.ClothBuilder;

//单例模式衣柜，即builder中的director
public class Wardrobe {

    private Wardrobe(){System.out.println("Wardrobe opened.");};
    private static final Wardrobe wardrobe = new Wardrobe();

    protected ClothBuilder cBuilder;

    public void setcBuilder(ClothBuilder cBuilder) {
            this.cBuilder = cBuilder;
        }

    public Cloth getCloth() {
            return cBuilder.getCloth();
        }

    public void wear() {
        cBuilder.pickOutfits();
        cBuilder.buildLowerPart();
        cBuilder.buildShoes();
        cBuilder.buildUpperPart();
        cBuilder.lookAtMirror();
    }

    public static Wardrobe getInstance() {return wardrobe;}
}
