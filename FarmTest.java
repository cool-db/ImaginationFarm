import imaginationfarm.abst.logger.CommonFormatStrategy;
import imaginationfarm.abst.logger.CommonLogAdapter;
import imaginationfarm.abst.logger.Logger;
import imaginationfarm.abst.logger.PrintLogStrategy;
import imaginationfarm.spirit.creature.Animal.AnimalFactory;
import imaginationfarm.spirit.creature.CreatureFactory;
import imaginationfarm.spirit.creature.FactoryProducer;
import imaginationfarm.spirit.item.breakfirst.Meal;
import imaginationfarm.spirit.item.breakfirst.MealBuilder;
import org.testng.annotations.Test;

public class FarmTest {

    @Test
    public void Logger() {
        Logger.addLogAdapter(new CommonLogAdapter());
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
        System.out.println("Total Cost: " +vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " +nonVegMeal.getCost());
    }

}