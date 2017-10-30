package imaginationfarm.spirit.item.momentoHairSpirit;

public class MonkeyHead {
    private String state = "";

    public void setState(String s){
        System.out.println("MonkeyHead: setState: The monkey's head is turning " + s);
        state = s;
    }

    public String getState(){
        System.out.println("MonkeyHead: getState: The monkey's head is now " + state);
        return state;
    }

    public Pilatory saveHairState(){
        System.out.println("MonkeyHead: saveHairState: The monkey decides to use Pilatory ");
        return new Pilatory(state);
    }

    public void recoverHairState(Pilatory p){
        state = p.getHairState();
    }

}
