package imaginationfarm.spirit.creature;

import imaginationfarm.spirit.creature.Animal.AnimalFactory;
import imaginationfarm.spirit.creature.Crop.CropFactory;

//抽象工厂模式
public class FactoryProducer {
    public static CreatureFactory getFactory(String type) {
        if (type.equalsIgnoreCase("ANIMAL")) {
            return new AnimalFactory();
        } else if (type.equalsIgnoreCase("CROP")) {
            return new CropFactory();
        }
        return null;
    }
}