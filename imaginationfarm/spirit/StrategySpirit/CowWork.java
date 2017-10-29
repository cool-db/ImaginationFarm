package imaginationfarm.spirit.StrategySpirit;


import imaginationfarm.abst.AbstStrategy.AnimalsWorking;

public class CowWork implements AnimalsWorking {
    @Override
    public void work() {
        System.out.println("The cow is ploughing.");
    }
}
