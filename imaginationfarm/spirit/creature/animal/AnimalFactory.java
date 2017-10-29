package imaginationfarm.spirit.creature.animal;

import imaginationfarm.spirit.creature.Creature;
import imaginationfarm.spirit.creature.CreatureFactory;
import imaginationfarm.spirit.creature.animal.chineseZodiac.*;
import imaginationfarm.spirit.creature.crop.Crop;

//工厂模式
public class AnimalFactory extends CreatureFactory {
    @Override
    public Creature get(String name) {
        return null;
    }

    @Override
    public Animal getAnimal(String name) {
        switch (name.toLowerCase()) {
            case "rat":
                return new Rat();
            case "ox":
                return new Ox();
            case "tiger":
                return new Tiger();
            case "rabbit":
                return new Rabbit();
            case "dragon":
                return new Dragon();
            case "snake":
                return new Snake();
            case "horse":
                return new Horse();
            case "goat":
                return new Goat();
            case "monkey":
                return new Monkey();
            case "rooster":
                return new Rooster();
            case "dog":
                return new Dog();
            case "pig":
                return new Pig();
            default:
                return new NullAnimal();
        }
    }

    @Override
    public Crop getCrop(String name) {
        return null;
    }
}
