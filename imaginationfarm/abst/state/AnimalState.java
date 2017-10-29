package imaginationfarm.abst.state;

/**
 * Created by xueyingchen on 2017/10/30.
 */
public enum AnimalState implements State {
    Awake("Awake"), Sleeping("Sleeping"), Dead("Dead");
    String type = "";

    AnimalState(String type) {
        this.type = type;
    }

    @Override
    public boolean isAwake() {
        return this.equals(Awake);
    }

    @Override
    public String toString() {
        return type;
    }
}
