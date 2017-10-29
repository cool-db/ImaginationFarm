package imaginationfarm.spirit.StrategySpirit;


import imaginationfarm.abst.AbstStrategy.AnimalsWorking;

public class PigGirlWork implements AnimalsWorking {
    @Override
    public void work() {
        System.out.println("The pig girl is making up.");
    }
}
