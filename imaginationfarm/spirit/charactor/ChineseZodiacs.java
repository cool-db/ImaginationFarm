package imaginationfarm.spirit.charactor;

import imaginationfarm.spirit.creature.animal.*;
import imaginationfarm.spirit.creature.animal.chineseZodiac.ChineseZodiac;

import java.util.*;

//单利模式
public enum ChineseZodiacs {
    INSTANCE;
    String chineseZodiacList[] = {"rat", "ox", "tiger", "rabbit", "dragon", "snake", "horse", "goat", "monkey", "rooster", "dog", "pig"};
    AnimalFactory animalFactory = new AnimalFactory();
    Map<String, ChineseZodiac> chineseZodiacs = new HashMap<>();

    ChineseZodiacs() {
        for (String chineseZodiac :
                chineseZodiacList) {
            chineseZodiacs.put(chineseZodiac, (ChineseZodiac)animalFactory.getAnimal(chineseZodiac));
        }
    }

    public ChineseZodiac getChineseZodiac(String name) {
        return chineseZodiacs.get(name.toLowerCase());
    }
}