package imaginationfarm.spirit.creature.animal;

import imaginationfarm.spirit.creature.Creature;
import imaginationfarm.abst.state.*;

public class Animal implements Creature {
    private AnimalState state = AnimalState.Sleeping;

    // 状态模式

    private boolean setState(AnimalState fs, AnimalState ts) {
        if (state.equals(ts)) {
            return true;
        }

        if (state.equals(fs)) {
            state = ts;
            return true;
        }
        return false;
    }

    public boolean wakeUp() {
        return setState(AnimalState.Sleeping, AnimalState.Awake);
    }

    public boolean sleep() {
        return setState(AnimalState.Awake, AnimalState.Sleeping);
    }

    public boolean die() {
        return setState(AnimalState.Awake, AnimalState.Dead) || setState(AnimalState.Sleeping, AnimalState.Dead);
    }

    public AnimalState getState() {
        return state;
    }
}