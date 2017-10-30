package imaginationfarm.spirit.charactor;

import imaginationfarm.spirit.cloths.Wardrobe;
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
        System.out.println(this.getClass().getSimpleName() + wardrobe.wear());
    }

    public void breedAnimal(ChineseZodiac chineseZodiac) {
        System.out.println("Farmer is breeding a(n) " + chineseZodiac.getClass().getSimpleName());
    }
}