package imaginationfarm.test;

import imaginationfarm.abst.container.Iterator;
import imaginationfarm.abst.logger.Logger;
import imaginationfarm.abst.logger.formatStrategy.CommonFormatStrategy;
import imaginationfarm.abst.logger.formatStrategy.FormatStrategy;
import imaginationfarm.abst.logger.formatStrategy.FormatStrategyMaker;
import imaginationfarm.abst.logger.formatStrategy.PrettyFormatStrategy;
import imaginationfarm.abst.logger.logAdapter.CommonLogAdapter;
import imaginationfarm.abst.logger.logAdapter.LogAdapter;
import imaginationfarm.abst.logger.logAdapter.PrettyDiskLogAdapter;
import imaginationfarm.abst.interpret.BinaryExpression;
import imaginationfarm.abst.interpret.NumberExpression;
import imaginationfarm.abst.interpret.OpExpressionEnum;
import imaginationfarm.abst.logger.Logger;
import imaginationfarm.abst.logger.printer.LoggerPrinterTimeDecorator;
import imaginationfarm.abst.mediator.ConcreteMediator;
import imaginationfarm.spirit.activity.ActivityFactory;
import imaginationfarm.spirit.activity.BreakFast;
import imaginationfarm.spirit.activity.Party;
import imaginationfarm.spirit.charactor.Farmer;
import imaginationfarm.spirit.charactor.ChineseZodiacs;
import imaginationfarm.spirit.charactor.ChineseZodiacsList;
import imaginationfarm.spirit.charactor.SuColleague;
import imaginationfarm.spirit.charactor.SuperVisor;
import imaginationfarm.spirit.creature.animal.AnimalFactory;
import imaginationfarm.spirit.creature.CreatureFactory;
import imaginationfarm.spirit.creature.FactoryProducer;
import imaginationfarm.spirit.creature.animal.chineseZodiac.ChineseZodiac;
import imaginationfarm.spirit.item.Crisper;
import imaginationfarm.spirit.item.Refrigerator;
import imaginationfarm.spirit.item.breakfirst.Meal;
import imaginationfarm.spirit.item.breakfirst.MealBuilder;
import imaginationfarm.spirit.creature.animal.chineseZodiac.*;
import imaginationfarm.spirit.item.cakes.Cake;
import imaginationfarm.spirit.place.FarmForVisitor;
import imaginationfarm.spirit.place.FarmVisitor;
import imaginationfarm.story.action.ChargeAction;
import imaginationfarm.story.bakeCake.BakeCake;
import org.testng.Assert;
import org.testng.annotations.Test;
import imaginationfarm.spirit.creature.animal.*;

public class DesignPatternTest {

    @Test
    public void Factory() {
        AnimalFactory animalFactory = new AnimalFactory();
        assert animalFactory.getAnimal("rat") != null;
    }

    @Test
    public void AbstractFactory() {
        CreatureFactory animalFactory = FactoryProducer.getFactory("animal");
        assert animalFactory != null;
        assert animalFactory.getAnimal("rat") != null;
    }

    @Test
    public void Singleton() {
        Assert.assertTrue(ChineseZodiacs.INSTANCE.getChineseZodiac("rat") == ChineseZodiacs.INSTANCE.getChineseZodiac("rat"));
    }

    @Test
    public void Builder() {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " + nonVegMeal.getCost());
    }

    @Test
    public void Prototype() {
        Meal breakfast = new Meal();
        BakeCake cakes = new BakeCake();
        cakes.bakeCake();
        for (Cake cake : cakes.getCakes()) {
            breakfast.addItem(cake);
        }
    }

    @Test
    public void Adapter() {
        Logger.addLogAdapter(new PrettyDiskLogAdapter());
        Logger.i("pretty format in disk");

        Logger.addLogAdapter(new CommonLogAdapter());
        Logger.i("common format on console");
    }

    @Test
    public void Bridge() {
        ConcreteMediator chatRoom = new ConcreteMediator();
        Farmer farmer = new Farmer(chatRoom);
        farmer.breedAnimal(new Dog());
    }

    @Test
    public void Filter() {
        FormatStrategy formatStrategy = FormatStrategyMaker.getPrettyFormatStrategy();
        Logger.addLogAdapter(new CommonLogAdapter(formatStrategy));
        Logger.setLogType(false, true, false, true, true, true);
        Logger.enableBuffer(true);
        Logger.v("disabled");
        Logger.d("enabled");
        Logger.i("disabled");
        Logger.w("enabled");
        Logger.e("enabled");
        Logger.sync();
    }

    @Test
    public void Composite() {
        ChineseZodiac CEO = new Dragon();
        ChineseZodiac headSales = new Dog();
        ChineseZodiac headMarketing = new Goat();
        ChineseZodiac clerk = new Horse();
        ChineseZodiac salesExecutive = new Monkey();
        CEO.addSubordinates(headSales);
        CEO.addSubordinates(headMarketing);
        headSales.addSubordinates(salesExecutive);
        headMarketing.addSubordinates(clerk);

        System.out.println(CEO);
        for (ChineseZodiac headEmployee : CEO.getSubordinates()) {
            System.out.println(headEmployee);
            for (ChineseZodiac chineseZodiac : headEmployee.getSubordinates()) {
                System.out.println(chineseZodiac);
            }
        }
    }

    @Test
    public void Decorator() {
        Logger.printer(new LoggerPrinterTimeDecorator());
        Logger.i("Time!");
    }

    @Test
    public void Facade() {
        FormatStrategy formatStrategy = FormatStrategyMaker.getPrettyFormatStrategy();
        Logger.addLogAdapter(new CommonLogAdapter(formatStrategy));

        Logger.i("Pretty Print");

    }

    @Test
    public void Flyweight() {
        ActivityFactory acf = new ActivityFactory();
        Party party = (Party) acf.getActivity("party");
        party.play();
        Party party1 = (Party) acf.getActivity("party");
        party1.play();
    }

    @Test
    public void Proxy() {
        AnimalFactory animalFactory = new AnimalFactory();
        SuperVisor superVisor = new SuperVisor("father");
        superVisor.addSuperVisor((ChineseZodiac) animalFactory.getAnimal("rat"));
        System.out.println(superVisor.getSuperVisor().getClass().getSimpleName());
    }

    @Test
    public void ChainofResponsibility() {
        Dog dog = new Dog();
        Goat goat = new Goat();
        Ox ox = new Ox();
        Rat rat = new Rat();

        dog.wakeUp();
        goat.wakeUp();
        ox.wakeUp();
        rat.wakeUp();
        dog.getCr().addNextNotifier(goat);
        goat.getCr().addNextNotifier(ox);
        goat.getCr().addNextNotifier(rat);
        dog.getCr().notify("test");
    }

    @Test
    public void Command() {

        Dog dog = new Dog();
        Goat goat = new Goat();
        Ox ox = new Ox();
        Rat rat = new Rat();

        dog.wakeUp();
        goat.wakeUp();
        ox.wakeUp();
        rat.wakeUp();

        ChargeAction chargeAction = new ChargeAction(goat, "bad");
        dog.takeOrder(chargeAction);
        dog.placeOrders();

    }

    @Test
    public void Interpreter() {
        OpExpressionEnum plus = OpExpressionEnum.PlusExpression;
        int result = new BinaryExpression(new NumberExpression(8), plus, new NumberExpression(2)).interpret();
        Logger.i("Two hours later, the time is " + result + " am");
    }

    @Test
    public void Iterator() {
        for (Iterator iter = ChineseZodiacsList.INSTANCE.getIterator(); iter.hasNext(); ) {
            String name = (String) iter.next();
            System.out.println("Name : " + name);
        }
    }

    @Test
    public void Mediator() {
        ConcreteMediator chatRoom = new ConcreteMediator();
        Farmer farmer = new Farmer(chatRoom);
        SuColleague suColleague = new SuColleague(chatRoom);
        SuperVisor superVisor = new SuperVisor("pig", suColleague);
        superVisor.addSuperVisor(new Pig());
        chatRoom.init(farmer, suColleague);
        farmer.contact("Pig, you are super admin");
        superVisor.contact("OK, I get it");
    }

    @Test
    public void Memento() {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());

        Refrigerator r = new Refrigerator();
        Crisper c = new Crisper(vegMeal);
        r.addCrisper(c);

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " + nonVegMeal.getCost());

        nonVegMeal = r.getCrisper(0).getMeal();
        nonVegMeal.showItems();
    }

    @Test
    public void Observer() {
        ConcreteMediator chatRoom = new ConcreteMediator();
        SuColleague suColleague = new SuColleague(chatRoom);
        SuperVisor superVisor = new SuperVisor("pig", suColleague);
        superVisor.addSuperVisor(new Pig());
        superVisor.addObserver(new Rat());
        superVisor.addObserver(new Dragon());
        superVisor.announce("hi");
    }

    @Test
    public void State() {
        Rat rat = new Rat();
        Logger.i(rat.getState().toString());
        rat.wakeUp();
        Logger.i(rat.getState().toString());
        rat.die();
        Logger.i(rat.getState().toString());
    }

    @Test
    public void NullObject() {
        AnimalFactory animalFactory = new AnimalFactory();
        Logger.i(animalFactory.getAnimal("duck").getClass().getSimpleName());
    }

    @Test
    public void Strategy() {
        FormatStrategy formatStrategy = PrettyFormatStrategy.newBuilder().build();
        Logger.addLogAdapter(new CommonLogAdapter(formatStrategy));

        Logger.i("Pretty Print");

        Logger.clearLogAdapters();

        FormatStrategy formatStrategy2 = new CommonFormatStrategy();
        Logger.addLogAdapter(new CommonLogAdapter(formatStrategy2));
        Logger.i("Common Print");

    }

    @Test
    public void Template() {
        ActivityFactory acf = new ActivityFactory();
        Party party = (Party) acf.getActivity("party");
        party.play();
    }

    @Test
    public void Visitor() {
        ConcreteMediator chatRoom = new ConcreteMediator();
        Farmer farmer = new Farmer(chatRoom);
        FarmForVisitor farm = new FarmForVisitor();
        FarmVisitor fvFarmer = new FarmVisitor();
        fvFarmer.setSubject(farmer.getClass().getSimpleName());
        fvFarmer.visit(farm.getCanteen());
    }
}