package imaginationfarm.spirit.activity.girlToPig;

//originator
public class GirlState {
    private GirlState(stateCategory state) {
        this.state = state;
        showGirlState();
    }
    private static final GirlState girlState = new GirlState(stateCategory.Girl);
    private stateCategory state;

    //girlState Singleton
    static public GirlState getGirlState() {
        return girlState;
    }

    public void setState(stateCategory state) {
        this.state = state;
    }

    public stateCategory getState() {
        return state;
    }

    public Momento createMomento() {return new Momento(state);}

    public void showGirlState() {System.out.println("Now, the girl is a " + state);}

    public void resumeMomento(Momento momento) {this.state = momento.getState();}
}
