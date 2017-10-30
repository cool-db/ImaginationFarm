package imaginationfarm.spirit.charactor;

import imaginationfarm.abst.logger.Logger;
import imaginationfarm.spirit.item.cloths.Wardrobe;
import imaginationfarm.abst.mediator.Colleague;
import imaginationfarm.abst.mediator.Mediator;
import imaginationfarm.spirit.creature.animal.chineseZodiac.ChineseZodiac;

public class Farmer extends Colleague {
    private Wardrobe wardrobe;

    public Farmer(Mediator m, Wardrobe wd) {
        super(m);
        wardrobe = wd;
    }

    public Farmer(Mediator m) {
        super(m);
    }

    @Override
    public void getMessage(String message) {
        Logger.i("Farmer get the message: " + message);
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