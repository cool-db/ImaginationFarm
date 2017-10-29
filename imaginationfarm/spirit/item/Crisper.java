package imaginationfarm.spirit.item;

import imaginationfarm.spirit.item.breakfirst.Meal;
import imaginationfarm.spirit.item.breakfirst.Item;


// 备忘录模式

public class Crisper {
    private Meal meal = new Meal();

    public Crisper(Meal meal) {
        this.meal = meal;
    }

    public void addItem(Item item) {
        meal.addItem(item);
    }

    public Meal getMeal() {
        return meal;
    }
}
