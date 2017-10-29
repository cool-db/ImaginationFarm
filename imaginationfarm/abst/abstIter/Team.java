package imaginationfarm.abst.abstIter;

import imaginationfarm.spirit.IterSpirits.Animals;

public interface Team {
    Commander getCommander();
    boolean add(Animals c);
    boolean remove();
}
