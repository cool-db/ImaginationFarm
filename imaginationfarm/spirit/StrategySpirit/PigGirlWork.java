package StrategyPattern.StrategySpirit;

import StrategyPattern.AbstStrategy.AnimalsWorking;

public class PigGirlWork implements AnimalsWorking {
    @Override
    public void work() {
        System.out.println("The pig girl is making up.");
    }
}
