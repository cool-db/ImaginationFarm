package imaginationfarm.spirit.creature.Crop;

import imaginationfarm.spirit.creature.Animal.Animal;
import imaginationfarm.spirit.creature.Creature;
import imaginationfarm.spirit.creature.CreatureFactory;

//工厂模式
public class CropFactory extends CreatureFactory {

    @Override
    public Creature get(String name) {
        return null;
    }

    @Override
    public Animal getAnimal(String name) {
        return null;
    }

    @Override
    public Crop getCrop(String name) {
        switch (name.toLowerCase()) {
            case "rye":
                return new Rye();
            case "wheat":
                return new Wheat();
        }
        return null;
    }
}
