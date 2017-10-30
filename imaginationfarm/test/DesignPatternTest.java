package imaginationfarm.test;

import imaginationfarm.spirit.charactor.ChineseZodiacs;
import imaginationfarm.spirit.charactor.SuperVisor;
import imaginationfarm.spirit.creature.animal.AnimalFactory;
import imaginationfarm.spirit.creature.CreatureFactory;
import imaginationfarm.spirit.creature.FactoryProducer;
import imaginationfarm.spirit.creature.animal.chineseZodiac.ChineseZodiac;
import imaginationfarm.spirit.item.breakfirst.Meal;
import imaginationfarm.spirit.item.breakfirst.MealBuilder;
import imaginationfarm.spirit.creature.animal.chineseZodiac.*;
import imaginationfarm.story.action.ChargeAction;
import org.testng.Assert;
import org.testng.annotations.Test;
import imaginationfarm.spirit.creature.animal.*;

public class DesignPatternTest {

    @Test
    public void Factory() {
        AnimalFactory animalFactory = new AnimalFactory();
        System.out.println(animalFactory.getAnimal("rat"));
        System.out.println(animalFactory.getAnimal("rat"));
    }

    @Test
    public void AbstractFactory() {
        CreatureFactory animalFactory = FactoryProducer.getFactory("animal");
        System.out.println(animalFactory.getAnimal("rat"));
        System.out.println(animalFactory.getAnimal("rat"));
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

    }

    @Test
    public void Adapter() {

    }

    @Test
    public void Bridge() {

    }

    @Test
    public void Filter() {

    }

    @Test
    public void Composite() {

    }

    @Test
    public void Decorator() {

    }

    @Test
    public void Facade() {

    }

    @Test
    public void Flyweight() {

    }

    @Test
    public void Proxy() {
        AnimalFactory animalFactory = new AnimalFactory();
        SuperVisor superVisor = new SuperVisor("father");
        superVisor.addSuperVisor((ChineseZodiac)animalFactory.getAnimal("rat"));
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
        dog.getCr().notify("hello");
        System.out.println("end");
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

    }

    @Test
    public void Iterator() {

    }

    @Test
    public void Mediator() {

    }

    @Test
    public void Memento() {

    }

    @Test
    public void Observer() {

    }

    @Test
    public void State() {

    }

    @Test
    public void NullObject() {

    }

    @Test
    public void Strategy() {

    }

    @Test
    public void Template() {

    }

    @Test
    public void Visitor() {

    }
}