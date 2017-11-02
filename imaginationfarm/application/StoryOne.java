package imaginationfarm.application;

import imaginationfarm.abst.logger.Logger;
import imaginationfarm.spirit.item.cakes.Cake;
import imaginationfarm.abst.interpret.BinaryExpression;
import imaginationfarm.abst.interpret.NumberExpression;
import imaginationfarm.abst.interpret.OpExpressionEnum;
import imaginationfarm.abst.mediator.ConcreteMediator;
import imaginationfarm.spirit.activity.*;
import imaginationfarm.spirit.charactor.Farmer;
import imaginationfarm.spirit.charactor.SuColleague;
import imaginationfarm.spirit.charactor.SuperVisor;
import imaginationfarm.spirit.item.cloths.Suit;
import imaginationfarm.spirit.item.cloths.Wardrobe;
import imaginationfarm.spirit.creature.animal.AnimalFactory;
import imaginationfarm.spirit.creature.animal.chineseZodiac.*;
import imaginationfarm.spirit.item.Crisper;
import imaginationfarm.spirit.item.Refrigerator;
import imaginationfarm.spirit.item.breakfirst.Meal;
import imaginationfarm.spirit.place.FarmForVisitor;
import imaginationfarm.spirit.place.FarmVisitor;
import imaginationfarm.story.action.CheckStateAction;
import imaginationfarm.story.action.VisitAction;
import imaginationfarm.story.bakeCake.BakeCake;
import org.testng.annotations.Test;

import java.util.ArrayList;

/**
 * Created by xueyingchen on 2017/10/30.
 */

public class StoryOne {

    private ArrayList<ChineseZodiac> getAnimalList(AnimalFactory af) {
        ArrayList<ChineseZodiac> cz = new ArrayList<>();
        String names[] = {"rat", "ox", "tiger", "rabbit", "dragon", "snake", "horse", "goat", "monkey", "rooster", "dog", "pig"};
        for (String name : names) {
            cz.add((ChineseZodiac) af.getAnimal(name));
        }
        return cz;
    }


    @Test
    public void test() {

        /**
         * 装饰器模式
         * 迭代器模式
         * 过滤器模式
         * 适配器模式
         * 外观模式
         * 策略模式
         */
        Logger.i("One day begins.");

        /**
         * 访问器模式
         */
        FarmForVisitor farm = new FarmForVisitor();

        /**
         * 工厂模式
         * 抽象工程模式
         * 空对象模式
         */
        ActivityFactory acf = new ActivityFactory();
        AnimalFactory af = new AnimalFactory();
        /**
         * 单例模式
         */
        Rooster rooster = (Rooster) af.getAnimal("rooster");

        /**
         * 迭代器模式
         */
        ArrayList<ChineseZodiac> czArrList = getAnimalList(af);

        /**
         * 状态模式
         */
        rooster.crow(czArrList);

        /**
         * 建造者模式
         * 单例模式
         */
        Wardrobe wardrobe = Wardrobe.getInstance();
        wardrobe.setcBuilder(new Suit());


        /**
         * 中介者模式
         * 代理模式
         */
        ConcreteMediator chatRoom = new ConcreteMediator();
        Farmer farmer = new Farmer(chatRoom, wardrobe);
        SuColleague suColleague = new SuColleague(chatRoom);
        SuperVisor superVisor = new SuperVisor("pig", suColleague);

        chatRoom.init(farmer, suColleague);

        /**
         * 中介者模式
         */
        farmer.contact("Pig, you are super admin");
        superVisor.contact("OK, I get it");

        superVisor.addSuperVisor((Pig) czArrList.get(11));

        /**
         * 桥接模式
         */
        farmer.breedAnimal(rooster);

        /**
         * 访问者模式
         * 观察者模式
         */
        FarmVisitor fvFarmer = new FarmVisitor();
        fvFarmer.setSubject(farmer.getClass().getSimpleName());
        fvFarmer.visit(farm.getCanteen());

        for (ChineseZodiac cz : czArrList) {
            superVisor.addObserver(cz);
        }

        /**
         * 观察者模式
         */
        superVisor.announce("The farmer has left.");
        superVisor.announce(new VisitAction(farm.getCanteen()));

        /**
         * 原型模式
         */
        Meal breakfast = new Meal();
        BakeCake cakes = new BakeCake();
        cakes.bakeCake();
        for (Cake cake : cakes.getCakes()) {
            breakfast.addItem(cake);
        }

        /**
         * 工厂模式
         * 享元模式
         * 模板模式
         */
        BreakFast bfa = (BreakFast) acf.getActivity("breakfast");
        bfa.setMeal(breakfast);
        bfa.play();

        /**
         * 备忘录模式
         */
        Crisper breakfastCrisper = new Crisper(breakfast);
        Refrigerator refrigerator = new Refrigerator();
        refrigerator.addCrisper(breakfastCrisper);

        /**
         * 解释器模式
         * 装饰器模式
         */
        OpExpressionEnum plus = OpExpressionEnum.PlusExpression;
        int result = new BinaryExpression(new NumberExpression(8), plus, new NumberExpression(2)).interpret();
        Logger.i("Two hours later, the time is " + result + " am");

        /**
         * 迭代器模式
         */
        Monkey monkey = (Monkey) czArrList.get(8);
        Goat goat = (Goat) czArrList.get(7);
        Rat rat = (Rat) czArrList.get(0);

        /**
         * 组合模式
         */
        superVisor.getSuperVisor().addSubordinates(monkey);
        superVisor.getSuperVisor().addSubordinates(goat);

        /**
         * 命令模式
         */
        VisitAction morningOrder = new VisitAction(farm.getPlayground(), "grow crops");
        superVisor.getSuperVisor().getSubordinates().forEach(item -> item.takeOrder(morningOrder));

        /**
         * 访问器模式
         */
        FarmVisitor fvSuperVisor = new FarmVisitor();
        fvSuperVisor.setSubject(superVisor.getSuperVisor().getClass().getSimpleName());
        fvSuperVisor.visit(farm.getDormitory());

        /**
         * 迭代器模式
         */
        superVisor.getSuperVisor().getSubordinates().forEach(ChineseZodiac::placeOrders);

        superVisor.getSuperVisor().sleep();

        CheckStateAction csa = new CheckStateAction(superVisor.getSuperVisor(), monkey);

        /**
         * 命令模式
         */
        goat.takeOrder(csa);
        goat.placeOrders();

        /**
         * 访问者模式
         */
        FarmVisitor fvGoat = new FarmVisitor();
        fvGoat.setSubject(goat.getClass().getSimpleName());
        fvGoat.visit(farm.getCanteen());

        /**
         * 备忘录模式
         */
        Meal snacks = refrigerator.getCrisper(0).getMeal();
        snacks.showItems();

        /**
         * 责任链模式
         */
        goat.getCr().addNextNotifier(monkey);
        monkey.getCr().addNextNotifier(rooster);
        monkey.getCr().addNextNotifier(rat);
        rat.getCr().addNextNotifier(superVisor.getSuperVisor());
        superVisor.getSuperVisor().wakeUp();
        goat.getCr().notify("The food in the refrigerator is not fresh.");

    }
}
