package imaginationfarm.spirit.creature.animal.chineseZodiac;

import java.util.List;

public class Rooster extends ChineseZodiac {
    public void crow(List<ChineseZodiac> animals) {
        this.wakeUp();
        System.out.println("Rooster is crowing.");
        for (ChineseZodiac animal : animals) {
            if (!animal.equals(this)) {
                animal.wakeUp();
                System.out.println(animal.getClass().getSimpleName() + " wakes up.");
            }
        }
    }
}
