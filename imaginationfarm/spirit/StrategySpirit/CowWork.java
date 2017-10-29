package StrategyPattern.StrategySpirit;

import StrategyPattern.AbstStrategy.AnimalsWorking;

public class CowWork implements AnimalsWorking {
    @Override
    public void work() {
        System.out.println("The cow is ploughing.");
    }
}
