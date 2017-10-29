package imaginationfarm.abst.state;

public class AwakeState implements State {
    public boolean isAwake () {
        return true;
    }

    public String toString(){
        return "awake";
    }
}