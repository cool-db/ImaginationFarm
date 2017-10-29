package imaginationfarm.spirit.StrategySpirit;


import imaginationfarm.abst.AbstStrategy.AnimalsWorking;

public class ChickenWork implements AnimalsWorking {
    @Override
    public void work() {
        System.out.println("The chicken is laying eggs.");
    }
}
