package imaginationfarm.spirit.activity;

import imaginationfarm.abst.logger.Logger;
import imaginationfarm.spirit.item.breakfirst.Meal;

public class BreakFast extends Activity {
    private Meal meal;

    public void setMeal(Meal meal) {
        this.meal = meal;
    }

    @Override
    void startPlay() {
        Logger.i("Breakfast starts! Today's breakfast has: ");
        meal.showItems();
    }

    @Override
    void endPlay() {
        Logger.i("Breakfast ends!");
    }
}