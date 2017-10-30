package imaginationfarm.spirit.item.momentoHairSpirit;

public class Pilatory {
    private String hairState = "";

    public Pilatory(String state){
        System.out.println("Pilatory: pilatory: The monkey's head is " + state + " before using pilatory");
        hairState = state;
    }

    public String getHairState(){
        return hairState;
    }

}
