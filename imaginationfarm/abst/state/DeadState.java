package imaginationfarm.abst.state;

public class DeadState implements State {
    public boolean isAwake () {
        return false;
    }

    public String toString(){
        return "dead";
    }
}