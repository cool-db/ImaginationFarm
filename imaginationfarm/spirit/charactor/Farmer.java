package imaginationfarm.spirit.charactor;

import imaginationfarm.abst.logger.Logger;
import imaginationfarm.spirit.item.cloths.Wardrobe;
import imaginationfarm.spirit.creature.animal.chineseZodiac.ChineseZodiac;

public class Farmer {
    private Wardrobe wardrobe;

    public Farmer() {
    }

    public Farmer(Wardrobe wd) {
        wardrobe = wd;
    }

    public Wardrobe getWardrobe() {
        return wardrobe;
    }

    public void wear() {
        Logger.i(this.getClass().getSimpleName() + wardrobe.wear());
    }

    public void breedAnimal(ChineseZodiac chineseZodiac) {
        Logger.i("Farmer is breeding a(n) " + chineseZodiac.getClass().getSimpleName());
    }
}