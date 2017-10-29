package imaginationfarm.abst.abstIter;

import imaginationfarm.spirit.IterSpirits.Animals;

public interface Commander {
    Animals next();
    boolean hasNext();
    boolean isEmpty();
}
