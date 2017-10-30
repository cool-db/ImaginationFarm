package imaginationfarm.spirit.charactor;

import imaginationfarm.abst.mediator.Colleague;
import imaginationfarm.abst.mediator.Mediator;
import imaginationfarm.spirit.cloths.Wardrobe;
import imaginationfarm.spirit.creature.animal.chineseZodiac.ChineseZodiac;

public class Farmer extends Colleague {
    private Wardrobe wardrobe;

    public Farmer(Mediator m, Wardrobe wd) {
        super(m);
        wardrobe = wd;
    }

    @Override
    public void getMessage(String message) {
        System.out.println("Farmer get the message: " + message);
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