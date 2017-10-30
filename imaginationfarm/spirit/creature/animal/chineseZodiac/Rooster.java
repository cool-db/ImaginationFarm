package imaginationfarm.spirit.creature.animal.chineseZodiac;

import imaginationfarm.abst.logger.Logger;

import java.util.List;

public class Rooster extends ChineseZodiac {
    public void crow(List<ChineseZodiac> animals) {
        this.wakeUp();
        Logger.i("Rooster is crowing.");
        for (ChineseZodiac animal : animals) {
            if (!animal.equals(this)) {
                animal.wakeUp();
                Logger.i(animal.getClass().getSimpleName() + " wakes up.");
            }
        }
    }
}
