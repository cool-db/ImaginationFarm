package imaginationfarm.story;

import imaginationfarm.abst.abstNullPattern.AllEggs;
import imaginationfarm.spirit.item.abstProducts.Eggs;

public class LayingEggs {
    public void layEggs(){
        System.out.println("=====================Chicken Factory Products=====================");
        System.out.println("The hen is able to lay two kinds of eggs.");
        System.out.println("------------------Fertilized Eggs------------------");
        Eggs fe = new Eggs(true);
        AllEggs FE = fe.getEggs();
        FE.isFertilized();
        System.out.println("------------------Other Eggs------------------");
        Eggs oe = new Eggs();
        AllEggs OE = oe.getEggs();
        OE.isFertilized();
        System.out.println("==================================================================");
    }

    public static void main(String[] args){
        LayingEggs l = new LayingEggs();
        l.layEggs();
    }
}
