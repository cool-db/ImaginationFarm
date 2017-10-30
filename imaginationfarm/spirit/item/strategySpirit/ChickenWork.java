package imaginationfarm.spirit.item.strategySpirit;


import imaginationfarm.abst.abstStrategy.AnimalsWorking;

public class ChickenWork implements AnimalsWorking {
    @Override
    public void work() {
        System.out.println("The chicken is laying eggs.");
    }
}
