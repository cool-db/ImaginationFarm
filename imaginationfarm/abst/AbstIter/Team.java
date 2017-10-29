package IteratorPattern.AbstIter;

import IteratorPattern.IterSpirits.Animals;

public interface Team {
    Commander getCommander();
    boolean add(Animals c);
    boolean remove();
}
