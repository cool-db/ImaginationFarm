import imaginationfarm.abst.logger.logAdapter.CommonLogAdapter;
import imaginationfarm.abst.logger.Logger;
import imaginationfarm.abst.logger.logAdapter.LogAdapterMaker;
import imaginationfarm.spirit.item.breakfirst.Meal;
import imaginationfarm.spirit.item.breakfirst.MealBuilder;
import org.testng.annotations.Test;

public class FarmTest {

    @Test
    public void Logger() {
        Logger.addLogAdapter(LogAdapterMaker.getCommonLogAdapter());
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