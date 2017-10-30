package imaginationfarm.spirit.activity;

import imaginationfarm.spirit.item.breakfirst.Meal;

public class BreakFast extends Activity {
    private Meal meal;

    public void setMeal(Meal meal) {
        this.meal = meal;
    }

    @Override
    void startPlay() {
        System.out.println("Breakfast starts! Today's breakfast has: ");
        meal.showItems();
    }

    @Override
    void endPlay() {
        System.out.println("Breakfast ends!");
    }
}