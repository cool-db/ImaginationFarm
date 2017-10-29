package imaginationfarm.abst.AbstIter;

import imaginationfarm.spirit.IterSpirits.Animals;

public interface Team {
    Commander getCommander();
    boolean add(Animals c);
    boolean remove();
}
