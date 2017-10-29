package imaginationfarm.spirit.creature;

import imaginationfarm.spirit.creature.animal.Animal;
import imaginationfarm.spirit.creature.crop.Crop;

//抽象工厂模式
public abstract class CreatureFactory {
    public abstract Creature get(String name);

    public abstract Animal getAnimal(String name);

    public abstract Crop getCrop(String name);
}
