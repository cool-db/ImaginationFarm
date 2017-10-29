import imaginationfarm.abst.logger.Logger;
import imaginationfarm.abst.logger.logAdapter.LogAdapterMaker;
import imaginationfarm.spirit.activity.Activity;
import imaginationfarm.spirit.activity.Party;
import imaginationfarm.spirit.charactor.Farmer;
import imaginationfarm.spirit.creature.animal.chineseZodiac.*;
import imaginationfarm.spirit.item.*;
import imaginationfarm.spirit.item.breakfirst.Meal;
import imaginationfarm.spirit.item.breakfirst.MealBuilder;
import imaginationfarm.story.bakeCake.BakeCake;
import org.testng.annotations.Test;

public class FarmTest {

    @Test
    public void Logger() {
        Logger.addLogAdapter(LogAdapterMaker.getPrettyDiskLogAdapter());
        Logger.d("debug");
        Logger.e("error");
        Logger.w("warning");
        Logger.v("verbose");
        Logger.i("information");
        Logger.wtf("wtf!!!!");
    }

    @Test
    public void Breakfirst() {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());

        Refridgerator r = new Refridgerator();
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
    public static void TestBakeCake() {
        BakeCake bCake = new BakeCake();
        bCake.bakeCake();
    }

    @Test
    public static void TestBreed(){
        Farmer farmer=new Farmer();
        farmer.breedAnimal(new Dog());
    }

    @Test
    public static void TestActivity(){
        Activity activity = new Party();
        activity.play();
    }

    @Test
    public static void TestComposite(){
        ChineseZodiac CEO = new Dragon();
        ChineseZodiac headSales = new Dog();
        ChineseZodiac headMarketing = new Goat();
        ChineseZodiac clerk = new Horse();
        ChineseZodiac salesExecutive = new Monkey();
        CEO.add(headSales);
        CEO.add(headMarketing);
        headSales.add(salesExecutive);
        headMarketing.add(clerk);

        System.out.println(CEO);
        for (ChineseZodiac headEmployee : CEO.getSubordinates()) {
            System.out.println(headEmployee);
            for (ChineseZodiac employee : headEmployee.getSubordinates()) {
                System.out.println(employee);
            }
        }
    }
}