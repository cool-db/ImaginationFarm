package imaginationfarm.spirit.charactor;

import imaginationfarm.spirit.creature.Animal.*;

import java.util.*;

//单利模式
public enum ChineseZodiac {
    INSTANCE;
    String chineseZodiacList[] = {"rat", "ox", "tiger", "rabbit", "dragon", "snake", "horse", "goat", "monkey", "rooster", "dog", "pig"};
    AnimalFactory animalFactory = new AnimalFactory();
    Map<String, Animal> chineseZodiacs = new HashMap<>();

    ChineseZodiac() {
        for (String chineseZodiac :
                chineseZodiacList) {
            chineseZodiacs.put(chineseZodiac, animalFactory.getAnimal(chineseZodiac));
        }
    }

    public Animal getAnimal(String name) {
        return chineseZodiacs.get(name.toLowerCase());
    }
}