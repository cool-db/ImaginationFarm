package imaginationfarm.abst.state;

public class SleepingState implements State {
    public boolean isAwake () {
        return false;
    }

    public String toString(){
        return "sleeping";
    }
}