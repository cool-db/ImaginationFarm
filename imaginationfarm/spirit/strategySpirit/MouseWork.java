package imaginationfarm.spirit.strategySpirit;


import imaginationfarm.abst.abstStrategy.AnimalsWorking;

public class MouseWork implements AnimalsWorking {
    @Override
    public void work() {
        System.out.println("The mouse is burrowing.");
    }
}
