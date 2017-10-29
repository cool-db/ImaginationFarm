package imaginationfarm.abst.state;

/**
 * Created by xueyingchen on 2017/10/30.
 */
public enum AnimalState implements State {
    Awake, Sleeping, Dead;

    @Override
    public boolean isAwake() {
        return this.equals(Awake);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
