package imaginationfarm.spirit.StrategySpirit;


import imaginationfarm.abst.AbstStrategy.AnimalsWorking;

public class MouseWork implements AnimalsWorking {
    @Override
    public void work() {
        System.out.println("The mouse is burrowing.");
    }
}
