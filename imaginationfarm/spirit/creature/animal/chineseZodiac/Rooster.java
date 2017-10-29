package imaginationfarm.spirit.creature.animal.chineseZodiac;

import imaginationfarm.spirit.creature.animal.Animal;

public class Rooster extends ChineseZodiac {
    public void crow(ChineseZodiac[] animals) {
        this.wakeUp();
        System.out.println("Rooster is crowing.");
        for (ChineseZodiac animal: animals) {
            if (animal.getClass() != this.getClass()) {
                animal.wakeUp();
                System.out.println(animal.getClass().getName() + "wakes up.");
            }
        }
    }
}
