package imaginationfarm.spirit.Creature.Crop;

import imaginationfarm.spirit.Creature.Animal.Animal;
import imaginationfarm.spirit.Creature.Creature;
import imaginationfarm.spirit.Creature.CreatureFactory;

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
