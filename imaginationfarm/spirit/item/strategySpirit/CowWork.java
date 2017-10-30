package imaginationfarm.spirit.item.strategySpirit;


import imaginationfarm.abst.abstStrategy.AnimalsWorking;

public class CowWork implements AnimalsWorking {
    @Override
    public void work() {
        System.out.println("The cow is ploughing.");
    }
}
