package StrategyPattern;

import AbstractFactory.AbstProducts.Chicken;
import StrategyPattern.StrategySpirit.ChickenWork;
import StrategyPattern.StrategySpirit.CowWork;
import StrategyPattern.StrategySpirit.MouseWork;
import StrategyPattern.StrategySpirit.PigGirlWork;
import org.omg.CORBA.PUBLIC_MEMBER;

public class AnimalJobs {

    public void Animalworks(){
        System.out.println("=====================Animal are working=====================");

        System.out.println("------------------Chicken------------------");
        ChickenWork c = new ChickenWork();
        c.work();
        System.out.println("-------------------------------------------");

        System.out.println("------------------Cow----------------------");
        CowWork cow = new CowWork();
        c.work();
        System.out.println("-------------------------------------------");

        System.out.println("------------------Mouse--------------------");
        MouseWork m = new MouseWork();
        m.work();
        System.out.println("-------------------------------------------");

        System.out.println("------------------PigGirl------------------");
        PigGirlWork p = new PigGirlWork();
        p.work();
        System.out.println("-------------------------------------------");

    }

    public static void main(String[] args){
        AnimalJobs a = new AnimalJobs();
        a.Animalworks();
    }

}
