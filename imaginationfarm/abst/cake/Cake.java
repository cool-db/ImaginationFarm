package imaginationfarm.abst.cake;

import imaginationfarm.spirit.item.breakfirst.Item;
import imaginationfarm.spirit.item.breakfirst.Packing;
import imaginationfarm.spirit.item.breakfirst.Wrapper;

public abstract class Cake implements Item {

    private static Cake[] _prototypes = new Cake[10];
    private static int _nextSlot = 0;

    @Override
    public String name() {
        return "cake";
    }
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public float price() {
        return 10.0f;
    }

    protected abstract Cake clone();

    protected abstract CakeType returnType();

    protected static void addPrototype(Cake newCake) {
//        System.out.println("cake: addPrototype: " + newCake.returnType() + " prototype is made");
        _prototypes[_nextSlot] = newCake;
        _nextSlot++;
    }

    public static Cake findAndClone(CakeType type) {
        for (int i = 0; i < _nextSlot; i++) {
            if (_prototypes[i].returnType() == type)
                return _prototypes[i].clone();
        }
        return null;
    }

    public abstract void bake();

    protected void finalize() {
//        System.out.println("cake: finalize: destruct");
    }
}


