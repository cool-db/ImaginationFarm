package AbstractFactory;

import AbstractFactory.AbstProducts.*;

public class AbstractFactoryDemo {

    public void produce(){
        System.out.println("=====================Animal Factory Products=====================");

        System.out.println("------------------Product Eggs------------------");
        Eggs e = new Eggs("egg");
        e.use();
        System.out.println("-----------------------------------------------");

        System.out.println("------------------Product Wig------------------");
        Wig w = new Wig("wig");
        w.use();
        System.out.println("-----------------------------------------------");

        System.out.println("------------------Product AllMilk------------------");
        System.out.println("SheepFactory and CowFactory are producing milk: ");
        GoatMilk g = new GoatMilk("goat milk");
        Milk m = new Milk("milk");
        g.use();
        m.use();
        System.out.println("-----------------------------------------------");

        System.out.println("------------------Product Fur------------------");
        System.out.println("RabbitFactory and SheepFactory are producing fur: ");
        RabbitFur r = new RabbitFur("rabbit fur");
        Woolen wo = new Woolen("woolen");
        r.use();
        wo.use();
        System.out.println("-----------------------------------------------");

        System.out.println("------------------Product Meat------------------");
        System.out.println("CowFactory, SheepFactory and PigFactory are producing meat: ");
        Beaf b = new Beaf("beaf");
        Lamb l = new Lamb("lamb");
        Pork p = new Pork("pork");
        b.use();
        l.use();
        p.use();
        System.out.println("-----------------------------------------------");

    }

    public static void main(String[] args){
        AbstractFactoryDemo a = new AbstractFactoryDemo();
        a.produce();
    }
}
