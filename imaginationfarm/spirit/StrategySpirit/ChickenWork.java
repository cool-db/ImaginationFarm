package StrategyPattern.StrategySpirit;

import StrategyPattern.AbstStrategy.AnimalsWorking;

public class ChickenWork implements AnimalsWorking {
    @Override
    public void work() {
        System.out.println("The chicken is laying eggs.");
    }
}
