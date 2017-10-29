package IteratorPattern.AbstIter;

import IteratorPattern.IterSpirits.Animals;

public interface Commander {
    Animals next();
    boolean hasNext();
    boolean isEmpty();
}
