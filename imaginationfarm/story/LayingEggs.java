package NullObjectPattern;

import AbstractFactory.AbstProducts.Eggs;
import NullObjectPattern.AbstNullPattern.AllEggs;
import NullObjectPattern.NullPatternSpirit.FertilizedEggs;

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
