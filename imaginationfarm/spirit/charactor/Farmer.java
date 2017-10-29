package imaginationfarm.spirit.charactor;

import imaginationfarm.spirit.breed.IBreed;
import imaginationfarm.spirit.creature.animal.chineseZodiac.ChineseZodiac;

public class Farmer implements IBreed {
    @Override
    public void breedAnimal(ChineseZodiac chineseZodiac) {
        System.out.println("Farmer is breeding a(n) "+chineseZodiac.getClass().getSimpleName());
    }
}