package imaginationfarm.spirit.activity.girlToPig;

public class Momento {
    private stateCategory state;

    Momento(stateCategory state) {
        this.state = state;
        System.out.println("Momento: state--" + state + " is created");
    }

    public stateCategory getState() {
        return state;
    }

    public void setState(stateCategory state) {
        this.state = state;
    }

}
