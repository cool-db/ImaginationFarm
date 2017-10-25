package imaginationfarm.spirit.Creature;

import imaginationfarm.spirit.Creature.Animal.Animal;
import imaginationfarm.spirit.Creature.Crop.Crop;

//抽象工厂模式
public abstract class CreatureFactory {
    public abstract Creature get(String name);

    public abstract Animal getAnimal(String name);

    public abstract Crop getCrop(String name);
}
